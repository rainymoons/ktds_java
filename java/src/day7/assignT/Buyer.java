package day7.assignT;
/**
 * 구매자
 */
public class Buyer {

	private int itemCount;
	private int money;
	
	public int getItemCount() {
		return this.itemCount;
	}
	
	public int getMoney() {
		return this.getMoney();
	}
	
	// 기본 할당 값 -> int는 0, boolean은 false, char는 0(문자) -> 숫자를 문자로 표현
	public Buyer(int money) {
		this.money = money;
	}
	
	/**
	 * 구매자가 구매를 한다.
	 * @param quantity 구매할 수량
	 * @param price 구매할 수량 * 판매 상품의 단가
	 */
	public void buy (int quantity, int price) { // price가 필요한 이유는 money와 비교하기 위해서.
		
		if(this.money  >= price) { //price * quantity를 하지 않는 이유. money
			this.money -= price;
			this.itemCount += quantity;
			return; //else 쓰기 귀찮음
		} // 돈이 없으면 아무 일도 안함.
		System.out.println("거지");
	}
	
	public void printBuyerInfo() {
		System.out.println("구매자의 상품 수 : " + this.itemCount + "개");
		System.out.println("판매자의 지갑 현황 : " + this.money + "원");
	}
	
}
