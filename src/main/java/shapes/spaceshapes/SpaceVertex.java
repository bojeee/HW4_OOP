package shapes.spaceshapes;

import shapes.Vertex;

public class SpaceVertex extends Vertex {
    private final double x;
    private final double y;
    private final double z;

    public SpaceVertex(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
