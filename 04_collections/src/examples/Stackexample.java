package examples;

import java.util.PriorityQueue;
import java.util.Stack;

public class Stackexample {

	public static void main(String[] args) {
		
		Stack<Worker> stack = new Stack<>();
		
		Worker aWorker = new Worker("Peter", 200);
		
		stack.push(aWorker);
		stack.push(aWorker);
		stack.push(aWorker);

		System.out.println("Is stack emtpty? " + stack.isEmpty());
		System.out.println("Size of stack: " + stack.size());
		
		stack.clear();
		
		stack.add(new Worker("Peter", 250));
		stack.add(new Worker("Manni", 220));
		stack.add(new Worker("Horst", 320));
		
		for (Worker worker : stack) {
			System.out.println(worker);
		}
		
		System.out.println();
		
		while (!stack.isEmpty()) {
			Worker worker = stack.pop();
			System.out.println(worker);
			System.out.println("Is workers emtpty? " + stack.isEmpty());
			System.out.println("Size of workers: " + stack.size());
		}		
		
	}

}
