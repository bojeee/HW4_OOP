package shapes.planeshapes;

import shapes.Vertex;

public class PlaneVertex extends Vertex {
    private final double x;
    private final double y;

    public PlaneVertex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", )";
    }
}
