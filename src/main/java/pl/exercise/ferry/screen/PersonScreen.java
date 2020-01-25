package pl.exercise.ferry.screen;

import pl.exercise.ferry.basket.Basket;
import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.personticket.AdultTicket;
import pl.exercise.ferry.personticket.ChildTicket;
import pl.exercise.ferry.personticket.SeniorTicket;
import pl.exercise.ferry.personticket.YoungTicket;
import pl.exercise.ferry.vehicleticket.Ticket;

import java.math.BigDecimal;
import java.util.Scanner;

public class PersonScreen extends AbstractScreen {
    private final Scanner in = new Scanner(System.in);

    public PersonScreen(ScreenManager screenManager) {
        super(screenManager);

    }


    @Override
    public void interact() {
        System.out.println("Kupiłeś bilet dla człowieka");
        System.out.println("Podaj imie");
        String name = in.next();
        System.out.println("Podaj wiek osoby");
        int age = in.nextInt();
        System.out.println("Kupiłeś bilet dla: " + PaxType.fromAge(age));
        Ticket ticket = PersonScreen.ticketPrice(age,name);
        System.out.println("Cena za bilet wynosi: " + ticket.getPrice().toString());
    }

    @Override
    public boolean isSupportingId(ScreenIdentity screenId) {
        return ScreenIdentity.PERSONSCREEN == screenId;
    }

    public static Ticket ticketPrice(int age, String name){
        switch (PaxType.fromAge(age)) {
            case CHILD:
                ChildTicket child =  new ChildTicket(name,age);
                Basket.INSTANCE.addAmount(child.getPrice());
                Basket.INSTANCE.addToList(child);
                return child;
            case YOUNG:
                YoungTicket young = new YoungTicket(name, age);
                Basket.INSTANCE.addAmount(young.getPrice());
                Basket.INSTANCE.addToList(young);
                return young;
            case ADULT:
                AdultTicket adult = new AdultTicket(name, age);
                Basket.INSTANCE.addAmount(adult.getPrice());
                Basket.INSTANCE.addToList(adult);
                return adult;
            case SENIOR:
                SeniorTicket senior = new SeniorTicket(name, age);
                Basket.INSTANCE.addAmount(senior.getPrice());
                Basket.INSTANCE.addToList(senior);
                return senior;
            case UNKNOWN:
                System.out.println("Fatal error");
                break;
            default:
                break;
        }return null;
    }
}
