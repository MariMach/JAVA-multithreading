package Tp2suiteex2;

public class CompteEnBanque {
	
	private int solde;
	private int nbcompte;
	
	public CompteEnBanque(int solde, int nbcompte) {
		this.solde = solde;
		this.nbcompte = nbcompte;
	}
	
	public int getSolde() {
		return this.solde;
	}
	
	public int getnbCompte() {
		return this.nbcompte;
	}
	
	public void retirerArgent(int somme) {
		this.solde = this.solde - somme;
	}	
}
