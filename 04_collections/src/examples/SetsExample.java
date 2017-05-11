package examples;

import java.util.HashSet;
import java.util.Set;

public class SetsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Worker> set = new HashSet<>();
		
		Worker aWorker = new Worker("Peter", 200);
		
		System.out.println("Adding a Worker: " + set.add(aWorker));
		System.out.println("Adding a Worker: " + set.add(aWorker));
		System.out.println("Adding a Worker: " + set.add(new Worker("Jürgen", 560)));
		System.out.println("Adding a Worker: " + set.add(new Worker("Manni", 100)));
		System.out.println("Adding a Worker: " + set.add(new Worker("Hans", 450)));
		
		for (Worker worker : set) {
			System.out.println(worker);
		}

	}

}
