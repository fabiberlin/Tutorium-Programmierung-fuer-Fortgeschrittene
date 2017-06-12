package binaryTree;

public abstract class TreeTraversal {
	
	public static void preOrder(Node currentNode){
		if (currentNode == null) {
			return;
		}
		System.out.println(currentNode);
		inOrder(currentNode.getLeftChild());
		inOrder(currentNode.getRightChild());
	}
	
	public static void inOrder(Node currentNode){
		if (currentNode == null) {
			return;
		}
		inOrder(currentNode.getLeftChild());
		System.out.println(currentNode);
		inOrder(currentNode.getRightChild());
	}
	
	public static void postOrder(Node currentNode){
		if (currentNode == null) {
			return;
		}
		inOrder(currentNode.getLeftChild());
		inOrder(currentNode.getRightChild());
		System.out.println(currentNode);
	}

}
