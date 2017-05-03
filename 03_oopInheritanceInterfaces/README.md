## Objektorientierte Programmierung (Inheritance & Interfaces)

text & examples from http://www.ntu.edu.sg/home/ehchua/programming/java/J3b_OOPInheritancePolymorphism.html

### Inheritance

> In OOP, we often organize classes in hierarchy to avoid duplication and reduce redundancy. The classes in the lower hierarchy inherit all the variables (static attributes) and methods (dynamic behaviors) from the higher hierarchies. A class in the lower hierarchy is called a subclass (or derived, child, extended class). A class in the upper hierarchy is called a superclass (or base, parent class). By pulling out all the common variables and methods into the superclasses, and leave the specialized variables and methods in the subclasses, redundancy can be greatly reduced or eliminated as these common variables and methods do not need to be repeated in all the subclasses.

- Method Overriding
- Annotation
- super
- java.lang.Object
- Polymorphism

### Interfaces

> An interface is a contract for what the classes can do. It, however, does not specify how the classes should do it.
An interface provides a form, a protocol, a standard, a contract, a specification, a set of rules, an interface, for all objects that implement it. It is a specification and rules that any object implementing it agrees to follow.
In Java, abstract class and interface are used to separate the public interface of a class from its implementation so as to allow the programmer to program at the interface instead of the various implementation.
Interface Naming Convention: Use an adjective (typically ends with "able") consisting of one or more words. Each word shall be initial capitalized (camel-case). For example, Serializable, Extenalizable, Movable, Clonable, Runnable, etc.
