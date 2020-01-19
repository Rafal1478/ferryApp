package pl.exercise.ferry.screen;

import pl.exercise.ferry.vehicleticket.*;

import java.util.Scanner;


public class VehicleScreen implements Screen {
    private static Scanner in = new Scanner(System.in);

    @Override
    public void interact() {
        System.out.println("Kupiłeś bilet dla pojazdu");
        System.out.println("Wybierz typ pojazdu: ");
        System.out.println("1. CAR,\n" +
                "2. BIKE,\n" +
                "3. BUS,\n" +
                "4. TRUCK,");
        int type = in.nextInt();
        System.out.println("Kupiłeś bilet dla: " + VehicleType.type(type));
        Ticket ticket = VehicleScreen.getTicket(type);
        System.out.println("Cena za bilet wynosi: " + ticket.getPrice().toString());


    }

    public static Ticket getTicket(int type){
        switch (type){
            case 1 :
                return new CarTicket();
            case 2 :
                return new BikeTicket();
            case 3:
                return  new BusTicket();
            case 4 :
                return new TruckTicket();
        }return null;

    }
}
