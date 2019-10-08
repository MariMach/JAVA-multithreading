package join;

public class synchronizedObject {
	
	    private static int c = 20;

	    public synchronized static void increment() {
	        c = c + 5;
	        System.out.println("incremant is called");
	    }

	    public synchronized static void decrement() {
	        c = c - 5;
	        System.out.println("decrement is called");
	    }

	    public synchronized static int value() {
	        return c;
	    }
	
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				increment();
				System.out.println(value());
			}
			
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				decrement();
				System.out.println(value());
			}
			
		});
		
		t1.start();
		t2.start();
	}

}
