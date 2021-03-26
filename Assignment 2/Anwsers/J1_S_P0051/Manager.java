import java.util.Scanner;

public class Manager {

    Scanner scan = new Scanner(System.in);

    Manager() {

    }

    void menu() {
        int option;
        System.out.printf("\n%-20s\n", "===================== CALCULATOR PROGRAM ====================");
        System.out.printf("%-20s\n", "1: Addition matrixes");
        System.out.printf("%-20s\n", "2: Subtraction matrixes");
        System.out.printf("%-20s\n", "3: Multiplication matrixes");
        System.out.printf("%-20s\n", "4: Exit");
        System.out.print("Your choice: ");

        option = scan.nextInt();
        scan.nextLine();
        switch (option) {
            case 1:
                function_1();
                break;
            case 2:
                function_2();
                break;
            case 3:
                function_3();
                break;
            case 4:
                System.out.println("Exiting...");
        }
        if (option != 4) {
            menu();
        }
    }

    void function_1() {
        int row1 = 0, column1 = 0, row2 = 0, column2 = 0;
        System.out.print("Enter Row Matrix 1: ");
        row1 = scan.nextInt();
        System.out.print("Enter Column Matrix 1: ");
        column1 = scan.nextInt();
        System.out.println("Get data for matrix 1: ");
        int[][] mt1 = getMatrix(row1, column1);

        System.out.println();

        System.out.print("Enter Row Matrix 2: ");
        row2 = scan.nextInt();
        System.out.print("Enter Column Matrix 2: ");
        column2 = scan.nextInt();
        System.out.println("Get data for matrix 2: ");
        int[][] mt2 = getMatrix(row2, column2);

        System.out.println();
        showOut(mt1, row1, column1);
        System.out.println("+");
        showOut(mt2, row2, column2);
        System.out.println("Result: ");

        if (row1 == row2 && column1 == column2) {
            int[][] rs = new int[row1][column1];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    rs[i][j] = mt1[i][j] + mt2[i][j];
                }
            }
            showOut(rs, row1, column1);
        } else {
            System.out.println("Can't add");
        }
    }

    void function_2() {
        int row1 = 0, column1 = 0, row2 = 0, column2 = 0;
        System.out.print("Enter Row Matrix 1: ");
        row1 = scan.nextInt();
        System.out.print("Enter Column Matrix 1: ");
        column1 = scan.nextInt();
        System.out.println("Get data for matrix 1: ");
        int[][] mt1 = getMatrix(row1, column1);

        System.out.println();

        System.out.print("Enter Row Matrix 2: ");
        row2 = scan.nextInt();
        System.out.print("Enter Column Matrix 2: ");
        column2 = scan.nextInt();
        System.out.println("Get data for matrix 2: ");
        int[][] mt2 = getMatrix(row2, column2);

        System.out.println();
        showOut(mt1, row1, column1);
        System.out.println("-");
        showOut(mt2, row2, column2);
        System.out.println("Result: ");

        if (row1 == row2 && column1 == column2) {
            int[][] rs = new int[row1][column1];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    rs[i][j] = mt1[i][j] - mt2[i][j];
                }
            }
            showOut(rs, row1, column1);
        } else {
            System.out.println("Can't subtract");
        }

    }

    void function_3() {
        int row1 = 0, column1 = 0, row2 = 0, column2 = 0;
        System.out.print("Enter Row Matrix 1: ");
        row1 = scan.nextInt();
        System.out.print("Enter Column Matrix 1: ");
        column1 = scan.nextInt();
        System.out.println("Get data for matrix 1: ");
        int[][] mt1 = getMatrix(row1, column1);

        System.out.println();

        System.out.print("Enter Row Matrix 2: ");
        row2 = scan.nextInt();
        System.out.print("Enter Column Matrix 2: ");
        column2 = scan.nextInt();
        System.out.println("Get data for matrix 2: ");
        int[][] mt2 = getMatrix(row2, column2);

        System.out.println();
        showOut(mt1, row1, column1);
        System.out.println("*");
        showOut(mt2, row2, column2);
        System.out.println("Result: ");

        if (column1 == row2) {
            int rs[][] = new int[row1][column2];
            int sum = 0;
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    sum = 0;
                    for (int k = 0; k < row2; k++) {
                        sum += (mt1[i][k] * mt2[k][j]);
                    }
                    rs[i][j] = sum;
                }
            }
            showOut(rs, row1, column2);
        } else {
            System.out.println("Cant's multiplicate");
        }
    }

    int[][] getMatrix(int row, int column) {
        int mt[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Enter element [%d][%d]: ", i, j);
                mt[i][j] = scan.nextInt();
            }
        }
        return mt;
    }

    void showOut(int mt[][], int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%4d\t", mt[i][j]);
            }
            System.out.println();
        }

    }
}
