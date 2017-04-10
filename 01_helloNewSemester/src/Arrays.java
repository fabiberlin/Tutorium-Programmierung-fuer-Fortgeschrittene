
public class Arrays {
	
	public static void main(String[] args) {
		
		int[] array;
		array = new int[5];
		
		array[0] = 3;
		array[1] = 9;
		
		int sum = array[0] + array[1];
		System.out.println(sum);
		
		float[] anotherArray = {2f, 1.4f, 9.26f};
		
		for (int i = 0; i < anotherArray.length; i++) {
			System.out.println(anotherArray[i]);
		}
		
	}

}
