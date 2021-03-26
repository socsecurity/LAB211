import java.util.Scanner;
public class Manager {
    public static final Scanner sc = new Scanner(System.in);
    public Manager(){

    }
    public static double checkInputDouble(){
        while (true){
                try{
                        Double result = Double.parseDouble(sc.nextLine().trim());
                        return result;
                } catch (NumberFormatException e){
                        System.out.println("Please input double");
                        System.out.print("Input again: ");
                }
                
        }
    }

    public static Rectangle inputRectangle(){
        System.out.println("Please input side width of Rectangle: ");
        double width = checkInputDouble();
        System.out.println("Please input length of Rectangle: ");
        double length = checkInputDouble();
        return new Rectangle(width, length);
    }

    public static Circle inputCircle(){
        System.out.println("Please input radius of Circle: ");
        double radius = checkInputDouble();
        return new Circle(radius);
    }

    public static Triangle inputTriangle(){
        while(true){
            System.out.println("Please input side A of Triangle: ");
            double sideA = checkInputDouble();
            System.out.println("Please input side B of Triangle: ");
            double sideB = checkInputDouble();
            System.out.println("Please input side C of Triangle: ");
            double sideC = checkInputDouble();
            if (sideA+sideB>sideC&&sideB+sideC>sideA&&sideA+sideC>sideB){
                return new Triangle(sideA, sideB, sideC);
            } else {
                System.out.println("Re-input");
            }
        }
    }

    public static void display(Rectangle rectangle, Circle circle, Triangle triangle){
        System.out.println("=====Calculator Shape Program=====");       
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();     
    }
}
