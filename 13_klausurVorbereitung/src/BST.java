
/*
 * http://www.algolist.net/Data_structures/Binary_search_tree
 */
public class BST {

	private Node root;

	public BST() {
		root = null;
	}

	public boolean add(int value) {
		if (root == null) {
			root = new Node(value);
			return true;
		} else
			return root.add(value);
	}

	public boolean search(int value) {
		if (root == null)
			return false;
		else
			return root.search(value);
	}
	
	public void printInOrder(Node currentNode){
		if (currentNode == null) {
			return;
		}
		printInOrder(currentNode.getLeftChild());
		System.out.println(currentNode.getValue() + " ");
		printInOrder(currentNode.getRightChild());
	}
	
	public void print() {
		printInOrder(root);
	}
	
	public void inOrder(Node currentNode, Callback callback){
		if (currentNode == null) {
			return;
		}
		inOrder(currentNode.getLeftChild(), callback);
		callback.handle(currentNode);
		inOrder(currentNode.getRightChild(), callback);
	}
	
	public void doInOrder(Callback callback) {
		inOrder(root, callback);
	}

}
