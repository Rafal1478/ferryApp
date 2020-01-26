package pl.exercise.ferry.basket;

import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.personticket.AdultTicket;
import pl.exercise.ferry.personticket.ChildTicket;
import pl.exercise.ferry.personticket.SeniorTicket;
import pl.exercise.ferry.personticket.YoungTicket;
import pl.exercise.ferry.vehicleticket.BikeTicket;
import pl.exercise.ferry.vehicleticket.BusTicket;
import pl.exercise.ferry.vehicleticket.CarTicket;
import pl.exercise.ferry.vehicleticket.TruckTicket;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

    Scanner in = new Scanner(System.in);

    String path = "C:\\Users\\rnwk\\Desktop\\Writer\\";

    public void fileReader(String id) throws FileNotFoundException {
        String newPath = path + id + ".txt";
        File file = new File(newPath);
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String newLine = sc.nextLine();
            String[] newTab = newLine.split(";");
            if (newTab[0].equalsIgnoreCase("adult")){
                AdultTicket adultTicket = new AdultTicket(newTab[1], Integer.parseInt(newTab[2]));
                Basket.INSTANCE.ticketList.add(adultTicket);
                Basket.INSTANCE.addAmount(adultTicket.getPrice());

            }
            if (newTab[0].equalsIgnoreCase("child")){
                ChildTicket childTicket = new ChildTicket(newTab[1],Integer.parseInt(newTab[2]));
                Basket.INSTANCE.ticketList.add(childTicket);
                Basket.INSTANCE.addAmount(childTicket.getPrice());
            }
            if (newTab[0].equalsIgnoreCase("young")){
                YoungTicket youngTicket = new YoungTicket(newTab[1],Integer.parseInt(newTab[2]));
                Basket.INSTANCE.ticketList.add(youngTicket);
                Basket.INSTANCE.addAmount(youngTicket.getPrice());
            }
            if (newTab[0].equalsIgnoreCase("senior")){
                SeniorTicket seniorTicket = new SeniorTicket(newTab[1],Integer.parseInt(newTab[2]));
                Basket.INSTANCE.ticketList.add(seniorTicket);
                Basket.INSTANCE.addAmount(seniorTicket.getPrice());
            }
            if (newTab[0].equalsIgnoreCase("bike")){
                BikeTicket bikeTicket = new BikeTicket(newTab[1]);
                Basket.INSTANCE.ticketList.add(bikeTicket);
                Basket.INSTANCE.addAmount(bikeTicket.getPrice());
            }
            if (newTab[0].equalsIgnoreCase("car")){
                CarTicket carTicket = new CarTicket(newTab[1]);
                Basket.INSTANCE.ticketList.add(carTicket);
                Basket.INSTANCE.addAmount(carTicket.getPrice());
            }
            if (newTab[0].equalsIgnoreCase("bus")){
                BusTicket busTicket = new BusTicket(newTab[1],Integer.parseInt(newTab[2]));
                Basket.INSTANCE.ticketList.add(busTicket);
                Basket.INSTANCE.addAmount(busTicket.getPrice());
            }
            if (newTab[0].equalsIgnoreCase("truck")){
                TruckTicket truckTicket = new TruckTicket(newTab[1],Integer.parseInt(newTab[2]));
                Basket.INSTANCE.ticketList.add(truckTicket);
                Basket.INSTANCE.addAmount(truckTicket.getPrice());
            }

        }
    }
}
