package Lab9_assigned;

/**
 *
 * @author yaw
 */
public class MaxST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EdgeWeightedGraph graph = EdgeWeightedGraph.defaultGraph();
        
        MinimumSpanningTree mst = new MinimumSpanningTree(graph);
        for(Edge edge : mst.getMST()) {
            System.out.println(edge);
        }
    }
    
}
