package examples;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Worker> queue = new LinkedList();
		
		queue.offer(new Worker("Peter", 250));
		queue.offer(new Worker("Manni", 220));
		queue.offer(new Worker("Horst", 320));
		
		while (!queue.isEmpty()) {
			Worker worker = queue.poll();
			System.out.println(worker);
			System.out.println("Is queue emtpty? " + queue.isEmpty());
			System.out.println("Size of queue: " + queue.size());
		}
		
		System.out.println();

		PriorityQueue<Worker> priorityQueue = new PriorityQueue<>();
		priorityQueue.offer(new Worker("Peter", 250));
		priorityQueue.offer(new Worker("Manni", 220));
		priorityQueue.offer(new Worker("Horst", 320));
		
		while (!priorityQueue.isEmpty()) {
			Worker worker = priorityQueue.poll();
			System.out.println(worker);
			System.out.println("Is priorityQueue emtpty? " + priorityQueue.isEmpty());
			System.out.println("Size of priorityQueue: " + priorityQueue.size());
		}

	}

}
