package PriorityExempleCours;

public class Producer extends Thread{
	
	public void run() {
		try {
			for(int i = 0; i < 4; i++) {
				System.out.println("Producer : Item " + i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}