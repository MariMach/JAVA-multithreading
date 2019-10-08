package tp2ex1;

public class Transferer implements Runnable{
	private int de;
	private double m;
	private int vers;
	private Banque banque;
	
	Transferer(int de, Banque banque){
		this.banque = banque;
		this.de = de;
	}
	 

	@Override
	public void run() {
		vers = (int) (Math.random() * 100);
		 m = (double) (Math.random() * 1000);
		 
			// TODO Auto-generated method stub		
			 try {		
					banque.transferer(de, vers, m);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	}
