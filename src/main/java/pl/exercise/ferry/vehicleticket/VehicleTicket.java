package pl.exercise.ferry.vehicleticket;

public abstract class VehicleTicket implements Ticket {

  private final VehicleType vehicleType;
  private final String owner;

  VehicleTicket(VehicleType vehicleType, String owner) {
    this.vehicleType = vehicleType;
    this.owner = owner;
  }
}
