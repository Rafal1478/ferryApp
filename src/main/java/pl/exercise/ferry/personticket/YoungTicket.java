package pl.exercise.ferry.personticket;

import pl.exercise.ferry.pax.PaxType;

import java.math.BigDecimal;

public class YoungTicket extends PersonTicket {
    public YoungTicket(String name) {
        super(PaxType.YOUNG, name);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(5);
    }

    @Override
    public String getName() {
        return name;
    }

}
