package examples;

import java.util.ArrayList;

public class ListsExample {

	public static void main(String[] args) {
		
		ArrayList<Worker> workers = new ArrayList<>();
		
		System.out.println("Is workers emtpty? " + workers.isEmpty());
		System.out.println("Size of workers: " + workers.size());
		
		workers.add(new Worker("Peter", 200));
		System.out.println("# Added a worker");
		
		System.out.println("Is workers emtpty? " + workers.isEmpty());
		System.out.println("Size of workers: " + workers.size());
		
		workers.add(new Worker("Hans", 120));
		workers.add(new Worker("Jürgen", 180));
		workers.add(new Worker("Manni", 60));
		System.out.println("# Added some more workers");
		
		System.out.println("Is workers emtpty? " + workers.isEmpty());
		System.out.println("Size of workers: " + workers.size());
		
		System.out.println("# Iterating over collections");
		for (Worker worker : workers) {
			System.out.println(worker);
		}
		
		System.out.println("# Getting a specific element"); //only possible with ArrayList
		Worker aWorker = workers.get(2);
		System.out.println(aWorker);
		
		System.out.println("# Removing a specific element"); //only possible with ArrayList
		aWorker = workers.remove(2);
		System.out.println("Removed: "+aWorker);
		System.out.println("Is workers emtpty? " + workers.isEmpty());
		System.out.println("Size of workers: " + workers.size());
		
		System.out.println("Clearing");
		workers.clear();
		System.out.println("Is workers emtpty? " + workers.isEmpty());
		System.out.println("Size of workers: " + workers.size());
		
	}

}
