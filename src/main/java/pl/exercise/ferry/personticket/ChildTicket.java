package pl.exercise.ferry.personticket;

import pl.exercise.ferry.pax.PaxType;

import java.math.BigDecimal;

public class ChildTicket extends PersonTicket {
    public ChildTicket(String name) {
        super(PaxType.CHILD, name);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(0);
    }

    @Override
    public String getName() {
        return name;
    }

}
