package proxy;

import components.ImageComponent;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class ImageProxyTestDrive {
  private ImageComponent imageComponent;

  private final JFrame frame;
  private final JMenuBar menuBar;
  private final JMenu menu;
  private final Dictionary<String, String> cds;

  public ImageProxyTestDrive() throws Exception {
    menu = new JMenu("Favorite CDs");
    menuBar = new JMenuBar();
    menuBar.add(menu);
    frame = new JFrame("CD Cover Viewer");
    frame.setJMenuBar(menuBar);

    cds = createCdDictionary();
    final URL initial = new URL(cds.get("BADLANDS"));

    Collections.list(cds.keys()).forEach(name -> {
      final JMenuItem menuItem = new JMenuItem(name);
      menu.add(menuItem);
      menuItem.addActionListener(event -> {
        imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
        frame.repaint();
      });
    });

    final Icon icon = new ImageProxy(initial);
    imageComponent = new ImageComponent(icon);
    frame.getContentPane().add(imageComponent);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(imageComponent.DEFAULT_WIDTH, imageComponent.DEFAULT_HEIGHT);
    frame.setVisible(true);
  }

  private URL getCDUrl(String name) {
    try {
      return new URL(cds.get(name));
    } catch (MalformedURLException e) {
      System.out.println("Failed to retrieve CD url. \n" + e.getStackTrace());
      return null;
    }
  }

  private Dictionary<String,String> createCdDictionary() {
    final Dictionary<String, String> dic = new Hashtable<>();
    dic.put("Daydream", "https://images-na.ssl-images-amazon.com/images/I/41DEfdBRF8L.jpg");
    dic.put("The Ornament", "https://images-na.ssl-images-amazon.com/images/I/51ZydvIBJgL.jpg");
    dic.put("BADLANDS", "https://images-na.ssl-images-amazon.com/images/I/5157cwcvfqL.jpg");
    dic.put("Take Everything", "https://images-na.ssl-images-amazon.com/images/I/51U3QHLDsML._SS500.jpg");

    return dic;
  }

  public static void main(String[] args) throws Exception {
    ImageProxyTestDrive imageProxyTestDrive = new ImageProxyTestDrive();
  }
}
