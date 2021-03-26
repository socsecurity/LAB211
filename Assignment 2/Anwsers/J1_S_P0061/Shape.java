import java.util.Scanner;
public abstract class Shape {

    public static final Scanner sc = new Scanner(System.in);

    public Shape(){

    }

    public double checkInputDouble(){
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

    public void inputRectangle(){
        System.out.println("Please input side width of Rectangle: ");
        double width = checkInputDouble();
        System.out.println("Please input length of Rectangle: ");
        double length = checkInputDouble();
        Rectangle re  = new Rectangle(width, length);
        re.printResult();
    }

    public void inputCircle(){
        System.out.println("Please input radius of Circle: ");
        double radius = checkInputDouble();
        Circle ci  = new Circle(radius);
        ci.printResult();
    }

    public void inputTriangle(){
        System.out.println("Please input side A of Triangle: ");
        double sideA = checkInputDouble();
        System.out.println("Please input side B of Triangle: ");
        double sideB = checkInputDouble();
        System.out.println("Please input side C of Triangle: ");
        double sideC = checkInputDouble();
        Triangle tr  = new Triangle(sideA,sideB,sideC);
        tr.printResult();
    }

  public abstract double getPerimeter ();
    public abstract double getArea ();

    public abstract void printResult();
}
