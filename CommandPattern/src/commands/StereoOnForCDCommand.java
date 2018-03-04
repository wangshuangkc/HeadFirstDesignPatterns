package commands;

import objects.Stereo;

public class StereoOnForCDCommand implements Command {
  private Stereo stereo;
  private static final int DEFAULT_VOLUMN = 11;
  private static final String DEFAULT_CD = "Jay";

  public StereoOnForCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.on();
    stereo.setCD(DEFAULT_CD);
    stereo.setVolumn(DEFAULT_VOLUMN);
  }

  @Override
  public void undo() {
    stereo.off();
  }
}
