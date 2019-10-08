package interruptt;

//Interrupting a thread that doesn’t stop working

public class interruptte extends Thread {
	public void run() { 
		 try { 
			 for (int i = 0; i < 5; i++) { 
				 System.out.println("Child Thread executing"); 
				 // Here current threads goes to sleeping state 
				 // Another thread gets the chance to execute 
				  Thread.sleep(1000); 
			 } 
		 } catch (InterruptedException e) { 
				            System.out.println("InterruptedException occur"); 
		 }
	}
	 
}
