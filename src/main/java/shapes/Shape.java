package shapes;

import shapes.planeshapes.PlaneVertex;

public abstract class Shape {
    public double distancePlane(PlaneVertex a, PlaneVertex b) {
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
    }
}
