package objects;

public class CeilingFan {
  private String location;
  private Speed speed;

  public CeilingFan(Location location) {
    this.location = location.getLocaton();
  }

  public void on() {
    speed = Speed.LOW;
  }

  public void off() {
    speed = Speed.OFF;
  }

  public void setSpeed(Speed speed) {
    this.speed = speed;
  }

  public int getSpeed() {
    return speed.getSpeed();
  }

  public void getCeilingFan() {
    System.out.println(location + " ceiling fan is at speed " + getSpeed());
  }

  public enum Speed {
    OFF(0),
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int speed;

    Speed(int speed) {
      this.speed = speed;
    }

    int getSpeed() {
      return speed;
    }
  }
}
