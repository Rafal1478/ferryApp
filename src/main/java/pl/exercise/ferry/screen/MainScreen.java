package pl.exercise.ferry.screen;

import java.util.Scanner;

public class MainScreen implements Screen {

  private final Scanner in = new Scanner(System.in);

  public void interact() {
    System.out.println("Witamy w systemie twój rejs, wybierz akcję: ");
    System.out.println("1, Kup bilet");
    String firstResponse = in.nextLine();
    if ("1".equalsIgnoreCase(firstResponse)) {
      TicketScreen ticketScreen = new TicketScreen();
      ticketScreen.interact();
    }else{

    }
      TicketScreen ticketScreen = new TicketScreen();
    ticketScreen.interact();
  }
}
