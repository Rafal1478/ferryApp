package pl.exercise.ferry.screen;

import java.io.IOException;
import java.util.Set;

public class ScreenManager {

    private final Set<Screen> screens;

    public ScreenManager() {
        final PersonScreen personScreen = new PersonScreen(this);
        final MainScreen mainScreen = new MainScreen(this);
        final VehicleScreen vehicleScreen = new VehicleScreen(this);
        final TicketScreen ticketScreen = new TicketScreen(this);
        final DisplayScreen displayScreen = new DisplayScreen(this);
        final MercaScreen mercaScreen = new MercaScreen(this);
        this.screens = Set.of(personScreen, mainScreen, vehicleScreen, ticketScreen, displayScreen, mercaScreen);
    }

    public void start() {
        chooseScreen(ScreenIdentity.MAINSCREEN);
    }

    void chooseScreen(ScreenIdentity screenId) {
        Screen chosenScreen = findScreen(screenId);
        try {
            chosenScreen.interact();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Screen findScreen(ScreenIdentity screenId) {
        for (Screen screen : screens) {
            if (screen.isSupportingId(screenId)) {
                return screen;
            }
        }
        throw new IllegalArgumentException(String.format("There is no screen defined with id %s", screenId));
    }
}

