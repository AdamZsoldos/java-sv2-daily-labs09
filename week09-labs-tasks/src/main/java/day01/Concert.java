package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    private final List<Person> attendees = new ArrayList<>();

    public List<Person> getAttendees() {
        return attendees;
    }

    public void addAttendee(Person attendee, LocalTime entryTime) {
        validateAttendee(attendee, entryTime);
        attendees.add(attendee);
    }

    private void validateAttendee(Person attendee, LocalTime entryTime) {
        LocalTime startTime = attendee.getTicket().getEntryTime();
        if (entryTime.isBefore(startTime)) {
            throw new IllegalArgumentException("Cannot enter before ticket entry time!");
        }
    }
}
