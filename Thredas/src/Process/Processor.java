package Process;

import java.util.Scanner;

public class Processor {
	public static void main(String[] args) {
		Main proc1 = new Main();
		proc1.start();
		
		//pause the execution
		System.out.println("Press return to stop....");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		proc1.shutdown();
		
	} 
}
	
 class Main extends Thread {
		private volatile boolean running = true;
		
	public void run() {
		
		
		while(running) {
			try {
				System.out.println("Hello");
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
	public void shutdown() {
		running = false;
	}
}
