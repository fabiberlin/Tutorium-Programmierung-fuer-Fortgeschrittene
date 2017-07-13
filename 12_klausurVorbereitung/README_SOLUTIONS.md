## Klausurvorbereitung

1. Inwiefern unterscheidet sich die objektorientierte Programmierung zur klassischen Programmierung?

2. Orden Sie die folgenden Komplexitäten aufsteigend:

  - 1
  - log(N)
  - N
  - 10*N
  - N*log(N)
  - N^2
  - N^N

3. Visualisieren Sie die obigen Komplexitäten in einem Koordinatensystem (z.B. Input / Zeit)!

  ![big O](https://images.duckduckgo.com/iu/?u=http%3A%2F%2Finteractivepython.org%2Frunestone%2Fstatic%2Fpythonds%2F_images%2Fnewplot.png&f=1)

4. Was ist der wesentliche Unterschied zwischen einem Stack und einer Queue?

  FIFO vs. LIFO

5. Gegeben sei folgender Code:

  ```java
  Stack<Object> a = new Stack<Object>();
  a.push(new Object());
  a.pop();
  a.pop();
  System.out.println(a.isEmpty());
  ```
  Was passiert bei der Kompilierung bzw. bei der Ausführung?
  - [ ] kann nicht kompiliert werden
  - [x] wirft eine Runtime Exception
  - [ ] es wird "true" auf der Konsole ausgegeben
  - [ ] es wird "false" auf der Konsole ausgegeben

6. Was ist ein Stack Overflow Error?

  Call Stack erreicht Maximum.

7. Es sei folgende Klasse gegeben:
  ```java
  class Person {
    int age;
    String name;
  }
  ```
  Implementieren Sie das __Comparable__ Interface!

  Hinweis:

  ```java
  public interface Comparable<T>{
      int compareTo(T o)
  }  
  ```

  ```java
  class Person implements Comparable<Person> {

  	int age;
  	String name;

  	@Override
  	public int compareTo(Person o) {
  		return Integer.compare(this.age, o.age);
  	}
  }
  ```

8. Es sei folgende Klasse gegeben:
  ```java
  class Book {
    String isbn;
    String title;
    String author;
  }
  ```
  Implementieren Sie eine vollfunktionsfähige __equals__ Methode (Überschreiben der aus Object geerbten equals Methode)!

  ```java
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
  ```

9. Benennen Sie 3 Collections und die wesentlichen Unterschiede zueinander!

10. Was ist Rekursion?

11. Was ist der Unterschied zwischen einem Graphen und einem Baum?

12. Definieren Sie ein Enum für die Himmelsrichtungen!

  ```java
  enum Direction{
  	NORTH, EAST, SOUTH, WEST
  }
  ```

13. Benennen Sie 5 Design Paterns!

  - Builder
  - Singleton
  - Bridge
  - Factory
  - Proxy

14. Es sein folgende Klasse gegeben:

  ```java
  class PrinterQueue {
      // some functionality
  }
  ```
  Setzen Sie für die die Klasse das Singleton Pattern um!

  ```java
  class PrinterQueue {

  	private static PrinterQueue instance;

  	private PrinterQueue(){

  	}

  	public static PrinterQueue getInstance() {
  		if (instance == null) instance = new PrinterQueue();
  		return instance;
  	}
  }
  ```

15. JUnit bietet die Funktion __setUp()__ und __tearDown()__ an. Wofür sind diese gedacht?

  Stellen sicher, dass alle Tests die gleichen Testumgebunngen bereit gestellt bekommen. Zudem können nach dem Test weitere Anweisung ausgeführt werden.  

16. Schreiben Sie eine rekursive Methode die Zahlen von 1 bis einer gegebenen Zahl (Parameter) aufsummiert.

  ```java
  int sumUp (int number){
      //code
  }
  ```

  ```java
  static int sumUp (int number){
      if (number <= 1) {
        return 1;
      }
      return number + sumUp(number - 1);
  }
  ```
17. Was macht die __pack()__ Funktion aus der JFrame Klasse (Swing)?

  Dimensionierung der Komponenten

18. Welche 3 Eigenschaften zeichnet ein Objekt in der objektorientierten Programmierung aus?

  - State
  - Behavior
  - Identity

19. Nenen Sie Eigenschaften / Typen von Graphen

  - gerichtet
  - gewichtet
  - acyclic
  - planar
  - zusammenhängend   

20. Wie verhält sich der Call Stack bei rekursiven Methoden?

  - wird aufgebaut bei Aufbau der Rekursion, abgebaut beim verlassen der Rekursion.

  21. Gegeben seien folgende Klassen:

    ```java
    class A {
    	private void method1(){}
    	protected void method2(){}
    	public static void method3(){}
    }

    class B extends A {}

    class C extends B {}
    ```

    Welcher der folgenden Statements ist unzulässig?
    ```java
    A a = new B();
    B b = new B();
    C c = new B(); // this one
    b.method1();   // this one
    b.method2();
    b.method3();
    B.method3();
    ```
