package pl.exercise.ferry.screen;

import pl.exercise.ferry.basket.Basket;

import java.util.Scanner;

public class MainScreen extends  AbstractScreen {

  public MainScreen(ScreenManager screenManager) {
    super(screenManager);

  }

  public void interact() {
    System.out.println("Witamy w systemie twój rejs, wybierz akcję: ");
    System.out.println("1. Kup bilet");
    System.out.println("2. Wyświetl stan koszyka");
    String firstResponse = in.next();
    if ("1".equalsIgnoreCase(firstResponse)) {
      screenManager.chooseScreen(ScreenIdentity.TICKETSCREEN);
    }
    if("2".equalsIgnoreCase(firstResponse)){
      screenManager.chooseScreen(ScreenIdentity.DISPLAYSCREEN);
    }
  }

  @Override
  public boolean isSupportingId(ScreenIdentity screenId) {
    return ScreenIdentity.MAINSCREEN == screenId;
  }

}
