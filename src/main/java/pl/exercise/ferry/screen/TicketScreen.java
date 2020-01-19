package pl.exercise.ferry.screen;

import java.util.Scanner;

public class TicketScreen extends AbstractScreen {

    TicketScreen(ScreenManager screenManager) {
        super(screenManager);
    }


    @Override
    public void interact() {
        System.out.println("Proosze wybrać rodzaj biletu, ");
        System.out.println("1. Osoba");
        System.out.println("2. Pojazd");
        String firstResponse = in.nextLine();
        if ("1".equalsIgnoreCase(firstResponse)){
            screenManager.chooseScreen(ScreenIdentity.PERSONSCREEN);
        }
        if ("2".equalsIgnoreCase(firstResponse)){
            screenManager.chooseScreen(ScreenIdentity.VEHICLESCREEN);
        }
            screenManager.chooseScreen(ScreenIdentity.MAINSCREEN);


    }

    @Override
    public boolean isSupportingId(ScreenIdentity screenId) {
        return ScreenIdentity.TICKETSCREEN == screenId;
    }
}
