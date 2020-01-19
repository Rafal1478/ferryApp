package pl.exercise.ferry.personticket;

import pl.exercise.ferry.pax.PaxType;

import java.math.BigDecimal;

public class SeniorTicket extends PersonTicket {
    public SeniorTicket() {
        super(PaxType.SENIOR);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(5);
    }
}
