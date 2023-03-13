package Lab9_assigned;

import java.util.HashSet;
import java.util.PriorityQueue;

/**
 *
 * @author yaw
 */
public class MinimumSpanningTree {

    private final HashSet<Edge> mst;

    public MinimumSpanningTree(EdgeWeightedGraph graph) {
        mst = new HashSet<>();

        int[] connectedComponentMarker = new int[graph.getNumVertices()];
        for (int i = 0; i < connectedComponentMarker.length; i++) {
            connectedComponentMarker[i] = i;
        }

        PriorityQueue<Edge> edgeQueue = new PriorityQueue<>();
        edgeQueue.addAll(graph.getEdges());

        while (!edgeQueue.isEmpty()) {
            Edge edge = edgeQueue.poll();
            if (connectedComponentMarker[edge.getVertices()[0]] != connectedComponentMarker[edge.getVertices()[1]]) {
                mst.add(edge);
                int newMarker = connectedComponentMarker[edge.getVertices()[0]];
                int oldMarker = connectedComponentMarker[edge.getVertices()[1]];
                for (int i = 0; i < connectedComponentMarker.length; i++) {
                    if (connectedComponentMarker[i] == oldMarker) {
                        connectedComponentMarker[i] = newMarker;
                    }
                }
            }
        }
    }

    public HashSet<Edge> getMST() {
        return mst;
    }
}
