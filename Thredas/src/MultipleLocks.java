import java.util.ArrayList;
import java.util.Random;

public class MultipleLocks {
	
	private static Random random = new Random();
	
	private static Object lock1 = new Object();
	private static Object lock2 = new Object();
	
	private static ArrayList<Integer> list1 = new ArrayList<Integer>();
	private static ArrayList<Integer> list2 = new ArrayList<Integer>();
	
	public  static void stageOne() {
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			list1.add(random.nextInt(100));	
		}
		
	}
	
	public  static void stageTwo() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			list2.add(random.nextInt(100));	
		}
		
	}
	
	public static void process() {
		for(int i = 0; i<1000 ; i++) {
			stageOne();
			stageTwo();		
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
				System.out.println("Starting.....");
				 long start = System.currentTimeMillis();
				 
				 
				 Thread t1 =  new Thread (new Runnable() {
					@Override
					public void run() {
						// TODO Auto-generated method stub
						process();
					}
				 });
				 
				 t1.start();
				 
				 Thread t2 =  new Thread (new Runnable() {
						@Override
						public void run() {
							// TODO Auto-generated method stub
							process();
						}
					 });
				 
				 t2.start();
				 
				 t2.join();
				 t1.join();
				 
				 long end = System.currentTimeMillis();
				
				 System.out.println("Time take : " + (end - start));
				 System.out.println("List1 " + list1.size() + " List2  " + list2.size());
	}
	
	

}