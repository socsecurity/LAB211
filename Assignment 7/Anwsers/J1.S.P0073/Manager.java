import java.util.ArrayList;

public class Manager{

    public static void addExpense(ArrayList<Expenses> le, int id) {
        System.out.println("-------- Add an expense--------");
        System.out.print("Enter Date: ");
        String date = Validation.checkInputDate();
        System.out.print("Enter Amount: ");
        double amount = Validation.checkInputDouble();
        System.out.print("Enter Content: ");
        String content = Validation.checkInputString();
        le.add(new Expenses(id, date, amount, content));
    }

    public static void displayExpense(ArrayList<Expenses> le) {
        if (le.size() == 0) {
            System.err.println("List Expenses is empty");
            return;
        }
        System.out.println("---------Display all expenses------------");
        double total = 0;
        System.out.printf("%-7s%-20s%-20s%-20s\n", "ID", "Date", "Amount of money", "Content");
        for (int i = 0; i < le.size(); i++) {
            System.out.printf("%-7d%-20s%-20.0f%-20s\n", le.get(i).getId(), le.get(i).getDate(),
                    le.get(i).getAmount(), le.get(i).getContent());
            total += le.get(i).getAmount();
        }
        System.out.printf("%-20s %-20.0f\n", "Total:", total);
    }

    public static int checkIdExist(ArrayList<Expenses> le, int id) {
        for (int i = 0; i < le.size(); i++) {
            if (le.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static void deleteExpense(ArrayList<Expenses> le) {
        System.out.println("--------Delete an expense------");
        System.out.print("Enter ID: ");
        int id = Validation.checkInputInt();
        int checkIdExist = checkIdExist(le, id);
        if (checkIdExist != -1) {
            le.remove(checkIdExist);
            System.out.println("Delete an expense successful");
            for (int i = id - 1; i < le.size(); i++) {
                le.get(i).setId(le.get(i).getId() - 1);
            }
        } else {
            System.err.println("Delete an expense fail");
        }
    }

    public static void display() {
        ArrayList<Expenses> le = new ArrayList<>();
        int id = 0;
        while (true) {
            System.out.println("=======Handy Expense program======");
            System.out.println("1. Add an expense");
            System.out.println("2. Display all expenses");
            System.out.println("3. Delete an expense");
            System.out.println("4. Quit");
            System.out.print("Your choice: ");
            int choice = Validation.checkIntLimit(1, 4);
            switch (choice) {
                case 1:
                    addExpense(le, ++id);
                    break;
                case 2:
                    displayExpense(le);
                    break;
                case 3:
                    deleteExpense(le);
                    id--;
                    break;
                case 4:
                    return;
            }
        }
    }
}