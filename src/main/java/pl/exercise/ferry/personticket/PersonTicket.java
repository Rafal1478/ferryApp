package pl.exercise.ferry.personticket;

import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.vehicleticket.Ticket;

public abstract class  PersonTicket implements Ticket {

    public final PaxType paxType;

    protected PersonTicket(PaxType paxType) {
        this.paxType = paxType;
    }
}
