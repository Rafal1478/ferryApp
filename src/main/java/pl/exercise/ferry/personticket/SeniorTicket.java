package pl.exercise.ferry.personticket;

import pl.exercise.ferry.pax.PaxType;

import java.math.BigDecimal;

public class SeniorTicket extends PersonTicket {
    public SeniorTicket(String name, int age) {
        super(PaxType.SENIOR, name, age);
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
