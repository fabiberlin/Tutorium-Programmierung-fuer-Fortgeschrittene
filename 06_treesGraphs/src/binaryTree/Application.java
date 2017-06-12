package binaryTree;

import java.util.Random;

public class Application {

	public static void main(String[] args) {
		
		Random random = new Random(0);
		
		Node[] nodes = new Node[7];
		for (int i = 0; i < nodes.length; i++) {
			nodes[i] = new Node(random.nextInt(100));
			//System.out.println(nodes[i]);
		}
		
		nodes[0].setLeftChild(nodes[1]);
		nodes[0].setRightChild(nodes[2]);
		
		nodes[1].setLeftChild(nodes[3]);
		nodes[1].setRightChild(nodes[4]);
		
		nodes[2].setLeftChild(nodes[5]);
		nodes[2].setRightChild(nodes[6]);
		
		System.out.println();
		
		TreeTraversal.preOrder(nodes[0]);
		
		System.out.println();
		
		TreeTraversal.inOrder(nodes[0]);
		
		System.out.println();
		
		TreeTraversal.postOrder(nodes[0]);
	}

}
