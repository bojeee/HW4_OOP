package shapes.planeshapes;

import shapes.interfaces.AreaMeasurable;
import shapes.interfaces.PerimeterMeasurable;

public class Triangle extends PlaneShape implements AreaMeasurable, PerimeterMeasurable {
    private final double sideAB;
    private final double sideBC;
    private final double sideCA;

    public Triangle(PlaneVertex a, PlaneVertex b, PlaneVertex c) {
        this.sideAB = distancePlane(a, b);
        this.sideBC = distancePlane(b, c);
        this.sideCA = distancePlane(c, a);
    }

    public double getArea() {
        double halfPerimeter = 0.5 * (sideAB + sideBC + sideCA);
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideAB) * (halfPerimeter * -sideBC)
                * (halfPerimeter - sideCA));
    }

    public double getPerimeter() {
        return (sideAB + sideBC + sideCA);
    }

    @Override
    public String toString() {
        return "Triangle ," + "Vertices 1: " + sideAB
                + ", Vertices 2: " + sideBC + ", Vertices 3: " + sideCA
                + ", Area: " + getArea() + " ,Perimeter: " + getPerimeter();
    }
}
