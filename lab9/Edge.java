package Lab9_assigned;

public class Edge implements Comparable<Edge> {

    private final int vertex1;
    private final int vertex2;
    private final double weight;

    public Edge(int vertex1, int vertex2, double weight) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.weight = weight;
    }

    public int[] getVertices() {
        return new int[]{vertex1, vertex2};
    }

    public double getWeight() {
        return weight;
    }
    
    @Override
    public String toString() {
        return "(" + vertex1 + "," + vertex2 + "): " + weight;
    }
    
    @Override
    public int hashCode() {
        return vertex1 + vertex2;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Edge otherEdge)) {
            return false;
        }

        return (vertex1 == otherEdge.vertex1 && vertex2 == otherEdge.vertex2) || (vertex1 == otherEdge.vertex2 && vertex2 == otherEdge.vertex1);
    }

    @Override
    public int compareTo(Edge otherEdge) {
        return Double.compare(otherEdge.weight, weight);
    }
}
