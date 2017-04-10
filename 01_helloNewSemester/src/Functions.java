
public class Functions {

	public static void main(String[] args) {
		sayWelcomeToMe();
		
		sayWelcomeTo("Peter");
		
		sayAdvancedWelcome("Juergen", "nice");
		
		sayWelcome("Herbert", "Heidi", "Hans");
		sayWelcome("Lutz");
		
		int answer = answerToTheUltimateQuestionOfLifeTheUniverseAndEverything();
		System.out.println(answer);
		
		int anotherNumber = twoTimes(77);
		System.out.println(anotherNumber);
		
		callByCopyIncremnt(anotherNumber);
		System.out.println(anotherNumber); //no changes!
		
	}
	
	static void sayWelcomeToMe(){
		System.out.println("Hello Fabian");
	}
	
	static void sayWelcomeTo(String aName){
		System.out.println("Hello " + aName);
	}
	
	static void sayAdvancedWelcome(String aName, String weather){
		System.out.println("Hello " + aName + ", what a " + weather + " weather");
	}
	
	static void sayWelcome(String... names){
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			System.out.println("Hello " + name);			
		}
	}
	
	static int answerToTheUltimateQuestionOfLifeTheUniverseAndEverything(){
		return 42;
	}
	
	static int twoTimes(int number){
		return 2 * number;
	}
	
	static void callByCopyIncremnt(int number){
		number++;
	}

}
