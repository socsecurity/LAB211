import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Square extends TwoDimensionalShape{
    private double a;

    public Square() {
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Square(double a) {
        this.a = a;
    }
    
    @Override
    public double getArea() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        double result = Double.parseDouble(formatter.format(a * a));
        return result;
    }

}
