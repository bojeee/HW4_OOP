package shapes.planeshapes;

public class Circle extends PlaneShape {
    private final double radius;
    private PlaneVertex vertex;

    public Circle(PlaneVertex vertex, double radius) {
        this.vertex = vertex;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle, " + "Vertices: " + vertex + ", Area: " + getArea()
                + ", Perimeter: " + getPerimeter();
    }
}
