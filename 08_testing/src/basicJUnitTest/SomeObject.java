package basicJUnitTest;

public class SomeObject {
	
	private int value;
		
	public SomeObject(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void increment(){
		this.value++;
	}
}
