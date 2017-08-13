package proxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
  private ImageIcon imageIcon;
  private URL imageURL;
  private boolean retrieving = false;

  public ImageProxy(URL url) {
    imageURL = url;
  }

  @Override
  public void paintIcon(final Component c, final Graphics g, final int x, final int y) {
    if (imageIcon != null) {
      imageIcon.paintIcon(c, g, x, y);
    } else {
      g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
      if (!retrieving) {
        retrieving = true;

        final Runnable runnable = () -> {
          try {
            imageIcon = new ImageIcon(imageURL, "CD Cover");
            c.repaint();
          } catch (Exception e) {
            g.drawString("Failed to retrieve CD cover.", x + 300, y + 190);
          }
        };
        new Thread(runnable).start();
      }
    }
  }

  @Override
  public int getIconWidth() {
    return imageIcon != null ? imageIcon.getIconWidth() : 800;
  }

  @Override
  public int getIconHeight() {
    return imageIcon != null ? imageIcon.getIconHeight() : 600;
  }
}
