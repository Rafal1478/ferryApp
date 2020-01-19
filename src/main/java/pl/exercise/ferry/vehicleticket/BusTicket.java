package pl.exercise.ferry.vehicleticket;

import java.math.BigDecimal;
import java.util.Scanner;

public class BusTicket extends VehicleTicket {
    private static Scanner in = new Scanner(System.in);

    public BusTicket() {
        super(VehicleType.BUS, "unknow");
    }

    @Override
    public BigDecimal getPrice() {
        System.out.println("Podaj długość pojazdu");
        int lentgh = in.nextInt();

        return BigDecimal.valueOf(5*lentgh);
    }

    @Override
    public String getName() {
        return null;
    }
}
