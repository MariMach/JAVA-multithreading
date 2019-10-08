package interruptt;

//Interrupting a thread that doesn’t stop working

public class Main { 
		public static void main(String[] args)  throws InterruptedException { 
			interruptte thread = new interruptte(); 
			thread.start(); 
					  
					        // main thread calls interrupt() method on  
					        // child thread 
			thread.interrupt(); 
			System.out.println("Main thread execution completes"); 
		}
}
