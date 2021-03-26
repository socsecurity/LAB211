public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius*2*Math.PI;
    }

    @Override
    public void printResult() {
        System.out.println("-----Circle-----"+ "\n" +
        "Radius: " + getRadius() + "\n" +
        "Area: " + getArea() + "\n" +
        "Perimeter: " + getPerimeter() );
    }
}
