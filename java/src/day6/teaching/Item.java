package day6.teaching;

/**
 * 자판기에서 판매하는 상품.
 */
public class Item {
	
	String name;
	int price;
	int stock;
	
	//Producer producer; // 생산자를 추가할 수도 있음.
	
	//생성자 초기화
	public Item(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
}
