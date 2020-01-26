package pl.exercise.ferry.basket;

import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.personticket.PersonTicket;
import pl.exercise.ferry.screen.PersonScreen;
import pl.exercise.ferry.vehicleticket.*;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    public static final Basket INSTANCE = new Basket();

    public List <Ticket> ticketList = new ArrayList<>();


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
        System.out.println(writer.getId() + " -to twoje id");
        for (Ticket ticket : ticketList) {
            if(ticket instanceof PersonTicket){
                fileWriter.write(PaxType.fromAge(((PersonTicket) ticket).getAge()).toString() + ";");
                fileWriter.write(ticket.getName() + ";");
                fileWriter.write(((PersonTicket) ticket).getAge() + "\n");
            }
            if(ticket instanceof BikeTicket){
                fileWriter.write(((BikeTicket) ticket).getVehicleType().toString() + ";");
                fileWriter.write(((BikeTicket) ticket).getOwner() + "\n");
            }
            if(ticket instanceof CarTicket){
                fileWriter.write(((CarTicket) ticket).getVehicleType().toString() + ";");
                fileWriter.write(((CarTicket) ticket).getOwner() + "\n");
            }
            if(ticket instanceof BusTicket){
                fileWriter.write(((BusTicket) ticket).getVehicleType().toString() + ";");
                fileWriter.write(((BusTicket) ticket).getOwner() + ";");
                fileWriter.write(((BusTicket) ticket).getLength() + "\n");

            }
            if(ticket instanceof TruckTicket){
                fileWriter.write(((TruckTicket) ticket).getVehicleType().toString() + ";");
                fileWriter.write(((TruckTicket) ticket).getOwner() + ";");
                fileWriter.write(((TruckTicket) ticket).getWeitght() + "\n");

            }


        }fileWriter.close();
    }
    public void basketCleaner(List <Ticket> list){
        list.clear();

    }
    public void zeroAmount(){
        amount = BigDecimal.ZERO;
    }
}
