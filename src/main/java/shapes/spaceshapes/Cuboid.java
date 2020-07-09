package shapes.spaceshapes;

public class Cuboid extends SpaceShape {
    private final double width;
    private final double height;
    private final double length;
    SpaceVertex vertex;

    public Cuboid(SpaceVertex vertex, double width, double height, double length) {
        this.vertex = vertex;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double getArea() {
        return (2 * (width * length) + (length * height) + (height * width));
    }

    public double getVolume() {
        return (width * length * height);
    }

    @Override
    public String toString() {
        return "Cuboid, " + "Vertices: " + vertex + ", Area: "
                + getArea() + ", Volume: " + getVolume();
    }
}
