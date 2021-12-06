package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket {

    private final String discountCode;

    public FrontOfStageTicket(String artistName, LocalDateTime showDateTime, int ticketPrice, String discountCode) {
        super(artistName, showDateTime, ticketPrice);
        this.discountCode = discountCode;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    @Override
    public LocalTime getEntryTime() {
        return super.getEntryTime().minusHours(1);
    }
}
