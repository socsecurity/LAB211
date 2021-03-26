import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Circle extends TwoDimensionalShape{
    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Circle() {
    }

    public Circle(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        double result = Double.parseDouble(formatter.format(a * a * Math.PI));
        return result;
    }
}