package pl.exercise.ferry.personticket;

import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.vehicleticket.Ticket;

public abstract class  PersonTicket implements Ticket {

    public final PaxType paxType;
    protected String name;
    protected int age;

    protected PersonTicket(PaxType paxType, String name,int age) {
        this.paxType = paxType;
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
