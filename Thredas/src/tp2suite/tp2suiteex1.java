package tp2suite;

public class tp2suiteex1 extends Thread{
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Je suis le premier thread "+ Thread.currentThread().getName());
				for(int i = 114; i < 123; i++) {
					char b = (char) i;
					System.out.println(b);
				}
				for(int j = 65; j < 82; j++) {
					char c = (char) j;
					System.out.println(c);
				}
			}
		
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Je suis le deuxieme thread "+ Thread.currentThread().getName());
				
				for(int i = 1; i <= 60; i++) {
					int reste = i % 2;
		            if (reste != 0) {
		            	System.out.println(i);		            }
				}
			}
			
		});
		
		thread1.start();
		thread2.start();
	}

}
