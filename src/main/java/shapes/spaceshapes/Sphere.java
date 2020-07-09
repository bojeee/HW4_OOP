package shapes.spaceshapes;

public class Sphere  extends SpaceShape {
    private final double radius;
    SpaceVertex vertex;

    public Sphere(SpaceVertex vertex, double radius) {
        this.vertex = vertex;
        this.radius = radius;
    }

    public double getArea() {
        return (4 * Math.PI * Math.pow(radius, 2));
    }

    public double getVolume() {
        return ((4 / 3) * Math.PI * Math.pow(radius, 3));
    }

    @Override
    public String toString() {
        return "Sphere, " + "Vertices: " + vertex
                + ", Area: " + getArea() + ", Volume: " + getVolume();
    }
}
