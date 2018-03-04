package objects;

public class Light {

  private String location;

  public Light(Location location) {
    this.location = location.getLocaton();
  }

  public void on() {
    System.out.println(location + " light is on");
  }

  public void off() {
    System.out.println(location + " light is off.");
  }
}
