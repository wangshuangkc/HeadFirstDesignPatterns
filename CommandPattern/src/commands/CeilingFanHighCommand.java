package commands;

    import objects.CeilingFan;

public class CeilingFanHighCommand implements Command {
  private CeilingFan ceilingFan;
  private CeilingFan.Speed prevSpeed;

  public CeilingFanHighCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    ceilingFan.on();
    ceilingFan.getCeilingFan();
  }

  @Override
  public void undo() {
    ceilingFan.off();
  }
}
