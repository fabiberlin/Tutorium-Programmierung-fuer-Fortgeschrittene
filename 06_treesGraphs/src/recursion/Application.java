package recursion;

public class Application {
	
	public static void main(String[] args) {
		
		sayHelloNTimes(5);
		System.out.println(sumUpTill(4));
		System.out.println(multiplyUpTill(4));
	}
	
	private static void sayHelloNTimes(int number){
		if (number <= 0) {
			return;
		}
		System.out.println("Hello");
		sayHelloNTimes(number - 1);
	}
	
	private static int sumUpTill(int number){
		if (number <= 0) {
			return 0;
		}
		return number + sumUpTill(number - 1);
	}
	
	private static int multiplyUpTill(int number){
		if (number <= 1) {
			return 1;
		}
		return number * multiplyUpTill(number - 1);
	}
	
}
