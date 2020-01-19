package pl.exercise.ferry.vehicleticket;

public enum VehicleType {
  CAR(1),
  BIKE(2),
  BUS(3),
  TRUCK(4),
  UNKNOWN(-10);


  int carType;

  VehicleType(int carType) {
    this.carType = carType;
  }
  public static VehicleType type(int type){
    for (VehicleType vt : values()){
      if (vt.carType == type){
        return vt;
      }
    }return UNKNOWN;
  }

}
