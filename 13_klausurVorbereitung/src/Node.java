/*
 * http://www.algolist.net/Data_structures/Binary_search_tree
 */
public class Node {

	private int value;
	private Node leftChild;
	private Node rightChild;

	public Node(int value) {
		this.value = value;
		leftChild = null;
		rightChild = null;
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public int getValue() {
		return value;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	public boolean add(int value) {
		if (value == this.value)
			return false;
		else if (value < this.value) {
			if (leftChild == null) {
				leftChild = new Node(value);
				return true;
			} else
				return leftChild.add(value);
		} else if (value > this.value) {
			if (rightChild == null) {
				rightChild = new Node(value);
				return true;
			} else
				return rightChild.add(value);
		}
		return false;
	}

	public boolean search(int value) {
		if (value == this.value)
			return true;
		else if (value < this.value) {
			if (leftChild == null)
				return false;
			else
				return leftChild.search(value);
		} else if (value > this.value) {
			if (rightChild == null)
				return false;
			else
				return rightChild.search(value);
		}
		return false;
	}

	public int minValue() {
		if (leftChild == null)
			return value;
		else
			return leftChild.minValue();
	}

}
