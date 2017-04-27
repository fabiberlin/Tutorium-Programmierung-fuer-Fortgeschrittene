package live;
import java.util.Calendar;

public class Dog implements Barkable{
	
	private String name;
	private int birthyear;
	int happinesslevel;
	
	public Dog(String name) {
		this.name = name;
		this.birthyear = Calendar.getInstance().get(Calendar.YEAR);
	}

	public String getName() {
		return this.name;
	}
	
	public int getAge(){
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		return currentYear - this.birthyear;
	}
	
	public int getHappinesslevel() {
		return this.happinesslevel;
	}
	
	public void bark(){
		System.out.println("Wuff Wuff");
	}
	
	public void eat() {
		this.happinesslevel++;
	}
	
	public String toString() {
		return "------------------" +
				"\nName: " + this.name + 
				"\nBirthyear: " + this.birthyear + 
				"\nHappinesslevel: " + this.happinesslevel +
				"\n------------------";
	}
	
}