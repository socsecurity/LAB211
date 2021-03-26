import java.util.Scanner;

public class Validation {
	private static final Scanner sc = new Scanner(System.in);
	private static final String VALID_PHONE = "[(]?[0-9]{3}[)]?[-.]?[0-9]{3}[-.]?[0-9]{4}" + "|[0-9]{3}[-][0-9]{3}[-][0-9]{4}[a-z0-9]+";
	public static int checkInputLimit(int min, int max) {
		while(true) {
			try {
				int res = Integer.parseInt(sc.nextLine().trim());
				if(res < min || res > max) {
					throw new NumberFormatException();
				}
				return res;
			}
			catch(NumberFormatException e) {
				System.out.println("Please input number in range " + min + " to " + max);
				System.out.print("Try again: ");
			}
		}
	}
	
	public static String checkInputString() {
		while(true) {
			String res = sc.nextLine().trim();
			if(res.isEmpty()) {
				System.out.println("Not Empty");
				System.out.print("Try again: ");
			}
			else {
				return res;
			}
		}
	}
	
	public static boolean checkInputYN() {
		while(true) {
			String res = checkInputString();
			if(res.equalsIgnoreCase("Y")) {
				return true;
			}
			if(res.equalsIgnoreCase("N")) {
				return false;
			}
			System.out.println("Please input Y/N");
			System.out.print("Try again: ");
		}
	}
	
	public static int checkInputInt() {
		while(true) {
			try {
				int res = Integer.parseInt(sc.nextLine().trim());
				return res;
			}
			catch (Exception e) {
				System.out.println("Please enter again");
			}
		}
	}
	
	public static String checkInputPhone() {
		while(true) {
			String res = checkInputString();
			if(res.matches(VALID_PHONE)) return res;
			System.out.println(
					"Please input follow:\n"
					+ "1234567890\r\n"
					+ "123-456-7890\r\n"
					+ "123-456-7890 x1234\r\n"
					+ "123-456-7890 ext1234\r\n"
					+ "123.456.7890\r\n"
					+ "123 456 7890\r\n"
					);
		}
	}
	
	
}

