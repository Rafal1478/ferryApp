package pl.exercise.ferry.personticket;

import pl.exercise.ferry.pax.PaxType;

import java.math.BigDecimal;

public class YoungTicket extends PersonTicket {
    public YoungTicket() {
        super(PaxType.YOUNG);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(5);
    }
}
