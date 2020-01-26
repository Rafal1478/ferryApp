package pl.exercise.ferry.merca;

import pl.exercise.ferry.vehicleticket.Ticket;
import pl.exercise.ferry.vehicleticket.TicketType;

import java.math.BigDecimal;

public class MercaTicket implements Ticket {

    protected TicketType ticketType;

    String owner;
    protected double volumen;

    public String getOwner() {
        return owner;
    }

    public double getVolumen() {
        return volumen;
    }

    public MercaTicket(TicketType ticketType, String owner, double volume) {
        this.owner = owner;
        this.volumen = volume;
        this.ticketType = ticketType;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(volumen*50);
    }

    @Override
    public String getName() {
        return "Cargo";
    }
}
