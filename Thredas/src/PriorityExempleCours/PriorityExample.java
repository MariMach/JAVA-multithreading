package PriorityExempleCours;

public class PriorityExample {
	
		public static void main(String[] args) {
				
				
					Thread producer = new Producer();
					Thread consumer = new Consumer();
							
					producer.setPriority(Thread.MAX_PRIORITY);
					consumer.setPriority(Thread.MIN_PRIORITY);
					
					consumer.start();
					producer.start();

			}
	

}
