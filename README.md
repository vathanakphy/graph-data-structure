# graph-data-structure
## Overview
The implementation of Depth-First Search (DFS) and Breadth-First Search (BFS) for traversing a graph. The graph is represented using an adjacency list, and traversal functions are implemented in C++ and java.
**Represent Graph**
- A->B->C
- B->A->D->E->f
- C->A->G
- D->B
- E->B
- F->B->H
- G->C->I
- H->F
- I->G
### Depth-First Search (DFS) 
DFS is an algorithm for traversing in graph data structures. it starts at select vertex and explores as far as possible along each branch before backtracking. Extra memory, usually a stack, is needed to keep track of the nodes discovered so far along a specified branch which helps in backtracking of the graph.
**Result**
- The DFS traversal for the above graph starting from node `A`
- A B D E F H C G I
### Breadth-first search (BFS) ###
BFS is a traversal algorithm in the graph. It begins with a select vertex , then first traverses all its adjacent. Once all adjacent are visited, then their adjacent are traversed. This is different from DFS in a way that closest vertices are visited before others. We mainly traverse vertices level by level. it use queue to store visited data.
**Result**
- The BFS traversal for the above graph starting from node `A`
- A B C D E F G H I
### insights gained from the traversal process ###
- Breadth-First Search (BFS) and Depth-First Search (DFS) are graph traversal algorithms that differ in how they visit nodes and what they're best used for: 
- Traversal order: BFS visits nodes in level order, while DFS visits nodes in depth-first order. 
- Data structure: BFS uses a queue to store nodes, while DFS uses a stack. 
- Use cases: BFS is best for finding the shortest path between two nodes, while DFS is best for exploring all possible paths. 
- Memory efficiency: DFS can be more memory efficient than BFS for some sparse graphs. 
- Time complexity: Both BFS and DFS have a time complexity of O(V + E), where V is the number of vertices and E is the number of edges. 
- Space complexity: BFS has a space complexity of O(V) due to the queue, while DFS has a space complexity of O(V) in the worst case. 
