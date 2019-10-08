package packaage;

public class Course {
	  public static void main(String[] args) {
	    Contestant lievre = new Contestant("lievre", 8);
	    Contestant tortue = new Contestant("tortue", 2);
	    lievre.start();
	    tortue.start();
	    while (!tortue.isFinished() && !lievre.isFinished()) {
	      System.out.println("Courir ....");
	    }
	    if (lievre.isFinished()) {
	      System.out.println("Le gagnant est le lievre");
	      System.exit(1);
	    }
	    if (tortue.isFinished()) {
	      System.out.println("Le gagnant est la tortue");
	      System.exit(1);
	    }
	  }
	}

	class Contestant extends Thread {
	  private int finishLine;
	  private int position;
	  private int speed;
	  private boolean finished;

	  public Contestant(String name, int speed) {
	    super(name);
	    finishLine = 100;
	    this.speed = speed;
	  }

	  public boolean isFinished() {
	    return finished;
	  }

	  @Override
	  public void run() {
	    String threadName = Thread.currentThread().getName();
	    while (position < finishLine && !Thread.currentThread().isInterrupted()) {
	        position += speed;
	        System.out.println("Distance parcourue par " + threadName + " : " + position);
	        if (threadName.equals("lievre") && position >= 40) {
	          Thread.currentThread().interrupt();
	        }
	    }
	    if (!Thread.currentThread().isInterrupted()) {
	      finished = true;
	    }
	  }

	  @Override
	  public synchronized void start() {
	    super.start();
	  }
	}