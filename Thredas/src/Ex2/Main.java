package Ex2;

public class Main {
	public static void main(String[] args) {
			Thread lievre= new Thread(new Animal("Lievre", 8));
			Thread tortue= new Thread(new Animal("Tortue", 2));
			
			//A vosmarques, prêt partez!!
			
			tortue.start();
			lievre.start();		
	  }
}
