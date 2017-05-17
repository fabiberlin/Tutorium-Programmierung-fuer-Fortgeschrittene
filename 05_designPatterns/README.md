## Design Patterns

> Design patterns are formalized best practices that the programmer can use to solve common problems when designing an application or system.

>Design patterns can speed up the development process by providing tested, proven development paradigms.

>Reusing design patterns helps to prevent subtle issues that can cause major problems, and it also improves code readability for coders and architects who are familiar with the patterns. -
[link](https://github.com/iluwatar/java-design-patterns)

- Creational patterns
- Structural patterns
- Behavioral patterns
- (Concurrency patterns)

Samples of implemented Design Patterns:

- https://github.com/kamranahmedse/design-patterns-for-humans
- https://github.com/iluwatar/java-design-patterns

Today:
 - Factory (creational pattern)
 - Singleton (creational pattern)
 - Builder (creational pattern)
 - Memento (behavioral pattern)

### Factory

> In class-based programming, the factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method—either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor. -
[link](https://en.wikipedia.org/wiki/Factory_method_pattern)

### Singleton

> In software engineering, the singleton pattern is a software design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system. The concept is sometimes generalized to systems that operate more efficiently when only one object exists, or that restrict the instantiation to a certain number of objects. The term comes from the mathematical concept of a singleton. - [link](https://en.wikipedia.org/wiki/Singleton_pattern)

### Builder

> The builder pattern is an object creation software design pattern. Unlike the abstract factory pattern and the factory method pattern whose intention is to enable polymorphism, the intention of the builder pattern is to find a solution to the telescoping constructor anti-pattern[citation needed]. The telescoping constructor anti-pattern occurs when the increase of object constructor parameter combination leads to an exponential list of constructors. Instead of using numerous constructors, the builder pattern uses another object, a builder, that receives each initialization parameter step by step and then returns the resulting constructed object at once. - [link](https://en.wikipedia.org/wiki/Builder_pattern)

### Memento

> The memento pattern is a software design pattern that provides the ability to restore an object to its previous state (undo via rollback). - [link](https://en.wikipedia.org/wiki/Memento_pattern)
