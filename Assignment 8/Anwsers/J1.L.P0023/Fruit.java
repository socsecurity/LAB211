
public class Fruit {
	private String fruitID, fruitName, origin;
	private double price;
	private int quantity;
	
	public Fruit() {
		
	}
	
	public Fruit(String fruitID, String fruitName, double price, int quantity, String origin) {
		this.fruitID = fruitID;
		this.fruitName = fruitName;
		this.origin = origin;
		this.price = price;
		this.quantity = quantity;
	}
	public String getFruitID() {
		return fruitID;
	}
	public void setFruitID(String fruitID) {
		this.fruitID = fruitID;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}

