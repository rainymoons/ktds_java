package day9.vendingmachine;

/**
 * 자판기
 * 
 * 4개의 Item을 판매하는 자판기.
 * 
 */
public class ItemVendingMachine {

	Item itemOne;
	Item itemTwo;
	Item itemThree;
	Item itemFour;
	
	public ItemVendingMachine(Item itemOne, Item itemTwo, Item itemThree, Item itemFour) {
		this.itemOne = itemOne;
		this.itemTwo = itemTwo;
		this.itemThree = itemThree;
		this.itemFour = itemFour;
	}
	
	public Item pressItemButton(String itemName, int pressTime) {
		
		if (this.itemOne.name.equals(itemName)) {
			if (this.itemOne.stock > 0 && this.itemOne.stock >= pressTime) {
				this.itemOne.stock -= pressTime;
				
				// 손님이 가져갈 상품의 정보.
				Item outputItem = new Item(this.itemOne.name, 
											this.itemOne.price * pressTime, 
											pressTime);
				return outputItem; // 손님에게 상품을 전달한다.
			}
			else {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
		}
		else if (this.itemTwo.name.equals(itemName)) {
			if (this.itemTwo.stock > 0 && this.itemTwo.stock >= pressTime) {
				this.itemTwo.stock -= pressTime;
				
				// 손님이 가져갈 상품의 정보.
				Item outputItem = new Item(this.itemTwo.name, 
											this.itemTwo.price * pressTime, 
											pressTime);
				return outputItem; // 손님에게 상품을 전달한다.
			}
			else {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
		}
		else if (this.itemThree.name.equals(itemName)) {
			if (this.itemThree.stock > 0 && this.itemThree.stock >= pressTime) {
				this.itemThree.stock -= pressTime;
				
				// 손님이 가져갈 상품의 정보.
				Item outputItem = new Item(this.itemThree.name, 
											this.itemThree.price * pressTime, 
											pressTime);
				return outputItem; // 손님에게 상품을 전달한다.
			}
			else {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
		}
		else if (this.itemFour.name.equals(itemName)) {
			if (this.itemFour.stock > 0 && this.itemFour.stock >= pressTime) {
				this.itemFour.stock -= pressTime;
				
				// 손님이 가져갈 상품의 정보.
				Item outputItem = new Item(this.itemFour.name, 
											this.itemFour.price * pressTime, 
											pressTime);
				return outputItem; // 손님에게 상품을 전달한다.
			}
			else {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
		}
		else {
			System.out.println("그런 상품은 없습니다.");
		}
		
		return null; // 메모리에 할당된 데이터가 없는 상태.
	}
	
	public void fillItem(String itemName, int stock) {
		
		if (this.itemOne.name.equals(itemName)) {
			this.itemOne.stock += stock;
		}
		else if (this.itemTwo.name.equals(itemName)) {
			this.itemTwo.stock += stock;
		}
		else if (this.itemThree.name.equals(itemName)) {
			this.itemThree.stock += stock;
		}
		else if (this.itemFour.name.equals(itemName)) {
			this.itemFour.stock += stock;
		}
		else {
			System.out.println("그런 상품은 판매하지 않습니다.");
		}
		
	}
	
	public void printStock() {
		System.out.println(this.itemOne.name + " : " + this.itemOne.stock + "개");
		System.out.println(this.itemTwo.name + " : " + this.itemTwo.stock + "개");
		System.out.println(this.itemThree.name + " : " + this.itemThree.stock + "개");
		System.out.println(this.itemFour.name + " : " + this.itemFour.stock + "개");
	}
}










