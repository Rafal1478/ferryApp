package pl.exercise.ferry.vehicleticket;

import java.math.BigDecimal;

public class BikeTicket extends VehicleTicket {
    public BikeTicket(String owner) {
        super(VehicleType.BIKE, owner);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(10);
    }

    @Override
    public String getName() {
        return "Motocykl";
    }
}
