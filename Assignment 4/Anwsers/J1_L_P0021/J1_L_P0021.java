import java.util.ArrayList;
public class J1_L_P0021{
    public static void main(String[] args) {
        ArrayList<Student> ls = new ArrayList<>();
        Validation validation = new Validation();
        ls.add(new Student("1", "Nguyen A","Spring", "java"));
        ls.add(new Student("1", "Nguyen A","Spring", "java"));
        ls.add(new Student("1", "Nguyen A","Spring", "java"));
        ls.add(new Student("2", "Nguyen B","Summer", ".net"));
        ls.add(new Student("3", "Nguyen C","Spring", "c/c++"));
        ls.add(new Student("3", "Nguyen C","Spring", "c/c++"));
        ls.add(new Student("4", "Nguyen D","Spring", "c/c++"));
        int count =3;
        while(true)
        {
            Manager.menu();
            int choice = Validation.checkInputIntLimit(1, 5);
            switch(choice)
            {
                case 1: {
                    Manager.createStudent(count, ls);
                    break;
                }
                case 2: {
                    Manager.findAndSort(ls);
                    break;
                }
                case 3: {
                    Manager.updateOrDelete(count, ls);
                    break;
                }
                case 4: {
                    Manager.report(ls);
                    break;
                }
                case 5: return;
            }
        }
    }
}