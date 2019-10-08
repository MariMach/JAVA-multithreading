package packaage;


//Java program to demonstrate getPriority() and setPriority() 

class Demo extends Thread { 
		 public void run() { 
		     System.out.println("Inside run method"); 
		 } 

			 public static void main(String[]args) { 
				 
			     Demo t1 = new Demo(); 
			     Demo t2 = new Demo(); 
			     Demo t3 = new Demo(); 
			
			     System.out.println("t1 thread priority : " + 
			                           t1.getPriority()); // Default 5 
			     System.out.println("t2 thread priority : " + 
			                           t2.getPriority()); // Default 5 
			     System.out.println("t3 thread priority : " + 
			                           t3.getPriority()); // Default 5 
			
			     t1.setPriority(2); 
			     t2.setPriority(5); 
			     t3.setPriority(8); 
			
			     // t3.setPriority(21); will throw IllegalArgumentException 
			     System.out.println("t1 thread priority : " + 
			                           t1.getPriority());  //2 
			     System.out.println("t2 thread priority : " + 
			                           t2.getPriority()); //5 
			     System.out.println("t3 thread priority : " + 
			                           t3.getPriority());//8 
			
			     // Main thread 
			     System.out.print(Thread.currentThread().getName()); 
			     System.out.println(" thread priority : "
			                    + Thread.currentThread().getPriority()); 
			
			     // Main thread priority is set to 10 
			     Thread.currentThread().setPriority(10); 
			     System.out.println("main thread priority : "
			                    + Thread.currentThread().getPriority()); 
			 } 
} 