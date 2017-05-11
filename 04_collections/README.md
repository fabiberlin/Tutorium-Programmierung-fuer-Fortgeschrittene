## Collections

Überblick: http://www.codejava.net/java-core/collections/java-collections-framework-summary-table

Prinzipiell gibt es 3 goße Abgrenzungen

- Lists
- Sets
- Maps

Hinzu kommen noch 2 Spezialfälle - Stacks and Queues.

### Lists
- Erlauben Duplikate
- geordnet nach Index
- generell nicht sortiert

### Sets
- Erlauben keine Duplikate

### Maps
- Ordnen einem Key einen Wert zu
- Erlauben keine Duplikate im Key

Collection class | Duplicate elements | Ordered | Sorted | Thread-safe
---- | ---- | ---- | ---- | ----
__ArrayList__ | Yes | Yes | No | No
__LinkedList__ | Yes | Yes | No | No
Vector | Yes | Yes | No | Yes
__HashSet__ | No | No | No | No
LinkedHashSet | No | Yes | No | No
TreeSet | No | Yes | Yes | No
__HashMap__ | No | No | No | No
LinkedHashMap | No | Yes | No | No
Hashtable | No | No | No | Yes
TreeMap | No | Yes | Yes | No

### Generics

Collections sind alle generisch. Das bedeutet, ihr gebt bei der Deklaration und Inialitierung der Collection den Datentyp an, welche später mit in die Collection aufgenommen werden kann. Das erfolgt in den spitzen Klammern (<>).

### Wrapper

Man kann nicht einfach primitive Datentypen wie int, double, etc. in Collections abspeichern. Daher wurden _Wrapper_ Klassen eingefürt. Diese überführen primitive Datentypen in komplexe Datentypen.
- int - Integer
- float - Float
- boolean - Boolean
- ...

```java
int i = 42;
Integer iInAWrapper = new Integer(i);
someCollection.add(iInAWrapper);
```

### Stacks

Sind eine spezielle Datenstruktur, die dem "Last In, First Out" (LIFO) Prinzip folgen.

- push()
- pop()

### Queues

Auch Warteschlkange genannt. Hier gilt das Prinzip "First In, First Out" (FIFO). (LinkedList implementiert das Queue Interface!)

- offer()
- poll()

Als Speziallfall gilt die PriorityQueue. Hier werden die Elemete je nach "Gewichtung" aus der Warteschlange gezogen. Dazu muss jedoch Comparable implemnentiert werden, sodass ein Vergleich unter den Elementen stattfinden kann.
