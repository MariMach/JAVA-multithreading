package joinGeeksForGeeks;

public class Main {
	public static void main(String args[]) {
		
		ThreadJoining t1 = new ThreadJoining();
		ThreadJoining t2 = new ThreadJoining();
		ThreadJoining t3 = new ThreadJoining();
		
		t1.start();
		
		//starts second thread after when first thread t1 isn died
		
		try {
			System.out.println("Current Thread :" + Thread.currentThread().getName());
			t1.join();
		}catch (Exception e) {
			System.out.println("Exception has been caught "+e);
		}
		t2.start();
		
		try {
			System.out.println("Current Thread :" + Thread.currentThread().getName());
			t2.join();
		}catch (Exception e) {
			System.out.println("Exception has been caught "+e);
		}
		t3.start();
	}
}
