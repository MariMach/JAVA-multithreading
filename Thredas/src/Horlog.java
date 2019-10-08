import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Horlog extends JLabel{
		public  Horlog() {
			this.setHorizontalAlignment(JLabel.CENTER);
			Font font = this.getFont();
			this.setFont(new Font(font.getName(),font.getStyle(),30));		
			Thread th = new Thread(new Threadseconde(this));
			th.start();
		}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Horloge Graphique");
		frame.setSize(400, 400);
		frame.getContentPane().add(new Horlog());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Threadseconde implements Runnable{
	private int sec;
	private Horlog m;
	
	public Threadseconde(Horlog hg) {
		this.m = hg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				Thread.sleep(1000);
				sec++;
				m.setText(toStringHorloge());
			}
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
	}
	
	public String toStringHorloge() {
		return String.format("%02d:%02d:%02d", sec/3600, (sec%3600)/60, sec%60);
	}
	
}
