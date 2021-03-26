public class J1_S_P0061 {

    public static void main(String[] args) {
        Rectangle rectangle = Manager.inputRectangle();
        Circle circle  = Manager.inputCircle();
        Triangle triangle = Manager.inputTriangle();
        Manager.display(rectangle, circle, triangle);
    }
}