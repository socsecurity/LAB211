
import java.math.BigInteger;
import java.util.Scanner;
public class J1_S_P0084{

    public static Scanner sc = new Scanner(System.in);

    static String checkInput(){
        String pattern = "[-+]?[0-9]*[0-9]";
        while (true){
            String s = sc.nextLine().trim();
            if (s.isEmpty()) {
                System.out.println(("Not Empty"));
                continue;
            }
            if (!s.matches(pattern)) {
                System.out.println("Input again!");
                continue;
            }
            return s;
    }

    }
    public static void main(String[] args) {
        System.out.print("Enter big number one: ");
        BigInteger bigNumOne = new BigInteger(checkInput());
        System.out.print("Enter big number two: ");
        BigInteger bigNumTwo = new BigInteger(checkInput());
        System.out.print("Result: ");
        System.out.println(bigNumOne.multiply(bigNumTwo));
    }
}