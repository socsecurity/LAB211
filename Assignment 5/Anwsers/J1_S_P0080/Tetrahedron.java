import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Tetrahedron extends ThreeDimensionalShape{
    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Tetrahedron() {
    }

    public Tetrahedron(double a) {
        this.a = a;
    }
    
    @Override
    public double getArea() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        double result = Double.parseDouble(formatter.format(Math.sqrt(3) * a * a * a));
        return result;
    }

    @Override
    public double getVolume() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        double result = Double.parseDouble(formatter.format( Math.sqrt(2) * a * a * a /12));
        return result;
    }
}
