package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

    private final String artistName;
    private final LocalDateTime showDateTime;
    private final int ticketPrice;

    public Ticket(String artistName, LocalDateTime showDateTime, int ticketPrice) {
        this.artistName = artistName;
        this.showDateTime = showDateTime;
        this.ticketPrice = ticketPrice;
    }

    public String getArtistName() {
        return artistName;
    }

    public LocalDateTime getShowDateTime() {
        return showDateTime;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public LocalTime getEntryTime() {
        return showDateTime.toLocalTime().minusHours(1);
    }
}
