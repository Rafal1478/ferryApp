package pl.exercise.ferry.vehicleticket;

import java.math.BigDecimal;
import java.util.Scanner;

public class TruckTicket extends VehicleTicket {
    private static Scanner in = new Scanner(System.in);

    public TruckTicket() {
        super(VehicleType.TRUCK, "unknown");
    }

    @Override
    public BigDecimal getPrice() {
        System.out.println("Podaj mase ciężarówki w tonach");
        int weitght = in.nextInt();
        return BigDecimal.valueOf(weitght * 10);
    }
}
