package Tp2suiteex2;

public class Main {
	
//Thread(String name)


	
	public static void main(String[] args) {
		
		CompteEnBanque comptebanque1 = new CompteEnBanque(90000, 1);
		CompteEnBanque comptebanque2 = new CompteEnBanque(10000, 2);
		
		Thread th1 = new Thread(new Test(comptebanque1) , "Client1");
		
		Thread th2 = new Thread(new Test(comptebanque2) , "Client2");
		Thread th3 = new Thread(new Test(comptebanque2) , "Client3");
		
		th1.start();	
		th2.start();
		th3.start();
	}

}