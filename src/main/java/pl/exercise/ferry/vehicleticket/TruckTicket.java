package pl.exercise.ferry.vehicleticket;

import java.math.BigDecimal;
import java.util.Scanner;

public class TruckTicket extends VehicleTicket {
    private static Scanner in = new Scanner(System.in);

    int weitght;

    public TruckTicket(String owner, int weitght) {
        super(VehicleType.TRUCK, owner);
        this.weitght = weitght;
    }

    @Override
    public BigDecimal getPrice() {

        return BigDecimal.valueOf(weitght * 10);
    }

    @Override
    public String getName() {
        return "Ciężarówka";
    }
}
