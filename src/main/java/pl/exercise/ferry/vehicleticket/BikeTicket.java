package pl.exercise.ferry.vehicleticket;

import java.math.BigDecimal;

public class BikeTicket extends VehicleTicket {
    public BikeTicket() {
        super(VehicleType.BIKE, "unknown");
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(10);
    }
}
