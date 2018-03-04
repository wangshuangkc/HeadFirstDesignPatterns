package objects;

public class Stereo {
  private String cd = "Default cd";
  private int volumn;
  private boolean on;

  public void on() {
    on = true;
    System.out.println("Stereo is on.");
  }

  public void off() {
    on = false;
    System.out.println("Stereo is off.");
  }

  public void setCD(String cd) {
    if (on) {
      this.cd = cd;
    }
  }

  public String getCD() {
    return cd;
  }

  public void setVolumn(int volumn) {
    if (on) {
      this.volumn = volumn;
    }
  }

  public void volumnUp() {
    if (on) {
      volumn++;
    }
  }

  public void volumnDown() {
    if (on) {
      volumn--;
    }
  }

  public int getVolumn() {
    return volumn;
  }
}
