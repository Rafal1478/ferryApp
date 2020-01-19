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

    public void addAmount(BigDecimal price){
         amount = amount.add(price);

    }
    public void addToList(Ticket ticket){
        ticketList.add(ticket);
    }
    public void displayList() {
        if (ticketList.isEmpty()) {
            System.out.println("Twój koszyk jest pusty!!!");
        } else {
            for (Ticket ticket : ticketList) {

                System.out.println("Bilet został kupiony dla: " + ticket.getName() + " , na kwote: " + ticket.getPrice().toString());
                System.out.println("***************************************************************");
            }
        }
    }
    public void displayAmount(){
        System.out.println("Całkowita cena zakupów to: " + Basket.INSTANCE.amount.toString() + " zł");
        System.out.println("************************************************************************");
    }
}
