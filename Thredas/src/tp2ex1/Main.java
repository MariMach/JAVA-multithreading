package tp2ex1;

public class Main {


	public static void main(String args[]) {
		
		Banque banque = new Banque(100, 1000);
		for(int depuis = 0; depuis <banque.getncpmptes(); depuis++) {
			Runnable r = new Transferer(depuis, banque);
			new Thread(r).start();
		}
		System.out.println("Le solde Total est : " + banque.soldeTotal());
		
	}

}
