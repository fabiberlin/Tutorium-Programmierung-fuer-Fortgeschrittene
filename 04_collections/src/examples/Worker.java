package examples;


public class Worker implements Runnable, Comparable<Worker> {
	
	private String name;
	private int duration;

	public Worker(String name, int duration) {
		this.name = name;
		this.duration = duration;
	}

	public void run() {
		
		while(true){
			
			System.out.println("I'm doing hard work ("+this.name+")");
			
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
		return "I'm " + this.name + " (" + this.duration + ")";
	}

}
