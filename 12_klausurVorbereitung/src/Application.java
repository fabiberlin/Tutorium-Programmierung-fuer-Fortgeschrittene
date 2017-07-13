import java.util.Stack;

public class Application {

	public static void main(String[] args) {
		
//	  Stack<Object> a = new Stack<Object>();
//	  a.push(new Object());
//	  a.pop();
//	  a.pop();
//	  System.out.println(a.isEmpty());
		
		Person person = new Person();
		System.out.println(person);
		
		Book book = new Book();
		System.out.println(book);
		
		PrinterQueue printerQueue = PrinterQueue.getInstance();
		System.out.println(printerQueue);
		
		System.out.println(sumUp(2));
		
		A a = new B();
		B b = new B();
		//C c = new B();
		//b.method1();
		b.method2();
		b.method3();
		B.method3();
		
	  
	}
	
	static int sumUp (int number){
		if (number <= 1) {
			return 1;
		}
		return number + sumUp(number - 1);
	}
}

class Person implements Comparable<Person> {
	
	int age;
	String name;
	
	@Override
	public int compareTo(Person o) {
		return Integer.compare(this.age, o.age);
	}
}

class Book {
	
	String isbn;
	String title;
	String author;
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof Book)) return false;
		Book other = (Book) obj;
		return isbn.equals(other.isbn);
	}
}

class PrinterQueue {
	
	private static PrinterQueue instance;
	
	private PrinterQueue(){
		
	}
	
	public static PrinterQueue getInstance() {
		if (instance == null) instance = new PrinterQueue();
		return instance;
	}
}

enum Direction{
	NORTH, EAST, SOUTH, WEST
}

class A {
	private void method1(){}
	protected void method2(){}
	public static void method3(){}
}

class B extends A {}

class C extends B {}
