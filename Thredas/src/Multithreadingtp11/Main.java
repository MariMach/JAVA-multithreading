package Multithreadingtp11;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JLabel{
		
	private static final long serialVersionUID = 1L;
	
	public Main() {
		this.setHorizontalAlignment(JLabel.CENTER);
		Font font = this.getFont();
		this.setFont(new Font(font.getName(),font.getStyle(),30));
		Thread thread = new Thread((Runnable) new Threadseconde(this));
		thread.start();
			
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Horloge Graphique");
		frame.setSize(400, 400);
		frame.getContentPane().add(new Main());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
			
	}
}