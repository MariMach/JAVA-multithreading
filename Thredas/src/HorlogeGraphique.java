import javax.swing.JFrame;
import javax.swing.JLabel;

public class HorlogeGraphique{
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		
		JLabel hgg = new JLabel();
		Thread th = new Thread(new horloge(hgg), "threadINCR");
		
		hgg.setHorizontalAlignment(JLabel.CENTER);
		JFrame frame = new JFrame("Horloge Graphique");
		frame.setSize(400, 400);
		frame.setContentPane(hgg);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		th.start();
		frame.setVisible(true);
		
	}
}

class horloge implements Runnable{
	
	private JLabel hg;
	
	public horloge(JLabel hg) {
		this.hg = hg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<200; i++) {
			try {
				Thread.sleep(1000);
				hg.setText(Thread.currentThread().getName() + " " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
