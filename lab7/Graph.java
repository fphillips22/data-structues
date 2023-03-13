
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {
    private final LinkedList<Integer>[] adjacencyList;
    private int numEdges;
    
    public Graph(int numVertices) {
        adjacencyList = new LinkedList[numVertices];
        
        for (int i = 0; i < adjacencyList.length; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }
    
    public int getNumVertices() {
        return adjacencyList.length;
    }
    
    public int getNumEdges() {
        return numEdges;
    }
    
    public void addEdge(int vertex1, int vertex2) {
        adjacencyList[vertex1].add(vertex2);
        adjacencyList[vertex2].add(vertex1);
        
        numEdges++;
    }
    
    
    public LinkedList<Integer> getNeighbors(int vertex) {
        return adjacencyList[vertex];
    }
    
    // Return the degree value of the provided vertex.
    public int getDegree(int vertex){
        return getNeighbors(vertex).size();
    }
    
    // Return the degree value of the vertex with the largest degree value in the graph.
    public int getMaxDegree() {
        int max = 0;
        for (int i = 0; i < getNumVertices(); i++){
            if (getDegree(i) > max){
                max = getDegree(i);
            }
        }
        return max;
    }
    public void removeEdge(int vertex1, int vertex2){
        adjacencyList[vertex1].remove((Integer) vertex2);
        adjacencyList[vertex2].remove((Integer) vertex1);
        numEdges--;
    }
    
    // Return whether the graph is a simple graph.
    public boolean isSimple() {
        for (int i = 0; i < getNumVertices(); i++){
            HashSet<Integer> hashSet = new HashSet<>();
            for (int j : adjacencyList[i]){
                if (hashSet.contains((Integer)j)){
                    return false;
                }
                hashSet.add(j);
            }
            if (hashSet.contains((Integer)i)){
                return false;
            }
        }
        return true;
    }
    }

