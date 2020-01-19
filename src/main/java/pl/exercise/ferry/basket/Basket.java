package pl.exercise.ferry.basket;

import pl.exercise.ferry.vehicleticket.Ticket;

import java.awt.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    public static final Basket INSTANCE = new Basket();

    List <Ticket> ticketList = new ArrayList<>();


    private BigDecimal amount = BigDecimal.ZERO;

    public Basket() {
    }

    public BigDecimal addAmount(BigDecimal price){
        return amount.add(price);

    }
    public void addToList(Ticket ticket){
        ticketList.add(ticket);
    }


}
