import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Sphere extends ThreeDimensionalShape{
    private double r;

    public Sphere() {
    }

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        double result = Double.parseDouble(formatter.format(4 * r * r * Math.PI));
        return result;
    }

    @Override
    public double getVolume() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        double result = Double.parseDouble(formatter.format((4/3) * r * r * r * Math.PI));
        return result;
    }
}
