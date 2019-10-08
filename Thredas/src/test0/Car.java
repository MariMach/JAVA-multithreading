package test0;

public class Car implements Comparable<Car>{
	
	protected String name;
	protected int doors;
	protected int power;

	public Car() {
		
	}
	public String getname() {
		return this.name;
	}
	
	public String toString() {
		return this.name;
	}
	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		String name_1 = this.name;
		String name_2 = o.name;
		return name_1.compareTo(name_2);
	}
	

}
