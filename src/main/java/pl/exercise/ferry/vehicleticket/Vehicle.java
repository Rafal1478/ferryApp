package pl.exercise.ferry.vehicleticket;

public abstract class Vehicle implements Ticket {
  private final VehicleType vehicleType;
  private final String owner;

  Vehicle(VehicleType vehicleType, String owner) {
    this.vehicleType = vehicleType;
    this.owner = owner;
  }
}
