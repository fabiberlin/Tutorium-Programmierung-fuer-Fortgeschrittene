package interfaces;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		
		
		// Multithreading with Runnable Interface
		
		Worker worker1 = new Worker("roadbuilder", 1000);
		Worker worker2 = new Worker("digger operator", 100);
		
		Thread thread1 = new Thread(worker1);
		Thread thread2 = new Thread(worker2);
		
		thread1.start();
		thread2.start();
		
		
		// Sorting with Comparable Interface
		
		Worker[] myWorkers = new Worker[5];
		myWorkers[0] = new Worker("caretaker", 150);
		myWorkers[1] = new Worker("plumber", 160);
		myWorkers[2] = new Worker("painter", 90);
		myWorkers[3] = new Worker("engineer", 250);
		myWorkers[4] = new Worker("carpenter", 125);
		
		System.out.println(Arrays.toString(myWorkers));
		Arrays.sort(myWorkers);
		System.out.println(Arrays.toString(myWorkers));
	}
	
}
