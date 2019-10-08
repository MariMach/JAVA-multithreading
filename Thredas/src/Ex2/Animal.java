package Ex2;

public class Animal extends Thread{
	  private int position;
	  private String name;
	  private final int distanceTotale = 100;
	  private int vitesse;
	  
	  public Animal(String name, int vitesse) {
		  this.name = name;	
		  this.vitesse = vitesse;
	  }
	  
	public void run() {
		super.run();
		
	    while (position < distanceTotale && !Thread.currentThread().isInterrupted()) {
	    	
	        position += vitesse;
	        System.out.println("Distance parcourue par " + name + " : " + position);
	        
	        if (name.equals("Lievre") && position >= 49) {
	        	Thread.currentThread().interrupt();
	        	System.out.println(name + "  DORT !!!!!");
	        }
	    }    
		    
		    if (!Thread.currentThread().isInterrupted()) {
		    	System.out.println("Le gagnant est la " + name);
		    }
	}
}


	  
	  
	  
	  