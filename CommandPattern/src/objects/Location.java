package objects;

public enum Location {
  LIVING_ROOM("Living room"),
  KITCHEN("Kitchen");

  private String location;

  Location(String location) {
    this.location = location;
  }

  public String getLocaton() {
    return location;
  }
}
