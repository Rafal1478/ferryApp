package pl.exercise.ferry.vehicleticket;

import java.math.BigDecimal;

public class CarTicket extends VehicleTicket {
    public CarTicket(String owner) {
        super(VehicleType.CAR, owner);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(20);
    }

    @Override
    public String getName() {
        return "Samochód";
    }
}
