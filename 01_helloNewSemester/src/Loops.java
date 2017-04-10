
public class Loops {

	public static void main(String[] args) {
		
		int border = 10; 
		
		// while loop
		int counter = 0;
		while (counter < border) {
			System.out.println(counter);
			counter++;
		}
		
		// do while loop
		counter = 0;
		do {
			System.out.println(counter);
			counter++;
		} while (counter < border);
		
		// for loop
		for (counter = 0; counter < border; counter++) {
			System.out.println(counter);			
		}
		
		// endless loop with break
		counter = 0;
		while(true){
			if (counter >= border) {
				break;
			}
			System.out.println(counter);
			counter++;
		}
		
		// using continue
		for (counter = -10; counter < 2*border; counter++) {
			if (counter < 0 || counter >= border) {
				continue;
			}
			System.out.println(counter);			
		}

	}

}
