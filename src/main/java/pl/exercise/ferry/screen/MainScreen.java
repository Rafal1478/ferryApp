package pl.exercise.ferry.screen;

import pl.exercise.ferry.basket.Basket;
import pl.exercise.ferry.basket.Reader;
import pl.exercise.ferry.basket.Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainScreen extends  AbstractScreen {

  public MainScreen(ScreenManager screenManager) {
    super(screenManager);

  }
  String id;
  public void interact() throws IOException {
    System.out.println("Witamy w aplikacji TWÓJ REJS MARZEŃ , wybierz akcję: ");
    System.out.println("1. Kup bilet");
    System.out.println("2. Znajdz zapisaną sesje");
    System.out.println("3. Zamknij program");
    String firstResponse = in.next();
    if ("1".equalsIgnoreCase(firstResponse)) {
      screenManager.chooseScreen(ScreenIdentity.TICKETSCREEN);
    }
    if ("2".equals(firstResponse)){
      System.out.println("Podaj id zakupow,");
      id = in.next();
      Reader reader = new Reader();
      reader.fileReader(id);
      screenManager.chooseScreen(ScreenIdentity.DISPLAYSCREEN);

    }
    if ("3".equals(firstResponse)){
      System.out.println("Płać i płacz");
      System.exit(0);
    }

  }

  @Override
  public boolean isSupportingId(ScreenIdentity screenId) {
    return ScreenIdentity.MAINSCREEN == screenId;
  }

}
