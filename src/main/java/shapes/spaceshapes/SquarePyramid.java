package shapes.spaceshapes;

public class SquarePyramid extends SpaceShape {
    private final double width;
    private final double height;
    SpaceVertex vertex;

    public SquarePyramid(SpaceVertex vertex, double width, double height) {
        this.vertex = vertex;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        double lateralArea = width * Math.sqrt(4 * Math.pow(height, 2) + Math.pow(height, 2));
        return lateralArea + Math.pow(width, 2);
    }

    public double getVolume() {
        return ((Math.pow(width, 2) * height) / 3);
    }

    @Override
    public String toString() {
        return "Square Pyramid, " + "Vertices: " + vertex + ", Area: "
                + getArea() + ", Volume: " + getVolume();
    }
}
