import java.util.Scanner;
public class Manager{
    public static Scanner sc = new Scanner(System.in);
    public String inputData(){
        System.out.println("===== Analysis String program ====");
        System.out.print("Input String: ");
        String tmp = sc.nextLine().trim();
        return tmp;
    }

    public void resultAnalysis(String s){
        System.out.println("-----Result Analysis------");
        AnalysisString as = new AnalysisString();
        as.getNumber(s);
        as.getCharacter(s);

    }
}