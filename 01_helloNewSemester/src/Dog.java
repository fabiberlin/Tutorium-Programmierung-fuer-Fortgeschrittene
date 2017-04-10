import java.util.Calendar;

public class Dog {
		
		private String name;
		private int birthyear;
		
		public Dog(String name) {
			this.name = name;
			this.birthyear = Calendar.getInstance().get(Calendar.YEAR);
		}
		
		public String getName() {
			return name;
		}
		
		public int getAge(){
			int currentYear = Calendar.getInstance().get(Calendar.YEAR);
			return currentYear - birthyear;
		}
		
		public void bark(){
			System.out.println("Wuff Wuff");
		}
		
		public String toString() {
			return "Name: " + this.name + "\nBirthyear: " + this.birthyear;
		}
		
	}