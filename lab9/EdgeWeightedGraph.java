package Lab9_assigned;

import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author yaw
 */
public class EdgeWeightedGraph {

    private LinkedList[] adjacencyList;
    private HashSet<Edge> edges;
    
    public EdgeWeightedGraph(int numVertices) {
        adjacencyList = new LinkedList[numVertices];

        for (int i = 0; i < adjacencyList.length; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
        edges = new HashSet<>();
    }

    public int getNumVertices() {
        return adjacencyList.length;
    }

    public int getNumEdges() {
        return edges.size();
    }

    public void addEdge(int vertex1, int vertex2, double weight) {
        Edge edge = new Edge(vertex1, vertex2, weight);
        if (edges.add(edge)) {
            adjacencyList[vertex1].add(edge);
            adjacencyList[vertex2].add(edge);
        }
    }

    public HashSet<Edge> getEdges() {
        return edges;
    }
    
    public static EdgeWeightedGraph defaultGraph() {
        EdgeWeightedGraph graph = new EdgeWeightedGraph(6);
        
        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 2);
        graph.addEdge(0, 3, 7);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 5);
        graph.addEdge(2, 3, 2);
        graph.addEdge(2, 5, 2);
        graph.addEdge(3, 4, 3);
        graph.addEdge(3, 5, 1);
        graph.addEdge(4, 5, 4);
        
        return graph;
    }
}
