package JavaGraph;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
public class Graph {    
    private final HashMap<Character,List<HashMap<Character,Integer>>> adjList = new HashMap<>();
    public  void addEdge(char u,char v,int wedge){
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        HashMap<Character,Integer> vertixU = new HashMap<>();
        HashMap<Character,Integer> vertixV = new HashMap<>();
        vertixU.put(u,wedge);
        vertixV.put(v,wedge);
        adjList.get(u).add(vertixV);
        adjList.get(v).add(vertixU);
    }
    public void display(){
        for(char key :adjList.keySet()){
            System.out.print(key+ "->" );
            for(HashMap<Character,Integer> edge : adjList.get(key)){
                for(char gbKey: edge.keySet()){
                    System.out.print("(" + gbKey + ", " + edge.get(gbKey) + ") ");
                }
            }
            System.out.println("");
        }
    }
    public void neigbourGraph(char start){
        for(HashMap<Character, Integer> edge : adjList.get(start)){
            System.out.print(edge.keySet().iterator().next() + " ");
        }
        System.out.println("");
    }
    public void BFS(char start){
        Queue<Character> queue = new LinkedList<>();
        List<Character> visited = new ArrayList<>();
        queue.add(start);
        visited.add(start);
        System.out.println(" ");
        while(!queue.isEmpty()){
            char current = queue.poll();
            System.out.print(current + " ");
            for (HashMap<Character, Integer> edge : adjList.get(current)) {
                for (char gbKey : edge.keySet()) {
                    if (!visited.contains(gbKey)) {
                        visited.add(gbKey);
                        queue.add(gbKey);
                    }
                }
            }
        }
    }
    public void DFS(char start){
        Stack<Character> stack = new Stack<>();
        List<Character> visited = new ArrayList<>();
        stack.push(start);
        visited.add(start);
        System.out.println(" ");
        while(!stack.isEmpty()){
            char current = stack.pop();
            System.out.print(current + " ");
            List<HashMap<Character,Integer>> newList = new ArrayList<>( adjList.get(current));
            Collections.reverse(newList);
            for (HashMap<Character, Integer> edge : newList) {
                for (char gbKey : edge.keySet()) {
                    if (!visited.contains(gbKey)) {
                        visited.add(gbKey);
                        stack.add(gbKey);
                    }
                }
            }
        }
    }
}
