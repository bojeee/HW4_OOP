import shapes.Shape;
import shapes.planeshapes.Circle;
import shapes.planeshapes.PlaneVertex;
import shapes.planeshapes.Rectangle;
import shapes.planeshapes.Triangle;
import shapes.spaceshapes.Cuboid;
import shapes.spaceshapes.SpaceVertex;
import shapes.spaceshapes.Sphere;
import shapes.spaceshapes.SquarePyramid;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle(new PlaneVertex(2, 2), 9);
        shapes.add(circle);
        Triangle triangle = new Triangle(new PlaneVertex(-2, -3), new PlaneVertex(1, 2),
                new PlaneVertex(-45, 5));
        shapes.add(triangle);
        Rectangle rectangle = new Rectangle(new PlaneVertex(12, 14), 18, 13);
        shapes.add(rectangle);
        Sphere sphere = new Sphere(new SpaceVertex(0, 10, 10), 10);
        shapes.add(sphere);
        SquarePyramid squarePyramid = new SquarePyramid(new SpaceVertex(12, 10, 6), 16, 12);
        shapes.add(squarePyramid);
        Cuboid cuboid = new Cuboid(new SpaceVertex(0, 5, 10), 10, 10, 10);
        shapes.add(cuboid);

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
