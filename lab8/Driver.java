
/**
 *
 * @author yaw
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph graph = new Graph(9);
        graph.addEdge(0,1);
        graph.addEdge(1,3);
        graph.addEdge(0,2);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(5,6);
        graph.addEdge(6,8);
        graph.printConnectedComponents();
    }
}
