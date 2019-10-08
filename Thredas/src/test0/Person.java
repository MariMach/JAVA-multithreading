package test0;

public class Person extends Thread{
	
	private String name;
	private Car car;
	
	public Person (String name, Car car) {
		this.car = car;
		this.name =  name;
		
	}
	public void run() {
		
		synchronized (this.car) {
			int iterator = 6;
			
			
			try {
				for(int i=0; i < iterator; i++)	{
					System.out.println(this.name + " conduit : " + this.car.getname());
					sleep(1000);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
