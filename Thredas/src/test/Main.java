package test;

public class Main {
	public static void main(String[] args) {
		
		CustiomThread th = new CustiomThread();
		th.start();
		
		
		try {
			for(int i = 0; i < 5; i++) {
				System.out.println("hello");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
