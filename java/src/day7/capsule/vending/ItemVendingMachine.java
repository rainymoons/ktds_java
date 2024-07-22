package day7.capsule.vending;
//아이템을 멤버변수로 가져야 하므로 2순위
/**
 * 네 종류의 Item을 판매하는 자판기.
 */
public class ItemVendingMachine {
	// 멤버변수 네개를 만든다. item이 네개니까.  -> item이라는 클래스를 멤버변수로 가지게 할 것.
	
	// has a 관계. itemOne 자체가 인스턴스. -> itemOne.stock 등의 연결관계가 실행가능.
	private Item itemOne;
	private Item itemTwo;
	private Item itemThree;
	private Item itemFour;
	
	// Item 초기화 -> 생성자 필요
	public ItemVendingMachine(Item itemOne, Item itemTwo, Item itemThree, Item itemFour) { //이제 전달받은것을 넣을 수 있음.
		this.itemOne = itemOne;
		this.itemTwo = itemTwo;
		this.itemThree = itemThree;
		this.itemFour = itemFour;
	// 주문하기, 입고하기, 재고출력 기능에 사용된다.
	// 이게 데이터 클래스이기 때문에 더이상 item 클래스는 사용되지 않음.
	}
	
	public Item getItemOne() {
		return this.itemOne;
	}
	
	public Item getItemTwo() {
		return this.itemTwo;
	}
	
	public Item getItemThree() {
		return this.itemThree;
	}
	
	public Item getItemFour() {
		return itemFour;
	}
	
	public int changeStock() {
		if ()
	}
	
	
	// 주문하기 기능 개발.
	public Item pressItemButton(String ItemName, int PressTime) {
		
		if (this.itemOne.getName().equals(ItemName)) {
			if (this.itemOne.getStock() > 0 && this.itemOne.getStock() >= PressTime) {
				this.itemOne.getStock() -= PressTime; //스톡을 누르는 횟수만큼 차감	
				//손님이 가져갈 상품의 정보. outputItem을 반환.
				Item outputItem = new Item(this.itemOne.getName(), this.itemOne.getPrice()*PressTime, PressTime);
				// 논리적 목적 -> outPutItem에 담지 않으면 진열되어 있는 모든 상품이 나갈 위험이 존재한다. 그것을 방지하기 위한 것.
				// 도구적 목적 -> outPutItem에 담아 놓은 상품명, 누른 횟수(제품 수량), 가격 등의 정보를 재고 관리에 사용하기 위함임.
				
				return outputItem; // 손님에게 상품을 전달한다.
				
				//return this.itemOne; //ItemOne은 자판기가 보유하고 있는 상품의 정보. 버튼을 1회 누르면 한개의 상품을 가져감. return this.ItemOne은 자판기가 가지고 있는 모든 상품을 주게 된다는 것.
				
			} else {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
		}
		else if(this.itemTwo.name.equals(ItemName)) {
			if (this.itemTwo.stock > 0 && this.itemTwo.stock >= PressTime) {
				this.itemTwo.stock -= PressTime; 	
				
				Item outputItem = new Item(this.itemTwo.name, this.itemTwo.price*PressTime, PressTime);
				
				return outputItem; 
				
				
			} else {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}			
		}
		else if(this.itemThree.name.equals(ItemName)) {
			if (this.itemThree.stock > 0 && this.itemThree.stock >= PressTime) {
				this.itemThree.stock -= PressTime; 
				Item outputItem = new Item(this.itemThree.name, this.itemThree.price*PressTime, PressTime);
				
				return outputItem;
				
			} else {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}			
		}
		else if(this.itemFour.name.equals(ItemName)) {
			if (this.itemFour.stock > 0 && this.itemFour.stock >= PressTime) {
				this.itemFour.stock -= PressTime;
				Item outputItem = new Item(this.itemFour.name, this.itemFour.price*PressTime, PressTime);
				
				return outputItem;
				
				
			} else {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}						
		}
		else {
			System.out.println("그런 상품은 없습니다.");
		}
		return null; 
	}
	
	// 입고하기 - 파라미터 (제품명, 입고 수량) name과 같으면 Stock을 증가시킨다. -> 주문하기와 동일
	public void fillItem(String itemName, int Stock) {
		if(this.itemOne.name.equals(itemName)) {
			this.itemOne.stock += Stock;
		} else if (this.itemTwo.name.equals(itemName)) {
			this.itemTwo.stock += Stock;

		} else if (this.itemThree.name.equals(itemName)) {
			this.itemThree.stock += Stock;

		} else if (this.itemFour.name.equals(itemName)) {
			this.itemFour.stock += Stock;
		}
		// void이므로 return x
	}
	
	// 재고 출력
	public void printStock() {
		System.out.println(this.itemOne.name + " :"  + this.itemOne.stock + "개");
		System.out.println(this.itemTwo.name + " :"  + this.itemTwo.stock + "개");
		System.out.println(this.itemThree.name + " :"  + this.itemThree.stock + "개");
		System.out.println(this.itemFour.name + " :"  + this.itemFour.stock + "개");
	}
	
}
