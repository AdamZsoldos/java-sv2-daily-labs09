package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket {

    private final String dicountCode;

    public FrontOfStageTicket(String artistName, LocalDateTime showDateTime, int ticketPrice, String dicountCode) {
        super(artistName, showDateTime, ticketPrice);
        this.dicountCode = dicountCode;
    }

    public String getDicountCode() {
        return dicountCode;
    }

    @Override
    public LocalTime getEntryTime() {
        return super.getEntryTime().minusHours(1);
    }
}
