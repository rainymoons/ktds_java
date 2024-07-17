package classEx;

public class CoffeeMachine {
	
	/**
	 * 머신에 있는 원두의 양
	 */
	int amountCoffeeBeans;
	
	
	/**
	 * 추출에 사용하는 원두의 양
	 */
	int useCoffeeBeans;
	
	
	/**
	 * 커피찌꺼기 양
	 */
	int amountCoffeeTrash;
	
	/**
	 * 아메리카노 추출 버튼
	 */
	int extractAmericano;
	
	/**
	 * 에스프레소 추출 버튼
	 */
	int extractEspresso;
	
	/**
	 * 카페라떼 추출 버튼
	 */
	int extractCaffeLatte;
	
	/**
	 * 세척 버튼
	 */
	String cleaning;
	
	
	// ---- 클래스 정의 -----
	
	/**
	 * 커피 원두를 갈아버리는 기능
	 */
	public void grindingCoffeeBeans() {
		
	}
	
	/**
	 * 아메리카노를 추출하는 기능
	 */
	public void chooseAmericano() {
		if (amountCoffeeBeans - extractAmericano > 0) {
			amountCoffeeBeans -= 5;
			amountCoffeeTrash += 5;
		}
	}
	
	/**
	 * 에스프레소를 추출하는 기능
	 */
	public void chooseEspresso() {
		if (amountCoffeeBeans - extractEspresso > 0) {
			amountCoffeeBeans -= 3;
			amountCoffeeTrash += 3;
		}
	}
	
	/**
	 * 카페라떼를 추출하는 기능
	 */
	public void chooseCaffelatte() {
		if (amountCoffeeBeans - extractEspresso > 0) {
			amountCoffeeBeans -= 4;
			amountCoffeeTrash += 4;
		}
	}
	
	/**
	 * 커피머신을 청소하는 기능
	 */
	public void cleaningMachine() {
		
	}

	
	/**
	 * 커피찌꺼기를 보관함에 넣는 기능
	 */
	public void throwingCoffeTrash() {
		if (amountCoffeeTrash > 100) {
			System.out.println("커피 찌거기를 버려주세요!");
			return;
		}
	}
	
}
