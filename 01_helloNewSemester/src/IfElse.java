
public class IfElse {

	public static void main(String[] args) {
		int i = 11;
		
		// simple if
		if (i < 20) {
			System.out.println("Less than 20");
		}
		
		// simple if with logic AND
		if (i > 0 && i < 40) {
			System.out.println("Greater than 0 and less than 40");
		}
		
		// if else
		if (i > 0) {
			System.out.println("Greater than 0");
		} else {
			System.out.println("Less than 0");
		}
		
		// if elseif else
		if (i > 0) {
			System.out.println("Greater than 0");
		} else if (i < 0){
			System.out.println("Less than 0");
		} else {
			System.out.println("Is 0");
		}
		
		// nested if
		if (i > 10) {
			if (i < 20) {
				System.out.println("Greater than 10 and less than 20");
			}
		}
	}

}
