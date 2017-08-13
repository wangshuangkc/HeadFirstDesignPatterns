package components;

import javax.swing.*;
import java.awt.*;

public class ImageComponent extends JComponent {
  private Icon icon;
  public static final int DEFAULT_WIDTH = 800;
  public static final int DEFAULT_HEIGHT = 600;

  public ImageComponent(Icon icon) {
    setIcon(icon);
  }

  public void setIcon(final Icon icon) {
    this.icon = icon;
  }

  public void paintComponent (final Graphics g) {
    super.paintComponent(g);
    final int w = icon.getIconWidth();
    final int h = icon.getIconHeight();
    final int x = (DEFAULT_WIDTH - w) / 2;
    final int y = (DEFAULT_HEIGHT - h) / 2;
    icon.paintIcon(this, g, x, y);
  }
}
