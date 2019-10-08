package ExempleRunnable;

public class Main {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Demo());
		Thread t2 = new Thread(new Demo());
		t1.start();
		t2.start();
	}
}
