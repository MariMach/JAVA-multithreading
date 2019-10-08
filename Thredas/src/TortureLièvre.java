
public class TortureLièvre {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread torture = new Thread(new courir(10), "Torture");
		Thread lièvre = new Thread(new courir(50), "Lièvre");
		torture.start();
		lièvre.start();

	}

}

class courir implements Runnable {
	private  int pas;
	private final int distance = 1000;
	private  String winner; 
	
	
	public courir(int v) {
		this.pas = v;
	}

	@Override
	public void run() {
		String threadname = Thread.currentThread().getName();
		int i = 0;
		while(i < distance   && !Thread.currentThread().isInterrupted()) {
			i = i + pas;
			System.out.println("Distance parcourue par " + threadname + " " + i);
			if(threadname == "Lièvre" && i>400) {
				Thread.currentThread().interrupt();
				System.out.println("isinterrupted");
			}
			if(i == 1000) {
				winner = threadname;
				System.out.println("Le vainqueur est " + winner);
			}
		}
	}
}
