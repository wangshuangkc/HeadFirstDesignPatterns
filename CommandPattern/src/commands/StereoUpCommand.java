package commands;

import objects.Stereo;

public class StereoUpCommand implements Command {
  private Stereo stereo;

  public StereoUpCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.volumnUp();
  }

  @Override
  public void undo() {
    stereo.volumnDown();
  }
}
