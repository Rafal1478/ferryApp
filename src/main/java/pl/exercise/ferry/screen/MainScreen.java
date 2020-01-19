package pl.exercise.ferry.screen;

import java.util.Scanner;

public class MainScreen extends  AbstractScreen {

  public MainScreen(ScreenManager screenManager) {
    super(screenManager);

  }

  public void interact() {
    System.out.println("Witamy w systemie twój rejs, wybierz akcję: ");
    System.out.println("1, Kup bilet");
    String firstResponse = in.nextLine();
    if ("1".equalsIgnoreCase(firstResponse)) {
      screenManager.chooseScreen(ScreenIdentity.TICKETSCREEN);
    }
  }

  @Override
  public boolean isSupportingId(ScreenIdentity screenId) {
    return ScreenIdentity.MAINSCREEN == screenId;
  }

}
