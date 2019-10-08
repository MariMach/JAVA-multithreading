package Tp2suiteex2;


public class Test  implements Runnable {
		private CompteEnBanque compte;
		

		
		public Test (CompteEnBanque compte){
			this.compte = compte;			
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Compte "+ compte.getnbCompte()+ " " + Thread.currentThread().getName() + " Bienvenue ");
			
			for(int i = 0; i < 5; i++) {
				synchronized(this.compte) {
					demandeRetrait(compte);	
				}
			}
			System.out.println(" Compte "+ compte.getnbCompte() + " " + Thread.currentThread().getName() + " " +" Votre  Solde est " + compte.getSolde());
		}
		
		
		public void demandeRetrait(CompteEnBanque compte) {
				
			int somme = (int)(Math. random()*(compte.getSolde()));
			if (somme > compte.getSolde() ) {
				System.out.println(" Compte "+ compte.getnbCompte() +" Pas assez d’argent pour "+Thread.currentThread().getName());
			} else {
				System.out.println(" Compte "+ compte.getnbCompte() + " "+Thread.currentThread().getName() + " est sur le point de retirer la somme "+ somme +" Solde Actuel " + compte.getSolde());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				compte.retirerArgent(somme);
				System.out.println(" Compte "+ compte.getnbCompte() + " "+Thread.currentThread().getName() + " à compléter le retrait.  Solde " + compte.getSolde());
			}
	
		}
}
