package packaage;


import javax.swing.*;
import java.awt.*;

public class Horloge extends JLabel {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int secondes;

  public Horloge() {
    this.setHorizontalAlignment(JLabel.CENTER);
    Font font = this.getFont();
    this.setFont(new Font(font.getName(), font.getStyle(), 48));
    this.setText(toString());
    Thread thread = new Thread(() -> {
        try {
            Thread.sleep(3000);
            while (true) {
              secondes++;
              this.setText(toString());
              Thread.sleep(1000);
            }
          } catch (Exception e) {
            e.printStackTrace();
          }
        });
    thread.start();
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Horloge Graphique");
    frame.setSize(400, 400);
    frame.setContentPane(new Horloge());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  @Override
  public String toString() {
    return String.format("%02d:%02d:%02d", secondes / 3600, (secondes % 3600) / 60, secondes % 60);
  }
}
