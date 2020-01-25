package pl.exercise.ferry.screen;

import pl.exercise.ferry.basket.Basket;
import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.vehicleticket.*;

import java.util.Scanner;


public class VehicleScreen extends AbstractScreen {
    private static Scanner in = new Scanner(System.in);

    public VehicleScreen(ScreenManager screenManager) {
        super(screenManager);


    }

    @Override
    public void interact() {
        System.out.println("Kupiłeś bilet dla pojazdu");
        System.out.println("Wybierz typ pojazdu: ");
        System.out.println("1. CAR,\n" +
                "2. BIKE,\n" +
                "3. BUS,\n" +
                "4. TRUCK,");
        int type = in.nextInt();
        System.out.println("Podaj imie właściciela pojazdu");
        String name = in.next();
        System.out.println("Podaj wiek właściciela pojazdu");
        int age = in.nextInt();
        Ticket vehicleTicket = VehicleScreen.getTicket(type, name);
        Ticket ownerTicket = PersonScreen.ticketPrice(age, name);
        System.out.println("Kupiłeś bilet dla: " + VehicleType.type(type));

        System.out.println("Cena za bilet wynosi dla pojazdu wynosi: " + vehicleTicket.getPrice().toString());
        System.out.println("Cena za bilet dla " + ownerTicket.getName() +  " wynosi: " + ownerTicket.getPrice());


    }

    @Override
    public boolean isSupportingId(ScreenIdentity screenId) {
        return ScreenIdentity.VEHICLESCREEN == screenId;
    }

    public static Ticket getTicket(int type , String name){
        switch (type){
            case 1 :
                CarTicket carTicket = new CarTicket(name);
                Basket.INSTANCE.addToList(carTicket);
                Basket.INSTANCE.addAmount(carTicket.getPrice());

                return carTicket;
            case 2 :
                BikeTicket bikeTicket = new BikeTicket(name);
                Basket.INSTANCE.addToList(bikeTicket);
                Basket.INSTANCE.addAmount(bikeTicket.getPrice());

                return bikeTicket;
            case 3:
                System.out.println("Podaj długość pojazdu ");
                int lenght = in.nextInt();
                BusTicket busTicket = new BusTicket(name, lenght);
                Basket.INSTANCE.addToList(busTicket);
                Basket.INSTANCE.addAmount(busTicket.getPrice());
                return busTicket;
            case 4 :
                System.out.println("Podaj mase ciężarówki w tonach");
                int weight = in.nextInt();
                TruckTicket truckTicket = new TruckTicket(name,weight);
                Basket.INSTANCE.addToList(truckTicket);
                Basket.INSTANCE.addAmount(truckTicket.getPrice());
                return truckTicket;
        }return null;

    }
}
