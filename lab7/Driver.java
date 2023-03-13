
/**
 *
 * @author yaw
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph graph = new Graph(8);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.addEdge(5,6);
        graph.addEdge(6,7);



        System.out.println("Degree: " + graph.getDegree(6));
        System.out.println("Max Degree: " + graph.getMaxDegree());

        if(graph.isSimple()){
            System.out.println("Is simple");
        }
        else if (!graph.isSimple()){
            System.out.println("Not simple");
        }
        System.out.println();

        Graph graph2 = new Graph(4);

        graph2.addEdge(0,1);
        graph2.addEdge(1,2);
        graph2.addEdge(2,3);
        graph2.addEdge(3,2);


        System.out.println("Degree: " + graph2.getDegree(1));
        System.out.println("Max Degree: " + graph2.getMaxDegree());

        if (graph2.isSimple()){
            System.out.println("Is Simple");
        }
        else if (!graph2.isSimple()){
            System.out.println("Not simple");
        }
    }
}
