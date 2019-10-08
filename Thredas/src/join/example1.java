package join;

public class example1 {
	
	public static void main(String[] args) throws InterruptedException {
		 Thread t1 = new JoinExample();
		 t1.start();
		 t1.join();
		 
		 Thread t2 = new JoinExample();
		 t2.start();
		 t2.join();
	}

}

class JoinExample extends Thread{
	
	public JoinExample(){
		super();
	}
	
	public void run() {
		for(int i=0; i<20 ; i++) {
			System.out.println(i + Thread.currentThread().getName());
		}
	}
}
