package geeksforgeekssynchronized;

/*
 Synchronized in java Multi-threading programs may often come to
 a situation where multiple threads try to access the same resources
 and finally erroneous and unforeseen results 
 
 So it needs to be made sure by some synchronization method that 
 only one thread can access the resource at a given point of time.
 
 This synchronization is implemented in Java with a concept
  called monitors. Only one thread can own a monitor at a given
  time. When a thread acquires a lock, it is said to have entered 
  the monitor. All other threads attempting to enter the locked 
  monitor will be suspended until the first thread exits the monitor.
 

 */


//Class for send a message using threads
public class Threadsend extends Thread{
		private String msg;
		Sender sender;
		
		//Recieve a message object and a string
		//message to be sent
		
		Threadsend(String m, Sender obj) {
			msg = m;
			sender = obj;
		}
		
		public void run() {
			// Only one thread can send a message 
	        // at a time. 
	       synchronized(sender) { 
	            // synchronizing the send object 
	            sender.send(msg); 
	       } 
		}
}
	
// A class used to send message
class Sender {
	public void send(String msg) {	
		System.out.println("Sending\t" + msg);
		try {
			Thread.sleep(2000);
		} catch (Exception e){
			System.out.println("Thread Interrupted");
		}
		System.out.println("\n" + msg + " Sent");
	}
}
