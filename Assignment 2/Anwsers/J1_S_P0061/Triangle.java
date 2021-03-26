public class Triangle extends Shape {
    private double sideA,sideB,sideC;

    public Triangle (double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return Math.sqrt(((sideA+sideB+sideC)/2.0)*((sideA+sideB+sideC)/2.0-sideB)*
        ((sideA+sideB+sideC)/2.0-sideC)*((sideA+sideB+sideC)/2.0-sideA));
    }

    @Override
    public double getPerimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public void printResult() {
        System.out.println("-----Triangle-----" + "\n" +
        "Side A: " + sideA + "\n" +
        "Side B: " + sideB +"\n" +
        "Side C: " + sideC +"\n" +
        "Area: " + getArea() + "\n" +
        "Perimeter: " + getPerimeter());
    }
}
