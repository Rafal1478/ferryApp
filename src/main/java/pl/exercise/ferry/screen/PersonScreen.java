package pl.exercise.ferry.screen;

import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.personticket.AdultTicket;
import pl.exercise.ferry.personticket.ChildTicket;
import pl.exercise.ferry.personticket.SeniorTicket;
import pl.exercise.ferry.personticket.YoungTicket;
import pl.exercise.ferry.vehicleticket.Ticket;

import java.math.BigDecimal;
import java.util.Scanner;

public class PersonScreen implements Screen {
    private final Scanner in = new Scanner(System.in);


    @Override
    public void interact() {
        System.out.println("Kupiłeś bilet dla człowieka");
        System.out.println("Podaj wiek osoby");
        int age = in.nextInt();
        System.out.println("Kupiłeś bilet dla: " + PaxType.fromAge(age));
        Ticket ticket = PersonScreen.ticketPrice(PaxType.fromAge(age));
        System.out.println("Cena za bilet wybnosi: " + ticket.getPrice().toString());
    }
    public static Ticket ticketPrice(PaxType paxType){
        switch (paxType) {
            case CHILD:
                return new ChildTicket();
            case YOUNG:
                return new YoungTicket();
            case ADULT:
                return new AdultTicket();
            case SENIOR:
                return new SeniorTicket();
            case UNKNOWN:
                System.out.println("Fatal error");
                break;
            default:
                break;
        }return null;
    }
}
