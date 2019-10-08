package joinGeeksForGeeks;



/* 
  java.lang.Thread class provides the join() method which
   allows one thread to wait until another 
   thread completes its execution. 
   If t is a Thread object whose thread is currently 
   executing, then t.join(); it causes 
   the current thread to pause its execution 
   until thread it join completes its execution.
If there are multiple threads calling 
the join() methods that means overloading o
n join allows the programmer to specify
 a waiting period. However, as with sleep, 
 join is dependent on the OS for timing, 
 so you should not assume that join will
  wait exactly as long as you specify.
There are three overloaded join functions.

join() 
public final void join()
puts the current thread on wait until the thread on which
it is called is dead if thread is interrupted then 
it will throw iterruptedException

join(long millis)
public final synchronized void join(long millis)
put the current thread on wait until the thread 
which on called dead or wait for sepicified time(milliseconds) 


join(long millis, int nanos)
public final synchronized void join(long millis, int nanos)
public final synchronized void join(long millis)
put the current thread on wait until the thread 
which on called dead or wait for sepicified 
time(milliseconds + nanos) 
 */

public class ThreadJoining extends Thread{
	public void run() {
		for(int i = 0; i < 2; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Current Thread :" + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception has been caught" + e);
			}
			System.out.println(i);		
		}
		
	}
}
