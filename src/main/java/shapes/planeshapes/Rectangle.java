package shapes.planeshapes;

import shapes.interfaces.AreaMeasurable;
import shapes.interfaces.PerimeterMeasurable;
import shapes.Shape;

public class Rectangle extends Shape implements AreaMeasurable, PerimeterMeasurable {
    private final double width;
    private final double height;
    PlaneVertex vertex;

    public Rectangle(PlaneVertex vertex, double width, double height) {
        this.vertex = vertex;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle ," + "Vertices: " + vertex + ", Area: " + getArea()
                + ", Perimeter: " + getPerimeter();
    }
}
