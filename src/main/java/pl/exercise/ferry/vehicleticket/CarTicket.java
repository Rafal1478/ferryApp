package pl.exercise.ferry.vehicleticket;

import java.math.BigDecimal;

public class CarTicket extends VehicleTicket {
    public CarTicket() {
        super(VehicleType.CAR, "unknown");
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(20);
    }
}
