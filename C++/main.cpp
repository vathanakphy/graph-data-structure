// #include "adjacencymatrix.hpp"
#include "Graph.hpp"
int main(){
//List
    Graph graph;
    graph.addEdge('A', 'B', 1);
    graph.addEdge('A', 'C', 1);
    graph.addEdge('B', 'D', 1);
    graph.addEdge('B', 'E', 1);
    graph.addEdge('B', 'F', 1); 
    graph.addEdge('F', 'H', 1);
    graph.addEdge('C', 'G', 1);
    graph.addEdge('G', 'I', 1);
    cout<<endl;
    graph.DFS('A');
    cout<<endl;
    graph.BFS('A');

    return 0;
}
