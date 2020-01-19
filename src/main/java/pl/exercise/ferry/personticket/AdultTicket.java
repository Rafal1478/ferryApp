package pl.exercise.ferry.personticket;

import pl.exercise.ferry.pax.PaxType;

import java.math.BigDecimal;

public class AdultTicket extends PersonTicket {
    public AdultTicket() {
        super(PaxType.ADULT);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(10);
    }
}
