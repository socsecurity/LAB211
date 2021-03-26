import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Contact> lc = new ArrayList<>();
		 lc.add(new Contact(1,"Iker Casillas","SE1501","Spain","0987658821","Iker","Casillas"));
	        lc.add(new Contact(2,"Nguyen Ha Khue","SE1501","VietNam","0357654321","Khue","Nguyen Ha"));
	        lc.add(new Contact(3,"Nguyen Xuan Cam","SE1501","VietNam","0837692252","Cam","Nguyen Xuan"));
		while(true) {
			int choice = Manager.menu();
			switch(choice) {
			case 1:
				Manager.createContact(lc);
				break;
			case 2: Manager.printAllContact(lc);
				break;
			case 3: Manager.deleteContact(lc);
				break;
			case 4:
				return;
			}
		}
	}
}