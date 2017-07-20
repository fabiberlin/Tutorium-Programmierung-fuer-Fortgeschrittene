import java.util.ArrayList;
import java.util.Random;

public class BSTApp {

	public static void main(String[] args) {
		
		Random r = new Random(3);
		BST bst = new BST();
		
		for (int i = 0; i < 10; i++) {
			int number = r.nextInt(100);
			System.out.print("Add Number " + number);
			boolean added = bst.add(number);
			System.out.print(" " + added + "\n");
		}
		
		bst.print();
		
		ArrayList<Integer> ints = new ArrayList();		
		
		Callback callback = new Callback() {			
			@Override
			public void handle(Node node) {
				System.out.println(node.getValue());
				ints.add(node.getValue());
			}
		};
		

		bst.doInOrder(callback);
		System.out.println(ints);
	}

}
