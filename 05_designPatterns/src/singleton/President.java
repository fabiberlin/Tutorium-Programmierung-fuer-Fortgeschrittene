package singleton;

public class President {
	
	// static variable for the president instance
	private static President instance;

	// make the constructor private
    private President (){
    	
    }

    // static method for getting the president instance
    public static President getInstance() {
        if (instance == null){
            instance = new President();
        }
        return instance;
    }
    
    public void doStuff(){
    	System.out.println("Busy..");
    }
}
