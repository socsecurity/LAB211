import java.util.ArrayList;
import java.util.Scanner;

public class Validation {

    private static final Scanner sc = new Scanner(System.in);

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice! Please choose again(1, 5):");
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("Null input! Please enter again:");
            } else {
                return result;
            }
        }
    }

    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.println("Invalid input! Please choose again(Y/N):");
        }

    }

    public static boolean checkInputUD() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("U")) {
                return true;
            }
            if (result.equalsIgnoreCase("D")) {
                return false;
            }
            System.out.println("Invalid input! Please choose again(U/D):");
        }
    }

    public static String checkInputCourse() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("java") || result.equalsIgnoreCase(".net") || result.equalsIgnoreCase("c/c++")) {
                return result;
            }
            System.out.println("There are only three courses: java, .net, c/c++! Enter again:");
        }
    }

    public static boolean checkStudentExist(ArrayList<Student> ls, String id, String studentName, String semester, String courseName) {
        //int size = ls.size();
        for (Student student : ls) {
            if (id.equalsIgnoreCase(student.getId())
                    && studentName.equalsIgnoreCase(student.getStudentName())
                    && semester.equalsIgnoreCase(student.getSemester())
                    && courseName.equalsIgnoreCase(student.getCourseName())) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkReportExist(ArrayList<Report> lr, String studentName, String courseName, int totalCourse) {
        for (Report report : lr) {
            if (studentName.equalsIgnoreCase(report.getStudentName())
                    && courseName.equalsIgnoreCase(report.getCourseName())
                    ) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIdExist(ArrayList<Student> ls, String id, String studentName) {
        for (Student student : ls) {
            if (id.equalsIgnoreCase(student.getId())
                    && studentName.equalsIgnoreCase(student.getStudentName())) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkChangeInformation(Student student, String id, String studentName, String semester,
            String courseName) {
        if (id.equalsIgnoreCase(student.getId())
                && studentName.equalsIgnoreCase(student.getStudentName())
                && semester.equalsIgnoreCase(student.getSemester())
                && courseName.equalsIgnoreCase(student.getCourseName())) {
            return false;
        }
        return true;
    }
}
