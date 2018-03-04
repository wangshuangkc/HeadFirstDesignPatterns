package commands;

import objects.Stereo;

public class StereoDownCommand implements Command {
  private Stereo stereo;

  public StereoDownCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.volumnDown();
  }

  @Override
  public void undo() {
    stereo.volumnUp();
  }
}
