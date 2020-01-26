package pl.exercise.ferry.screen;

import java.io.IOException;

public class MercaScreen extends AbstractScreen {
    MercaScreen(ScreenManager screenManager) {
        super(screenManager);
    }

    @Override
    public void interact() throws IOException {
        System.out.println("Kupiłeś bilet towarowy");
        System.out.println("Podaj imie nadawcy");
        String owner = in.next();
        System.out.println("Podaj objetość paczki w m3");
        double volumen = in.nextInt();




    }

    @Override
    public boolean isSupportingId(ScreenIdentity screenId) {
        return false;
    }

}
