# Klausurvorbereitung

- Swing
- File IO
- Binary Search Tree

## Swing

Erstellen primitiver GUI / Komponenten mittels der **paint()** Methode

```java
@Override
public void paint(Graphics g) {
    //TODO
}
```

Beispielhaft hier mittels der vorhandenen Methoden des Graphics Kontextes:

- setColor
- fillOval
- drawOval
- fillRect
- drawChars

Implementation in _src/GuiCustomDraw.java_

![GUI](https://github.com/fabiberlin/Tutorium-Programmierung-fuer-Fortgeschrittene/blob/master/13_klausurVorbereitung/GuiCustomDraw_035.png?raw=true)

## File IO

Für das Einlesen von Textdateien bietet sich das folgenede Codebeispiel an. Hier wird das try-with-resources Statement verwendet (Siehe den try Block mit runden Klammern). Eine Verschachtelung vob BufferedReader, FileReader und File erlaubt uns ein einfaches zeilenweises Lesen.

```java
try (BufferedReader br = new BufferedReader(new FileReader(new File("path/to/File.txt")))) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
}
```

## Binary Search Tree (BST)

> Binary search trees keep their keys in sorted order, so that lookup and other operations can use the principle of binary search: when looking for a key in a tree (or a place to insert a new key), they traverse the tree from root to leaf, making comparisons to keys stored in the nodes of the tree and deciding, based on the comparison, to continue searching in the left or right subtrees. On average, this means that each comparison allows the operations to skip about half of the tree, so that each lookup, insertion or deletion takes time proportional to the logarithm of the number of items stored in the tree. This is much better than the linear time required to find items by key in an (unsorted) array, but slower than the corresponding operations on hash tables. [link](https://en.wikipedia.org/wiki/Binary_search_tree)

### How to store

- Nodes and references
- as Array (Heap)

### Tree traversal

- Pre-order

  ![Pre-order](https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Sorted_binary_tree_preorder.svg/220px-Sorted_binary_tree_preorder.svg.png)

- In-order

  ![In-order](https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Sorted_binary_tree_inorder.svg/220px-Sorted_binary_tree_inorder.svg.png)

- Post-order

  ![Post-order](https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Sorted_binary_tree_postorder.svg/220px-Sorted_binary_tree_postorder.svg.png)

  pictures from [wikipedia](https://en.wikipedia.org/)
