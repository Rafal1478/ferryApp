package pl.exercise.ferry.screen;

import pl.exercise.ferry.basket.Basket;
import pl.exercise.ferry.basket.Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainScreen extends  AbstractScreen {

  public MainScreen(ScreenManager screenManager) {
    super(screenManager);

  }

  public void interact() throws IOException {
    System.out.println("Witamy w aplikacji TWÓJ REJS MARZEŃ <3 , wybierz akcję: ");
    System.out.println("1. Kup bilet");
    System.out.println("2. Wyświetl stan koszyka");
    System.out.println("3. Zamknij program");
    System.out.println("4. zapisz i zamknij");
    String firstResponse = in.next();
    if ("1".equalsIgnoreCase(firstResponse)) {
      screenManager.chooseScreen(ScreenIdentity.TICKETSCREEN);
    }
    if("2".equalsIgnoreCase(firstResponse)){
      screenManager.chooseScreen(ScreenIdentity.DISPLAYSCREEN);
    }
    if ("3".equals(firstResponse)){
      System.out.println("Płać i płacz");
      System.exit(0);
    }
    if ("4".equals(firstResponse)){
      Basket.INSTANCE.saveFiles();


    }
  }

  @Override
  public boolean isSupportingId(ScreenIdentity screenId) {
    return ScreenIdentity.MAINSCREEN == screenId;
  }

}
