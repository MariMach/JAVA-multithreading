
public class tortlievGlobal {
	private static final int distance = 1000;
	private  static String winner; 
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Thread torture = new Thread(new courir(10), "Torture");
		//Thread li�vre = new Thread(new courir(50), "Li�vre");
		//torture.start();
		//li�vre.start();

	}

		class courir implements Runnable {
			private  int pas;
			public courir(int v) {
				this.pas = v;
			}
		
			@Override
			public void run() {
				String threadname = Thread.currentThread().getName();
				int i = 0;
				while(i < distance && !Thread.currentThread().isInterrupted()) {
					i = i + pas;
					System.out.println("Distance parcourue par " + threadname + " " + i);
					if(threadname == "Li�vre" && i>400) {
						Thread.currentThread().interrupt();
					}
					if(i == 1000) {
						winner = threadname;
						System.out.println("Le vainqueur est " + winner);
					}
				}
			}
		}

}