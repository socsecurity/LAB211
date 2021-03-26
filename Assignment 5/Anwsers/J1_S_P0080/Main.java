public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Area Circle: " + circle.getArea());

        Shape square = new Square(5);
        System.out.println("Area Square: " + square.getArea());

        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Area Triangle: " + triangle.getArea());

        Shape sphere = new Sphere(5);
        System.out.println("Area Sphere: " + sphere.getArea());
        System.out.println("Volume Sphere: " + sphere.getVolume());

        Shape cube = new Cube(5);
        System.out.println("Area Cube: " + cube.getArea());
        System.out.println("Volume Cube: " + cube.getVolume());

        Shape tetraheron = new Tetrahedron(5);
        System.out.println("Area Tetrahedron: " + tetraheron.getArea());
        System.out.println("Volume Tetrahedron: " + tetraheron.getVolume());
    }
}