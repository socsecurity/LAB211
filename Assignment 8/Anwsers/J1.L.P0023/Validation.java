
import java.util.*;

public class Validation {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static int checkInputIntLimit(int min, int max) {
		while(true) {
			int res = Integer.parseInt(sc.nextLine().trim());
			if(res >= min && res <= max) return res;
			else {
				System.err.println("Please input in range: [ " + min + " - " + max + " ]");
				System.out.print("Try again: ");
			}
		}
	}
	
	public static String checkInputString() {
		while (true) {
		String result = sc.nextLine().trim();
		if (result.isEmpty()) {
		System.err.println("Not empty");
		System.out.print("Enter again: ");
		} else 	return result;
		}
	}
	
	public static int checkInputInt() {
		while(true) {
			try {
				int res = Integer.parseInt(sc.nextLine().trim());
				return res;
			}
			catch (Exception e) {
				System.out.println("Please re-enter integer value: ");
			}
		}
	}
	
	public static double checkInputDouble() {
		while(true) {
			try {
				double res = Double.parseDouble(sc.nextLine().trim());
				return res;
			}
			catch (Exception e) {
				System.out.println("Please re-enter double value: ");
			}
		}
	}
	
	public static boolean checkInputYN() {
		while (true) {
		System.out.println("Do you want to continue (Y/N): ");
		String result = checkInputString();
		if (result.equalsIgnoreCase("Y")) return true;
		if (result.equalsIgnoreCase("N")) return false;
		System.err.println("Please input y/Y or n/N.");
		System.out.print("Enter again: ");
		}
	}
	
	public static boolean checkIdExist(ArrayList<Fruit> lf, String id) {
		for(Fruit fruit : lf) {
			if(id.equalsIgnoreCase(fruit.getFruitID())) return false;
		}
		return true;
	}
	
	public static boolean checkOrderExist(ArrayList<Order> lo, String id) {
		for(Order order : lo) {
			if(order.getFruitID().equalsIgnoreCase(id)) return false;
		}
		return true;
	}
}
