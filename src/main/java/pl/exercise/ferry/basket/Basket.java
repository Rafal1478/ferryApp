package pl.exercise.ferry.basket;

import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.personticket.PersonTicket;
import pl.exercise.ferry.screen.PersonScreen;
import pl.exercise.ferry.vehicleticket.Ticket;
import pl.exercise.ferry.vehicleticket.VehicleTicket;
import pl.exercise.ferry.vehicleticket.VehicleType;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
            System.out.println("Twój koszyk jest pusty!!!.. tak jak Twoja główka");
            System.out.println("*********************************");
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

    public void saveFiles() throws IOException {
        Writer writer = new Writer();
        FileWriter fileWriter = new FileWriter(writer.createFile());
        for (Ticket ticket : ticketList) {
            if(ticket instanceof PersonTicket){
                fileWriter.write(PaxType.fromAge(((PersonTicket) ticket).getAge()).toString() + ";");
                fileWriter.write(ticket.getName() + ";");
                fileWriter.write(((PersonTicket) ticket).getAge() + "\n");
            }
            if(ticket instanceof VehicleTicket){
                fileWriter.write(((VehicleTicket) ticket).getVehicleType().toString() + ";");
                fileWriter.write(((VehicleTicket) ticket).getOwner() + "\n");
            }

        }fileWriter.close();
    }
}
