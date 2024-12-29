package JavaGraph;
public class Main{
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge('A', 'B', 1);
        graph.addEdge('A', 'C', 1);
        graph.addEdge('B', 'D', 1);
        graph.addEdge('B', 'E', 1);
        graph.addEdge('B', 'F', 1); 
        graph.addEdge('F', 'H', 1);
        graph.addEdge('C', 'G', 1);
        graph.addEdge('G', 'I', 1);
        // graph.display();
        graph.DFS('A');
        graph.BFS('A');
        // graph.neigbourGraph('B');
    // GraphAM graph = new GraphAM(5);
    //     graph.addEdge(1, 1, 5);
    //     graph.addEdge(0, 2, 5);
    //     graph.addEdge(0, 3, 5);
    //     graph.addEdge(0, 4, 5);
    //     graph.print();
    }
}