package classEx;

public class Lavazza {

	public static void main(String[] args) {
		
		CoffeeMachine lavazza = new CoffeeMachine();
		
		lavazza.amountCoffeeBeans = 100;
		lavazza.amountCoffeeTrash = 0;
		
		System.out.println("현재 커피 원두의 양 : " + lavazza.amountCoffeeBeans);
		System.out.println("아메리카노 1회 추출당 소모 원두 수량 : " + lavazza.extractAmericano);
		System.out.println("카페라떼 1회 추출당 소모 원두 수량 : " + lavazza.extractCaffeLatte);
		System.out.println("에스프레소 1회 추출당 소모 원두 수량 : " + lavazza.extractEspresso);
		
		for (int i = 1; i < 10; i++) {
			lavazza.chooseAmericano();			
		}
		lavazza.chooseCaffelatte();
		lavazza.chooseEspresso();
		
		System.out.println("현재 남아있는 커피 원두의 양은 : " + lavazza.amountCoffeeBeans);
		System.out.println("현재 커피 찌꺼기의 양은 : " + lavazza.amountCoffeeTrash);
		
		lavazza.throwingCoffeTrash();
		
		
		
	}
	
	
}
