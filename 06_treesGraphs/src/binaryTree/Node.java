package binaryTree;

public class Node {
	
	private Node leftChild;
	private Node rightChild;
	
	private int data;

	public Node(int data) {
		this.data = data;
	}
	
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	
	public Node getLeftChild() {
		return leftChild;
	}
	
	public Node getRightChild() {
		return rightChild;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Node with data: "+ this.data;
	}	

}
