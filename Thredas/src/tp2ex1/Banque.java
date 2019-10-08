package tp2ex1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banque{
	
	final double[] comptes;
	private double soldetotal = 0;
	
	 Banque(int ncomptes, double solde) {
		this.comptes = new double[ncomptes];
		for (int i = 0; i < ncomptes; i++) {
		      this.comptes[i] = solde;
		}	
	}
	 
	 
	 
	 public  double soldeTotal() {
		 for(int i = 0; i < this.comptes.length; i++) {
			soldetotal =soldetotal + this.comptes[i]; 
		 }
		 return soldetotal;
	 }
	 
	 
	 
	 public int getncpmptes(){
		 return this.comptes.length;
	 }
	 
	 
	/* 
	 public synchronized void transferer(int depuis, int vers, double montant) throws InterruptedException {
			while(this.comptes[depuis] < montant) {
				System.out.println("Solde Insuffisant\n");
				wait();
			}
			this.comptes[depuis] -= montant;
			this.comptes[vers] += montant;
			notifyAll();	 
		}
	 */
	 
	 private Lock bankLock = new ReentrantLock(); //implements Lock interface
	 private Condition soldeSuffisant = bankLock.newCondition();
	 
	 public void transferer(int de, int vers, double m) throws InterruptedException {
		 		bankLock.lock();
		 		try{
					 if(comptes[de] < m) {
						 soldeSuffisant.await(); //attendre la condition
						 System.out.println("Solde Insuffisant\n");
					 }
							 comptes[de] -= m;
							 comptes[vers] += m;
							 soldeSuffisant.signalAll(); //débloquer les threads attendant la condition
		 			}
		 		finally{
		 				bankLock.unlock();
				}
	 }
	 
}





