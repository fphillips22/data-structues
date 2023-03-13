
import java.util.LinkedList;


/**
 *
 * @author yaw
 */
public class Graph {
    private LinkedList<Integer>[] adjacencyList;
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
    public void DFS(int vert, boolean[] visited){
        visited[vert] = true;

        System.out.print(vert + ",");
        for (int i : adjacencyList[vert]){
            if (!visited[i]){
                DFS(i, visited);
            }
        }
    }
    
    public LinkedList<Integer> getNeighbors(int vertex) {
        return adjacencyList[vertex];
    }
    
    public void printConnectedComponents() {
        boolean[] visited = new boolean[getNumVertices()];
        for (int i = 0; i < getNumVertices(); i++){
            if (!visited[i]){
                System.out.print("{");
                DFS(i, visited);
                System.out.print("}");
                System.out.println();
            }
        }


    }
}
