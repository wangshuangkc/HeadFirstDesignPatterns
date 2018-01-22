package types;

public enum Region {
  NY("New York"),
  CHICAGO("Chicago"),
  CALIFORNIA("California");

  private String region;

  Region(String region) {
    this.region = region;
  }

  @Override
  public String toString() {
    return region;
  }
}
