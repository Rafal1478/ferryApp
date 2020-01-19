package pl.exercise.ferry.personticket;

import pl.exercise.ferry.pax.PaxType;

import java.math.BigDecimal;

public class AdultTicket extends PersonTicket {
    public AdultTicket(String name) {
        super(PaxType.ADULT, name);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(10);
    }
}
