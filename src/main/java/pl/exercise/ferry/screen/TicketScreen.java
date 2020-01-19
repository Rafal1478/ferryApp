package pl.exercise.ferry.screen;

import java.util.Scanner;

public class TicketScreen implements Screen {

    private final Scanner in = new Scanner(System.in);

    @Override
    public void interact() {
        System.out.println("Proosze wybrać rodzaj biletu, ");
        System.out.println("1. Osoba");
        System.out.println("2. Pojazd");
        String firstResponse = in.nextLine();
        if ("1".equalsIgnoreCase(firstResponse)){
            PersonScreen personTicket = new PersonScreen();
            personTicket.interact();
        }
        if ("2".equalsIgnoreCase(firstResponse)){
            VehicleScreen ticketVehicle = new VehicleScreen();
            ticketVehicle.interact();
        }
            TicketScreen ticketScreen = new TicketScreen();
        ticketScreen.interact();


    }
}
