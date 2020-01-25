package pl.exercise.ferry.personticket;

import pl.exercise.ferry.pax.PaxType;

import java.math.BigDecimal;

public class YoungTicket extends PersonTicket {
    public YoungTicket(String name, int age) {
        super(PaxType.YOUNG, name,age);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(5);
    }

    @Override
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }

}
