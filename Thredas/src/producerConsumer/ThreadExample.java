package producerConsumer;

import java.util.LinkedList;

//Java program to implement solution of producer consumer problem

public class ThreadExample {
	public static void main(String args[]) throws InterruptedException{
		
		//Object of a class that has both produce() and consume() methods
		final PC pc = new PC();
		
		//Create producer thread
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		
		//Create consumer thread
				Thread t2 = new Thread(new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						try {
							pc.consume();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				});
				
			//Starts both threads
			t1.start();
			t2.start();
			
			//t1 finishes before t2 
			t1.join();
			t2.join();
	}
}

//this has a list producer adds items to list and consumer remove items
class PC{
	
	//Create  a list shared by producer and consumer
	LinkedList<Integer> list = new LinkedList<>();
	//size of list 2
	int capacity = 2;
	
	//Function called by producer thread
	public void produce() throws InterruptedException {
		int value = 0;
		for(int i=0; i < 5; i++) {
			synchronized(this) {
				
				//producer thread waits while list is full
				while(list.size() == capacity) {
					wait();
				}
				System.out.println("Producer produced "+value);
				
				//to insert the jobs in the list
				list.add(value++);
				
				//notifies the consumer thread that now it can start consuming
				notify();
				
				//makes the working of program easier to understand
				Thread.sleep(1000);
				
			}
			
		}
	}
	
	
	//Function callled by consumer thread
	public void consume() throws InterruptedException {
		for(int i=0; i < 5; i++)  {
			synchronized(this) {
				//consumer thread waits while list is empty
				while(list.size() == 0) {
					wait();
				}

				//to retrive the first job in the list
				int val = list.removeFirst();
				System.out.println("Consumer consumed "+ val);
				
				//wake up the producer thread
				notify();
				
				//makes the working of program easier to understand
				Thread.sleep(1000);
						
			}
		}
	}
}





