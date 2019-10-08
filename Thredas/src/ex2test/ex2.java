package ex2test;


public class ex2 {
	  private String name;
	  private final static int distanceTotale = 100;
	  private static int vitesse;
	  private  static int position1 = 0, position2 = 0;
	  
	  public ex2(String name, int vitesse) {
		  this.name = name;	
		  this.vitesse = vitesse;
	  }
	
	public static void main(String[] args) {
		Thread lievre= new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(position1 < distanceTotale && position2 < distanceTotale) {
					position1 += 8;
					System.out.println("Distance parcourue par  lievre"   + " : " + position1);
					if(position1 > 50) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				
				}
				
			}
			
		});
		Thread tortue= new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(position1 < distanceTotale && position2 < distanceTotale) {
					position2 += 2;
					Thread.yield();
					System.out.println("Distance parcourue par  tortue"   + " : " + position2);
				}
				if(position2 >= distanceTotale) {
					System.out.println("la torutue a gagne ");
				} else {
					System.out.println("la lievre a gagne ");
				}
			}
			
		});
		
		//A vosmarques, prêt partez!!
		
		tortue.start();
		lievre.start();		
  }
}


	  