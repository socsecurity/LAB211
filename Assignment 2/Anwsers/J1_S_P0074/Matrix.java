import java.util.Scanner;
public class Matrix {

    public static final Scanner sc = new Scanner(System.in);

    public Matrix (){

    }

    public static int[][] additionMatrix (int[][] matrix1, int[][]matrix2) {
        int m1 = matrix1.length;
        int n1 = matrix1[0].length;
        int m2 = matrix2.length;
        int n2 = matrix2[0].length;
        if (n1 != n2&&m1!=m2) throw new RuntimeException("Illegal matrix dimensions.");
        int matrix3[][] = new int [m1][n1];
        for (int i = 0; i<m1; i++){
            for (int j = 0; j<n1; j++){
                matrix3[i][j] = matrix2[i][j] + matrix1[i][j];
            }
        }
        return matrix3;
    }

    public static int[][] subtractionMatrix(int[][] matrix1, int[][]matrix2) {
        int m1 = matrix1.length;
        int n1 = matrix1[0].length;
        int m2 = matrix2.length;
        int n2 = matrix2[0].length;
        if (n1 != n2&&m1!=m2) throw new RuntimeException("Illegal matrix dimensions.");
        int matrix3[][] = new int [m1][n1];
        for (int i = 0; i<m1; i++){
            for (int j = 0; j<n1; j++){
                matrix3[i][j] = matrix2[i][j] - matrix1[i][j];
            }
        }
        return matrix3;
    }

    public static int[][] multiplicationMatrix(int[][] matrix1, int[][]matrix2) {
        int m1 = matrix1.length;
        int n1 = matrix1[0].length;
        int m2 = matrix2.length;
        int n2 = matrix2[0].length;
        int matrix3[][] = new int [m1][n2];
        if (n1 != m2) throw new RuntimeException("Illegal matrix dimensions.");
        for (int i = 0; i < m1; i++)
            for (int j = 0; j < n2; j++)
                for (int k = 0; k < n1; k++)
                    matrix3[i][j] += (matrix1[i][k] * matrix2[k][j]);
        return matrix3;
    }
    
    public static void displayMatrix(int[][] matrix){
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[0].length; j++){
                System.out.print("["+matrix[i][j]+"]");
            }
            System.out.println();
        }
    }

    public static int checkInput(){
        while (true){
                try{
                        Integer result = Integer.parseInt(sc.nextLine().trim());
                        return result;
                } catch (NumberFormatException e){
                        System.out.println("Please input integer");
                        System.out.print("Enter Row Matrix: ");
                }
                
        }

}

    static public int[][] inputM(int k){
        System.out.print("Enter Row Matrix: ");
        int m  = checkInput();
        System.out.print("Enter Column Matrix: ");
        int n  = checkInput();
        int [][]matrix = new int[m][n];

        for (int i = 0; i< m;i++){
            for (int j=0; j<n; j++){
                System.out.print("Enter Matrix" + k + " [" + (i+1) + "]["+(j+1) + "]: ");
                matrix[i][j] = checkInput();
            }
        }
        return matrix;
    }


    public static int menu(){
        System.out.println("=======Caculator Program=======");
        System.out.println("1. Addition matrixes");
        System.out.println("2. Subtraction matrixes");
        System.out.println("3. Multiplication matrixes");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = checkInputIntLimit(1,4);
        return choice;  
    }

    public static void cong(){
        System.out.println("---------- Addition----------");
        int[][] m1 = inputM(1);
        int[][] m2 = inputM(2);
        System.out.println("---------Result---------");
        displayMatrix(m1);
        System.out.println("+");
        displayMatrix(m2);
        System.out.println("=");
        displayMatrix(additionMatrix(m1, m2));
    }

    public static void tru(){
        System.out.println("---------- Subtraction----------");
        int[][] m1 = inputM(1);
        int[][] m2 = inputM(2);
        System.out.println("---------Result---------");
        displayMatrix(m1);
        System.out.println("-");
        displayMatrix(m2);
        System.out.println("=");
        displayMatrix(subtractionMatrix(m1, m2));
    }

    public static void nhan(){
        System.out.println("---------- Multiplication----------");
        int[][] m1 = inputM(1);
        int[][] m2 = inputM(2);
        System.out.println("---------Result---------");
        displayMatrix(m1);
        System.out.println("*");
        displayMatrix(m2);
        System.out.println("=");
        displayMatrix(multiplicationMatrix(m1, m2));
    }

    public static int checkInputIntLimit(int min, int max){
            while (true){
                    try{
                            int result = Integer.parseInt(sc.nextLine().trim());
                            if (result<min || result>max) {
                                    throw new NumberFormatException();
                            }
                            return result;
                    } catch (NumberFormatException e){
                            System.out.println("Please input in range [" + min + "," + max+"]");
                            System.out.print("Input again: ");
                    }
                    
            }
    }
}
