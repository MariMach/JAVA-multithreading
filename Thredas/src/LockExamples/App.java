package LockExamples;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class App {
	
	Account acc1 = new Account();
	Account acc2 = new Account();
	
	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	
	public void firstThread() throws InterruptedException{
		Random random = new Random();
		for(int i = 0; i < 10000; i++) {
			lock1.lock();
			lock2.lock();
			try {
				Account.transfere(acc1, acc2, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
			
		}
		
	}
	
	public void  secondeThread() throws InterruptedException{
		Random random = new Random();
		for(int i = 0; i < 10000; i++) {
			//deadlock if lock2.lock and then lock1.lock and then lock2.unlock lock1.unlock
			lock1.lock();
			lock2.lock();
			
			try {
				Account.transfere(acc2, acc1, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
				
			}
		}
		
	}
	
	public void finish() {
		System.out.println("Account 1 Balance :" + acc1.getBalance());
		System.out.println("Account 2 Balance :" + acc2.getBalance());
		System.out.println("Total Balance :" + (acc1.getBalance() + acc2.getBalance()));
	}

}
