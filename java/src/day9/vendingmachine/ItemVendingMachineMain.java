package day9.vendingmachine;

public class ItemVendingMachineMain {

	public static void main(String[] args) {
		
		Item bacchas = new Item("박카스", 900, 15);
		Item monster = new Item("몬스터", 1500, 20);
		Item hotsix = new Item("핫식스", 1300, 10);
		Item milkiss = new Item("밀키스", 1400, 5);
		
		ItemVendingMachine vendingMachine = 
				new ItemVendingMachine(bacchas, monster, hotsix, milkiss);
		
		vendingMachine.printStock();
		
		Item myItem = vendingMachine.pressItemButton("스타벅스 더블샷", 1);
		System.out.println(myItem);
		
		Item mySecondItem = vendingMachine.pressItemButton("밀키스", 3);
		// mySecondItem ==> Reference Type ==> 메모리 묶음 ==> 무엇을 출력할지 모른다.
		//    객체의 메모리 정보를 출력한다.
		//      @87aac27 ==> Hash Data ==> 객체가 가지고 있는 데이터를 숫자로 바꾼 값.
		System.out.println(mySecondItem); // franchise.Item@87aac27
		System.out.println("구매한 상품의 이름 : " + mySecondItem.name);
		System.out.println("구매한 상품의 총 가격 : " + mySecondItem.price);
		System.out.println("구매한 상품의 개수 : " + mySecondItem.stock);
		
		vendingMachine.printStock();
		
		Item myThirdItem = vendingMachine.pressItemButton("밀키스", 10);
		System.out.println(myThirdItem);
		
		vendingMachine.printStock();
		
		vendingMachine.fillItem("밀키스", 20);
		vendingMachine.printStock();
	}
	
}











