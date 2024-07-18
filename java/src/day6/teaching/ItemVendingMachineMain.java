package day6.teaching;
//3순위로 작성
public class ItemVendingMachineMain {

	public static void main(String[] args) {
		// 인스턴스를 먼저 만들어야 함.
		
		
		Item bacchas = new Item("박카스", 900, 15); // 얘도 파라미터를 요구함
		Item monster = new Item("몬스터", 1500, 20); // 얘도 파라미터를 요구함
		Item hotsix = new Item("핫식스", 1300, 10); // 얘도 파라미터를 요구함
		Item milkiss = new Item("밀키스", 1400, 5); // 얘도 파라미터를 요구함
		
		ItemVendingMachine vendingMachine = new ItemVendingMachine(bacchas, monster, hotsix, milkiss); // 생성자의 파라미터 즉 item들을 요구함. 그래서 전달해야됨.
		
		vendingMachine.printStock();
		Item MyItem = vendingMachine.pressItemButton("스타벅스 더블샷", 1);
		System.out.println(MyItem); //null
//		System.out.println(MyItem.name); // nullpointerException -> myItem의 주소에 아무것도 없음. 
		
		Item mySecondItem = vendingMachine.pressItemButton("밀키스", 3);
		//mySecondItem은 레퍼런스 타입이고 -> 메모리 묶음이다 -> 그래서 무엇을 출력할지 몰라 객체의 메모리 주소를 출력한다.
		// 객체의 메모리 정보를 출력한다.
		// @6fdb1f78 -> Hash Data -> 객체가 가지고 있는 데이터를 16진수로 바꾼 값.
		System.out.println(mySecondItem); //day6.teaching.Item@6fdb1f7
		
		System.out.println("구매한 상품의 이름은 : " + mySecondItem.name);
		System.out.println("구매한 상품의 가격은 : " + mySecondItem.price);
		System.out.println("구매한 상품의 수량은 : " + mySecondItem.stock);
		
		vendingMachine.printStock();
		
		Item myThirdItem = vendingMachine.pressItemButton("밀키스", 1);
		System.out.println("구매한 상품의 이름은 : " + myThirdItem.name); // 상품이 0보다 작아 null이 반환됨.
		System.out.println("구매한 상품의 가격은 : " + myThirdItem.price);
		System.out.println("구매한 상품의 수량은 : " + myThirdItem.stock);
		
		vendingMachine.fillItem("밀키스", 20); //fillItem을 실행할때. 일일이 비교하며 재고를 증가시켜라고 코드를 짰기 때문.
		vendingMachine.printStock();
		
		
	}
}
