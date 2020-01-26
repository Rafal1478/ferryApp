package pl.exercise.ferry.screen;

import pl.exercise.ferry.basket.Basket;
import pl.exercise.ferry.basket.Writer;
import pl.exercise.ferry.vehicleticket.Ticket;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class TicketScreen extends AbstractScreen {

    TicketScreen(ScreenManager screenManager) {
        super(screenManager);
    }


    @Override
    public void interact() throws IOException {
        System.out.println("Proosze wybrać rodzaj biletu, ");
        System.out.println("1. Osoba");
        System.out.println("2. Pojazd + kierowca");
        System.out.println("3. Przewóz towaru");
        System.out.println("4. Zapisz sesje");
        System.out.println("5. Wyświetl stan koszyka");
        System.out.println("6. Znajdź pasażera");
        System.out.println("7. Powrót do menu głównego");
        String firstResponse = in.nextLine();
        if ("1".equalsIgnoreCase(firstResponse)) {
            screenManager.chooseScreen(ScreenIdentity.PERSONSCREEN);
        }
        if ("2".equalsIgnoreCase(firstResponse)) {
            screenManager.chooseScreen(ScreenIdentity.VEHICLESCREEN);
        }
        if ("4".equals(firstResponse)) {
            Basket.INSTANCE.saveFiles();
            Basket.INSTANCE.basketCleaner(Basket.INSTANCE.ticketList);
        }
        if ("5".equalsIgnoreCase(firstResponse)) {
            screenManager.chooseScreen(ScreenIdentity.DISPLAYSCREEN);
        }
        if ("7".equals(firstResponse)) {
            screenManager.chooseScreen(ScreenIdentity.MAINSCREEN);

        }
        screenManager.chooseScreen(ScreenIdentity.TICKETSCREEN);

    }
            @Override
            public boolean isSupportingId (ScreenIdentity screenId){
                return ScreenIdentity.TICKETSCREEN == screenId;
    }
}
