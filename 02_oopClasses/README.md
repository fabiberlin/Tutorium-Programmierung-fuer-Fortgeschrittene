## Objektorientierte Programmierung (Klassen)

### OOP

- abstraction
- encapsulation
- class as blueprint
- objects as instances of classes
- objects have state (fields) and behavior (methods)
- class syntax
- constructor

### Dog Class (live coding)

- String name
- int birthyear
- int happinessLevel
- String getName()
- int getAge()
- int getHappinessLevel()
- void bark()
- void eat()
- String toString()


- initializing
- dot notation
- state & behavior of different objects
- short introduction to interfaces (Barkable) - Comparable, Runnable, Cloneable, ...
- instance of

### Clock Class (exercise)

Create an abstraction of a clock. A clock is represented by hours and minutes. These values can be saved as integers.

Create 2 constructors. An parameterless one, which sets the time to 0:00, and an overloaded constructor, which sets the time to the corresponding values.

Create getters and setters for the fields. Ensure, it is not possible to set a non-valid time (like 56:63). Instead of exception handling you can set the value to 0.

(For the bored) Add an alarm. Is it possible to represent the alarm as a type of "Clock"? Create a method for setting and for removing the alarm.

A non-ticking clock is useless. So implement a tick() method. This should increase the time by one minute (What happens to the minutes at a value of 59? What to the value of the hours?). If you implemented an alarm - make noise (at the console)!

Implement a toString() and an equals() method. These can help you.

Test your Clock in a  main() method. Everything works?

#### Class Structure for Clock if you don't know how to start (example)

##### fields
- int hour
- int minute
- Clock alarm

##### constructors
- Clock()
- Clock(int hour, int minute)

##### methods
- int getHour()
- void setHour(int hour)
- int getMinute()
- void setMinute(int minute)
- void setAlarm(int hour, int minute)
- void removeAlarm()
- void tick()
- String toString()
- boolean equals(Object obj)
