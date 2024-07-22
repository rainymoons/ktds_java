package day7.capsule.vending;

/**
 * 자판기에서 판매하는 상품.
 */
public class Item {
	
	private String name;
	
	private int price;
	
	private int stock;
	
	
	//Producer producer; // 생산자를 추가할 수도 있음.
	
	//생성자 초기화
	public Item(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getStock() {
		return stock;
	}
	

}
