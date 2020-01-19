package pl.exercise.ferry.screen;

import pl.exercise.ferry.basket.Basket;

public class DisplayScreen extends AbstractScreen {
    DisplayScreen(ScreenManager screenManager) {
        super(screenManager);
    }

    @Override
    public void interact() {
        System.out.println("1. Wyswietl zakupione bilety");
        System.out.println("2. Wyświetl saldo zakupów");
        System.out.println("3. Wróć do początku");
        String firstResponse = in.next();
        if("1".equalsIgnoreCase(firstResponse)){
            Basket.INSTANCE.displayList();
            screenManager.chooseScreen(ScreenIdentity.DISPLAYSCREEN);
        }
        if ("2".equalsIgnoreCase(firstResponse)){
            Basket.INSTANCE.displayAmount();
            screenManager.chooseScreen(ScreenIdentity.DISPLAYSCREEN);

        }
        if ("3".equalsIgnoreCase(firstResponse)){
            screenManager.chooseScreen(ScreenIdentity.MAINSCREEN);
        }

    }

    @Override
    public boolean isSupportingId(ScreenIdentity screenId) {
        return ScreenIdentity.DISPLAYSCREEN == screenId;
    }
}
