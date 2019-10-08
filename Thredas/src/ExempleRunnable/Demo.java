package ExempleRunnable;

public class Demo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			for(int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getId() + " Value : " + i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
