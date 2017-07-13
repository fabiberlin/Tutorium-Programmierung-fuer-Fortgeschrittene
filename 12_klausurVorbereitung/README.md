## Klausurvorbereitung

1. Inwiefern unterscheidet sich die objektorientierte Programmierung zur klassischen Programmierung?

2. Orden Sie die folgenden Komplexitäten aufsteigend:

  - N^2
  - N*log(N)
  - N^N
  - N
  - log(N)
  - 1
  - 10*N

3. Visualisieren Sie die obigen Komplexitäten in einem Koordinatensystem (z.B. Input / Zeit)!

4. Was ist der wesentliche Unterschied zwischen einem Stack und einer Queue?

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
  - [ ] wirft eine Runtime Exception
  - [ ] es wird "true" auf der Konsole ausgegeben
  - [ ] es wird "false" auf der Konsole ausgegeben

6. Was ist ein Stack Overflow Exception

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

8. Es sei folgende Klasse gegeben:
  ```java
  class Book {
    String isbn;
    String title;
    String author;
  }
  ```
  Implementieren Sie eine vollfunktionsfähige __equals__ Methode (Überschreiben der aus Object geerbten equals Methode)!

9. Benennen Sie 3 Collections und die wesentlichen Unterschiede zueinander!

10. Was ist Rekursion?

11. Was ist der Unterschied zwischen einem Graphen und einem Baum?

12. Definieren Sie ein Enum für die Himmelsrichtungen!

13. Benennen Sie 5 Design Paterns!

14. Es sein folgende Klasse gegeben:

  ```java
  class PrinterQueue {
      // some functionality
  }
  ```
  Setzen Sie für die die Klasse das Singleton Pattern um!

15. JUnit bietet die Funktion __setUp()__ und __tearDown()__ an. Wofür sind diese gedacht?

16. Schreiben Sie eine rekursive Methode die Zahlen von 1 bis einer gegebenen Zahl (Parameter) aufsummiert.

  ```java
  int sumUp (int number){
      //code
  }
  ```
17. Was macht die __pack()__ Funktion aus der JFrame Klasse (Swing)?

18. Welche 3 Eigenschaften zeichnet ein Objekt in der objektorientierten Programmierung aus?

19. Nenen Sie Eigenschaften / Typen von Graphen

20. Wie verhält sich der Call Stack bei rekursiven Methoden?

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
  C c = new B();
  b.method1();  
  b.method2();
  b.method3();
  B.method3();
  ```
