import java.util.ArrayList;
import java.util.Hashtable;

public class Manager {
	public static int menu() {
		System.out.println("1. Create Fruit");
		System.out.println("2. View Order");
		System.out.println("3. Shopping for buyer");
		System.out.println("4. Exit");
		System.out.println("Please enter your choice: ");
		int choice = Validation.checkInputIntLimit(1, 4);
		return choice;
	}
	
	public static void createFruit(ArrayList<Fruit> lf) {
		while(true) {
			System.out.println("Enter fruit ID: ");
			String fruitId = Validation.checkInputString();
			if(!Validation.checkIdExist(lf, fruitId)) {
				System.out.println("ID exist!!!");
				return;
			}
			System.out.println("Enter fruit name: ");
			String fruitName=Validation.checkInputString();
			System.out.println("Enter price: ");
			double price=Validation.checkInputDouble();
			System.out.println("Enter Quantity: ");
			int quantity=Validation.checkInputInt();
			System.out.println("Enter origin: ");
			String origin=Validation.checkInputString();
			lf.add(new Fruit(fruitId, fruitName, price, quantity, origin));
			if(!Validation.checkInputYN()) {
				return;
			}
		}
	}
	
	public static void viewOrder(Hashtable<String,ArrayList<Order>> ht) {
		for(String name: ht.keySet()) {
			System.out.println("Customer: "+name);
			ArrayList<Order> lo = ht.get(name);
			displayListOrder(lo);
		}
	}
	
	public static void shopping(ArrayList<Fruit> lf, Hashtable<String,ArrayList<Order>> ht) {
		if(lf.isEmpty()) {
			System.out.println("Have no item.");
			return;
		}
		ArrayList<Order> lo = new ArrayList<>();
		while(true) {
			displayListFruit(lf);
			System.out.println("PLease enter item: ");
			int  item = Validation.checkInputIntLimit(1, lf.size());
			Fruit fruit = getFruitbyItem(lf, item);
			System.out.println("Please enter quantity: ");
			int quantity=Validation.checkInputIntLimit(1, fruit.getQuantity());
			fruit.setQuantity(fruit.getQuantity() - quantity);
			if(!Validation.checkOrderExist(lo, fruit.getFruitID())) {
				updateOrder(lo, fruit.getFruitID(), quantity);
			}
			else {
				lo.add(new Order(fruit.getFruitID(), fruit.getFruitName(), fruit.getPrice(), quantity));
			}
			if(!Validation.checkInputYN()) {
				break;
			}
			displayListOrder(lo);
			System.out.println("Input your name: ");
			String name = Validation.checkInputString();
			ht.put(name, lo);
			System.out.println("Ad Successfully!!!");
		}
	}
	
	public static void displayListFruit(ArrayList<Fruit> lf) {
		int countItem=1;
		System.out.printf("%20s%20s%20s%20s%20s\n", "Item", "Fruit name", "Origin", "Price", "Quantity");
		for(Fruit fruit : lf) {
			if(fruit.getQuantity()!=0) {
				System.out.printf("%20s%20s%20s%20s%20s\n", 
						countItem++, 
						fruit.getFruitName(), 
						fruit.getOrigin(), 
						fruit.getPrice(), 
						fruit.getQuantity());
			}
		}
	}
	
	public static Fruit getFruitbyItem(ArrayList<Fruit> lf, int item) {
		int countItem=0;
		for(Fruit fruit : lf ) {
			if(fruit.getQuantity()!=0) {
				countItem++;
			}
			if(countItem==item) {
				return fruit;
			}
		}
		return null;
	}
	
	public static void displayListOrder(ArrayList<Order> lo) {
		double total=0;
		System.out.printf("%20s%20s%20s%20s\n", "Product", "Quantity", "Price", "Amount");
		for(Order order:lo) {
			System.out.printf("%20s%20s%20s%20s\n", 
					order.getFruitName(),
					order.getQuantity(),
					order.getPrice(),
					order.getQuantity() * order.getPrice());
			total += order.getQuantity() * order.getPrice();
		}
		System.out.println("Total: " + total);
	}
	
	public static void updateOrder(ArrayList<Order> lo, String id, int quantity) {
		for(Order order : lo) {
			if(order.getFruitID().equalsIgnoreCase(id)) {
				order.setQuantity(order.getQuantity()+quantity);
				return;
			}
		}
	}
	
	
	
	
	
	
	
}