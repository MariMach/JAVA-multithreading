package Multithreadingtp11;


public class Threadseconde implements Runnable {
	
		private int sec;
		private Main m;
		
		 public Threadseconde(Main m) {
			    this.m = m;			  
		}
		
			public void run() {	
			      
				// TODO Auto-generated method stub
				try {
			          while (true) {
			        	  Thread.sleep(1000);
			        	  sec++;
			        	  m.setText(toStringhorloge());
			              Thread.sleep(1000);
			       		}
			        } catch (InterruptedException e) {
			        	e.printStackTrace();
			        }
			}
		
	

		
	
	public  String toStringhorloge() {
		return String.format("%02d:%02d:%02d", sec / 3600, (sec % 3600) / 60, sec % 60);
	}
	
}