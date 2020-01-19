package pl.exercise.ferry.personticket;

import pl.exercise.ferry.pax.PaxType;

import java.math.BigDecimal;

public class ChildTicket extends PersonTicket {
    public ChildTicket() {
        super(PaxType.CHILD);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(0);
    }
}
