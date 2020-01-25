package pl.exercise.ferry.vehicleticket;

import java.math.BigDecimal;
import java.util.Scanner;

public class BusTicket extends VehicleTicket {
    private static Scanner in = new Scanner(System.in);

    int length;

    public BusTicket(String owner, int length) {
        super(VehicleType.BUS, owner);
        this.length = length;

    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(5*length);
    }

    @Override
    public String getName() {
        return "Autobus";
    }
}
