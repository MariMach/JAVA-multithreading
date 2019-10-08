
public class variabePartage {
	private static Name a = new Name("Mariam");
	
	
	public static void work1() throws InterruptedException {
		synchronized(a) {
			a.wait();
			System.out.println(a.getName());
		}
	}
	
	public static void work2() throws InterruptedException {
		synchronized(a) {
			Thread.sleep(2000);
			a.setName("Najlae");
			System.out.println(a.getName());
			a.notify();
		}
		
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					work1();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					work2();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		t1.start();
		t2.start();
		
	}
	
}

class Name{
	private String name;
	
	public Name(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
