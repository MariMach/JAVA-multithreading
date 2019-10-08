package geeksforgeekssynchronized;

public class Main {
	public static void main(String args[]) {
		Sender sender = new Sender();
		Threadsend threadsend1 = new Threadsend("HI", sender);
		Threadsend threadsend2 = new Threadsend("Bye", sender);
		
		//starts two threads of threadsend type
		threadsend1.start();
		threadsend2.start();
		try {
			threadsend1.join();
			threadsend2.join();
		}catch(Exception e){
			System.out.println("INterrupted");
		}
	}
}
