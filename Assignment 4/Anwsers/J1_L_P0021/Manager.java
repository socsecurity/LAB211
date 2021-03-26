import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Manager {

    public static final Scanner sc = new Scanner(System.in);

    public static void menu(){
        System.out.println("WELCOME TO STUDENT MANAGEMENT!");
        System.out.println("1. Create.");
        System.out.println("2. Find and Sort");
        System.out.println("3. Update/Delete");
        System.out.println("4. Report");
        System.out.println("5. Exit");
        System.out.print("Pls, Enter your choice: ");
    }

    public static void createStudent(int count, ArrayList<Student> ls){
        if (count>9){
            System.out.println("Do you want to continue ? (Y/n): ");
            if (!Validation.checkInputYN()){
                return;
            }
        }

        while (true) {
            System.out.print("Enter id: ");
            String id = Validation.checkInputString();
            System.out.print("Enter student name: ");
            String name = Validation.checkInputString();
            if (!Validation.checkIdExist(ls,id,name)){
                System.out.println("Id has exist student, Please input again.");
                continue;
            }

            System.out.println("Enter semester:");
            String semester = Validation.checkInputString();
            System.out.println("Enter course name:");
            String course = Validation.checkInputCourse();
            if (Validation.checkStudentExist(ls, id, name, semester, course)){
                ls.add(new Student(id, name, semester, course));
                count++;
                System.out.println("Add student successfully!");
                return;
            }
            System.out.println("Duplicated!");
            
        }
    }

    public static void findAndSort(ArrayList<Student> ls){
        if (ls.isEmpty()){
            System.out.println("List Empty!");
            return;
        }

        ArrayList<Student> listStudentFindByName = listStudentFindByName(ls);
        if (listStudentFindByName.isEmpty()){
            System.out.println("List of student NOT EXIST");
        } else {
            Collections.sort(listStudentFindByName);
            System.out.printf("%-15s%-15s%-15s\n", "studentName", "semester", "courseName");
            for (Student student: listStudentFindByName){
                student.print();
            }
        }
    }

    private static ArrayList<Student> listStudentFindByName(ArrayList<Student> ls){
        ArrayList<Student> listStudentFindByName = new ArrayList<>();
        System.out.println("Input name to search: ");
        String name = Validation.checkInputString();
        for (Student student : ls){
            if (student.getStudentName().contains(name)){
                listStudentFindByName.add(student);
            }
        }
        return listStudentFindByName;
    }

    public static void updateOrDelete(int count, ArrayList<Student> ls){
        if (ls.isEmpty()){
            System.out.println("List of Students Empty!");
            return;
        }

        System.out.println("Please Input id: ");
        String id = Validation.checkInputString();
        ArrayList<Student> listStudentFindByName = getListStudentById(ls,id);
        if (listStudentFindByName.isEmpty()){
            System.out.println("Not found infomation of Student");
            return;
        } else {
            Student student = getStudentByListFound(listStudentFindByName);
            System.out.println("Do you want to Update or Delete student (U/D) ?");
            if (Validation.checkInputUD()){
                System.out.println("Enter id: ");
                String idStudent = Validation.checkInputString();
                System.out.println("Enter Name: ");
                String studentName = Validation.checkInputString();
                System.out.println("Enter semester: ");
                String semester = Validation.checkInputString();
                System.out.println("Enter course: ");
                String courseName = Validation.checkInputCourse();
                if (!Validation.checkChangeInformation(student, idStudent, studentName, semester, courseName)) {
                    System.out.println("Nothing change!");
                }
                if (Validation.checkStudentExist(ls, idStudent, studentName, semester, courseName)){
                    student.setId(idStudent);
                    student.setStudentName(studentName);
                    student.setCourseName(courseName);
                    student.setSemester(semester);
                    System.out.println("Student Upate success");
                }
                return;
            } else {
                ls.remove(student);
                count--;
                System.out.println("Student Delete success");
                return;
            }
        }
    }

    private static Student getStudentByListFound(ArrayList<Student> listStudentFindByName) {
        System.out.println("List of students was found: ");
        int count = 1;
        System.out.printf("%-10s%-15s%-15s%-15s\n", "Number","Student name", "Semester", "Course name");
        for (Student student : listStudentFindByName){
            System.out.printf("%-10s%-15s%-15s%-15s\n", count, student.getStudentName(), student.getSemester(), student.getCourseName());
            count++;
        }

        System.out.println("Enter student (number): ");
        int choice = Validation.checkInputIntLimit(1, listStudentFindByName.size());
        return listStudentFindByName.get(choice-1);
    }

    private static ArrayList<Student> getListStudentById(ArrayList<Student> ls, String id) {
        ArrayList<Student> getListStudentById = new ArrayList<>();
        for (Student student: ls){
            if (id.equalsIgnoreCase(student.getId())){
                getListStudentById.add(student);
            }
        }
        return getListStudentById;
    }

    public static void report(ArrayList<Student> ls){
        if (ls.isEmpty()){
            System.out.println("List empty!");
            return;
        }
        ArrayList<Report> lr = new ArrayList<>();
        int size = ls.size();
        for (int i = 0; i<size; i++){
            for (Student student : ls){
                int total = 0;
                String id = student.getId();
                String courseName = student.getCourseName();
                String studentName = student.getStudentName();
                for (Student studentCountTotal : ls){
                    if (id.equalsIgnoreCase(studentCountTotal.getId())&&courseName.equalsIgnoreCase(studentCountTotal.getCourseName())){
                        total++;
                    }
                }
                if (Validation.checkReportExist(lr, studentName, courseName, total)){
                    lr.add(new Report(student.getStudentName(), student.getCourseName(), total));
                }
            }
        }

        for (int i = 0; i<lr.size(); i++){
            System.out.println(lr.get(i).getStudentName() + "\t" + lr.get(i).getCourseName() + "\t" + lr.get(i).getTotalCourse());
        }
    }

}
