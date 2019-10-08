import java.util.Random;

/*
 	- static Thread currentThread() : Permet d'obtenir le thread courant.
	- static void yield() : Laisse une chance aux autres threads de s'ex�cuter.
	- static void sleep(long ms) throws InterruptedException : Suspend l'ex�cution du thread appelant pendant la dur�e indiqu�e 
	(ne pas utiliser ceci � des fins de synchronisation !).
	- void interrupt() : provoque soit la lev�e de l'exception InterruptedException 
	si l'activit� est bloqu�e sur une op�ration de synchronisation, soit le positionnement d'un indicateur interrupted.
	- void join() : Attente bloquante de la terminaison de l'ex�cution du thread 
	(jusqu'� ce que la m�thode run() associ�e au Thread ait fini de s'ex�cuter) 
 
 */

public class ExampleInterrupt {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Starting");
		
		Thread t = new Thread(new Runnable() {

			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Random ran = new Random();
				for(int i=0; i<1E8; i++) {
					if(Thread.currentThread().isInterrupted()) {
						System.out.println("We 've been interrupted");
						break;
					}
					Math.sin(ran.nextDouble());
					//System.out.println("running");
				}
				
			}
			
		});
			
		t.start();
		Thread.sleep(500);
		t.interrupt();
		t.join();
		
		System.out.println("Finishing");
	}
}
