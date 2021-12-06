package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    Concert concert = new Concert();
    Person person1 = new Person(new Ticket("Tool", LocalDateTime.of(2020, 1, 1, 18, 0), 20000));
    Person person2 = new Person(new FrontOfStageTicket("Tool", LocalDateTime.of(2020, 1, 1, 18, 0), 20000, "999999"));

    @Test
    void testAddAttendee() {
        concert.addAttendee(person1, LocalTime.of(17, 0));
        concert.addAttendee(person2, LocalTime.of(16, 0));
        assertEquals(2, concert.getAttendees().size());
    }

    @Test
    void testAddAttendeeTooEarly() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> concert.addAttendee(person1, LocalTime.of(16, 59)));
        assertEquals("Cannot enter before ticket entry time!", e.getMessage());
        e = assertThrows(IllegalArgumentException.class, () -> concert.addAttendee(person2, LocalTime.of(15, 59)));
        assertEquals("Cannot enter before ticket entry time!", e.getMessage());
    }
}
