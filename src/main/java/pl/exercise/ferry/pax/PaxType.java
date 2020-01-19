package pl.exercise.ferry.pax;

public enum PaxType {
  CHILD(0,3), YOUNG(4,17), ADULT(18,69), SENIOR(70,150),UNKNOWN(-5, -2);

  int ageLower;
  int ageHigh;


  PaxType(int ageLower, int ageHigh) {
    this.ageLower = ageLower;
    this.ageHigh = ageHigh;
  }

  public static PaxType fromAge(int age) {
    for (PaxType pt : values()) {
      if (pt.ageHigh >= age && pt.ageLower <= age) {
        return pt;
      }

    }return PaxType.UNKNOWN;
  }
}
