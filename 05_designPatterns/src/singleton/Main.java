package singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		President president1 = President.getInstance();
        President president2 = President.getInstance();

        System.out.println("Same President?");
        System.out.println(president1 == president2);
        
        president1.doStuff();
        //President.doStuff() //doesnt work - see the difference?
	}
}
