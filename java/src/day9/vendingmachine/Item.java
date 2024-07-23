package day9.vendingmachine;

/**
 * 자판기에서 판매하는 상품.
 */
public class Item {

	String name;
	int price;
	int stock;
	
	public Item(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
}
