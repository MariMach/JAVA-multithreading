package Ex3;

public class CompteBanque {
	private int solde;
	
	public CompteBanque(int solde) {
		this.solde = solde;
	}
	
	public int getSolde() {
		return this.solde;
	}
	
	public void retirer(int somme) {
		this.solde = this.solde - somme;
	}

}
