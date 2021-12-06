package day01;

public class Person {

    private final Ticket ticket;

    public Person(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
