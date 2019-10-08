package test;

public class CustiomThread extends Thread{
	public void run() {
		super.run();
		try {
			for(int i = 0; i < 3; i++) {
				System.out.println("hi");
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
