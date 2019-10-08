package tp2ex2;

import java.awt.Graphics;

public class Dessiner {
	private void remplir() throws InterruptedException { 
		Graphics g = getGraphics();
		for (int y = 0; y < 100; y = y+10) {
			for (int x = 0; x < 300; x=x+10) { 
				g.fillOval(x, y, 10, 10); 
				Thread.sleep(100);
			}
		}
	}

	private Graphics getGraphics() {
		// TODO Auto-generated method stub
		return null;
	}
}
