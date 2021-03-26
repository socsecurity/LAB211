import java.util.ArrayList;

public class Manager {
	public static int menu() {
        System.out.println("========= Contact program =========");
        System.out.println("1. Add a Contact");
        System.out.println("2. Display all Contact");
        System.out.println("3. Delete a Contact");
        System.out.println("4. Exit");
        System.out.println("\nPlease choice one option:");
        int choice = Validation.checkInputLimit(1,4);
        return choice;
    }
	
	public static void createContact(ArrayList<Contact> lc) {
		System.out.print("Enter id contact: ");
		int contactId = Validation.checkInputInt();
		System.out.print("Enter first name: ");
		String firstName = Validation.checkInputString();
		System.out.print("Enter last name: ");
		String lastName = Validation.checkInputString();
		System.out.print("Enter group: ");
		String group = Validation.checkInputString();
		System.out.print("Enter address: ");
		String address = Validation.checkInputString();
		System.out.print("Enter phone number: ");
		String phone = Validation.checkInputPhone();
		String fullName = firstName + lastName;
		lc.add(new Contact(contactId, fullName, group, address, phone, firstName, lastName));
		System.out.println("Add contact successfully");
	}
	
	public static void printAllContact(ArrayList<Contact> lc) {
		System.out.printf("%-5s%-30s%-20s%-20s%-20s%-20s%-20s\n",
				"ID", "Name", "FirstName", "LastName", "Group", "Address", "Phone");
		for(Contact contact : lc) {
			System.out.printf("%-5s%-30s%-20s%-20s%-20s%-20s%-20s\n",
					contact.getContactID(),
					contact.getFullName(),
					contact.getFirstName(),
					contact.getLastName(),
					contact.getGroup(),
					contact.getAddress(),
					contact.getPhone());
		}
	}
	
	public static Contact getContactById(ArrayList<Contact> lc, int idDelete){
        for (Contact contact : lc) {
            if(contact.getContactID() == idDelete){
                return contact;
            }
        }
        return null;
    }
	
	public static void deleteContact(ArrayList<Contact> lc) {
		System.out.print("Enter ID to delete: ");
		int idDelete = Validation.checkInputInt();
		Contact contactDelete = getContactById(lc, idDelete);
		if(contactDelete == null) {
			System.out.println("Not found contact!");
			return;
		}
		else {
			lc.remove(contactDelete);
		}
		System.out.println("Delete contact successfully!!!");
	}
	
}
