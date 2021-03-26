import java.util.ArrayList;
import java.util.Collections;

public class Manager {
	public static void addStudent(ArrayList<Student> ls) {
		System.out.println("Please input student info: ");
		System.out.println("Enter Name: ");
		String name = Validation.checkInputString();
		System.out.println("Enter Classes: ");
		String classes = Validation.checkInputString();
		System.out.println("Enter Mark: ");
		float mark = Validation.checkInputFloat();
		ls.add(new Student(name,mark,classes));
	}
	
	public static void print(ArrayList<Student> ls) {
		if(ls.isEmpty()) {
			System.out.println("List of student empty!");
			return;
		}
		Collections.sort(ls);
		int i=0;
		for(Student l : ls) {
			i++;
			System.out.println("-------Student"+" "+ i+"-------");
			System.out.println("Name: "+ l.getName());
			System.out.println("Classes: "+l.getClasses());
			System.out.println("Mark: "+l.getMark());
		}
	}
	
	public static void Display() {
		ArrayList<Student> ls = new ArrayList<>();
		addStudent(ls);
		while(true) {
			System.out.println("Do you want to enter more students info? (Y/N)");
			if(Validation.checkInputYN()) {
				addStudent(ls);
			}
			else {
				break;
			}
		}
		print(ls);
	}
}
