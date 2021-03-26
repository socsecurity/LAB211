public class Rectangle extends Shape {
    private double width, length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return (width+length)*2;
    }

    @Override
    public void printResult() {
        System.out.println("-----Rectangle-----"+ "\n" +
        "Width: " + width + "\n" +
        "Length: "+ length + "\n" +
        "Area: " + getArea() + "\n" +
        "Perimeter: " + getPerimeter());
    }   
}
