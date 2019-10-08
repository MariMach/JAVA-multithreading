package Ex3;



public class SanjiEtRobinJob  implements Runnable {
	private CompteBanque compte;
	private int somme;

	
	public SanjiEtRobinJob (int somme, CompteBanque compte){
		this.compte = compte;
		this.somme = somme;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i< 4; i++) {
			synchronized(this.compte) {
				demandeRetrait(compte);
			}
		}
		
			
	}
	
	
	public void demandeRetrait(CompteBanque compte) {
		if (somme > compte.getSolde() ) {
			System.out.println("Pas assez d’argent pour "+Thread.currentThread().getName());
		} else {
			System.out.println(Thread.currentThread().getName() + " est sur le point de retirer. Solde " + compte.getSolde());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " reveillé.");
			compte.retirer(somme);
			System.out.println(Thread.currentThread().getName() + " à compléter le retrait.  Solde " + compte.getSolde());
		}
		
		
	}

	public static void main(String[] args) {
		
		CompteBanque comptebanque1 = new CompteBanque(90000);
		
		Thread th1 = new Thread(new SanjiEtRobinJob(50000, comptebanque1));
		Thread th2 = new Thread(new SanjiEtRobinJob(40000, comptebanque1));
		th1.start();
		th2.start();	
		
	}
		
}