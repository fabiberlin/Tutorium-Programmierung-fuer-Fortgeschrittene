## Trees & Graphs

### Recursion

> Recursion in computer science is a method where the solution to a problem depends on solutions to smaller instances of the same problem (as opposed to iteration). The approach can be applied to many types of problems, and recursion is one of the central ideas of computer science.

>Most computer programming languages support recursion by allowing a function to call itself within the program text. Some functional programming languages do not define any looping constructs but rely solely on recursion to repeatedly call code
[link](https://en.wikipedia.org/wiki/Recursion_(computer_science))

 - int sumUpTill(int number)
 - int mulUpTill(int number)

### Trees

> In computer science, a tree is a widely used abstract data type (ADT)—or data structure implementing this ADT—that simulates a hierarchical tree structure, with a root value and subtrees of children with a parent node, represented as a set of linked nodes.
A tree data structure can be defined recursively (locally) as a collection of nodes (starting at a root node), where each node is a data structure consisting of a value, together with a list of references to nodes (the "children"), with the constraints that no reference is duplicated, and none points to the root.

> A tree is a data structure made up of nodes or vertices and edges without having any cycle. The tree with no nodes is called the null or empty tree. A tree that is not empty consists of a root node and potentially many levels of additional nodes that form a hierarchy.
[link](https://en.wikipedia.org/wiki/Tree_(data_structure)

#### Special Trees

- Binary Search Tree (BST)

> Binary search trees keep their keys in sorted order, so that lookup and other operations can use the principle of binary search: when looking for a key in a tree (or a place to insert a new key), they traverse the tree from root to leaf, making comparisons to keys stored in the nodes of the tree and deciding, based on the comparison, to continue searching in the left or right subtrees. On average, this means that each comparison allows the operations to skip about half of the tree, so that each lookup, insertion or deletion takes time proportional to the logarithm of the number of items stored in the tree. This is much better than the linear time required to find items by key in an (unsorted) array, but slower than the corresponding operations on hash tables.
[link](https://en.wikipedia.org/wiki/Binary_search_tree)

#### How to store

- Nodes and references
- as Array (Heap)

#### Tree traversal

 - Pre-order

 ![Pre-order](https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Sorted_binary_tree_preorder.svg/220px-Sorted_binary_tree_preorder.svg.png)


 - In-order

 ![In-order](https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Sorted_binary_tree_inorder.svg/220px-Sorted_binary_tree_inorder.svg.png)

 - Post-order

 ![Post-order](https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Sorted_binary_tree_postorder.svg/220px-Sorted_binary_tree_postorder.svg.png)


### Graphs

> A graph data structure consists of a finite (and possibly mutable) set of vertices or nodes or points, together with a set of unordered pairs of these vertices for an undirected graph or a set of ordered pairs for a directed graph. These pairs are known as edges, arcs, or lines for an undirected graph and as arrows, directed edges, directed arcs, or directed lines for a directed graph. The vertices may be part of the graph structure, or may be external entities represented by integer indices or references.
A graph data structure may also associate to each edge some edge value, such as a symbolic label or a numeric attribute (cost, capacity, length, etc.).
[link](https://en.wikipedia.org/wiki/Graph_(abstract_data_type))

#### How to store

- Adjacency list
- Adjacency matrix
- Incidence matrix

#### Types

 - Undirected Graphs
 - Directed Graphs
 - Cyclic Graphs
 - Weighted Graphs
 - Directed Acyclic Graphs (DAG) - directed graph without cycles
 - Disconnected Graphs

#### Realted Topics

 - Breadth-First Search
 - Depth-First Search
 - Dijkstra
 - Four color theorem
 - Minimum spanning tree


More inforamtion:

http://web.cecs.pdx.edu/~sheard/course/Cs163/Doc/Graphs.html
https://www.cs.cornell.edu/home/kleinber/networks-book/networks-book-ch02.pdf
