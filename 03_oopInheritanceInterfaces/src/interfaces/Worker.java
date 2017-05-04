package interfaces;

public class Worker implements Runnable, Comparable<Worker> {
	
	private String job;
	private int duration;

	public Worker(String job, int duration) {
		this.job = job;
		this.duration = duration;
	}

	public void run() {
		
		while(true){
			
			System.out.println("I'm doing hard work ("+this.job+")");
			
			try {
				Thread.sleep(duration);
			} catch (InterruptedException e) {
				return;
			}
		}

	}

	public int compareTo(Worker o) {
		if (this.duration < o.duration) {
			return -1;
		}
		if (this.duration > o.duration) {
			return 1;
		}
		return 0;
	}
	
	public String toString() {
		return "I'm a " + this.job + " (" + this.duration + ")";
	}

}
