package day6.constructor;

public class CoffeeshopMain {

	public static void main(String[] args) {
		
		CoffeeShop tomAndToms = new CoffeeShop(5500, 5000); // 탐앤탐스 커피샵 인스턴스 생성
		//ref타입 변수 tomAndToms 인스턴스 생성.@68ceda24 -//id22
		//tomAndToms.iceAmericano = 5500;
		//tomAndToms.hotAmericano = 5000;
		
		CoffeeShop mammoth = new CoffeeShop(1400, 1200); // 매머드 커피샵 인스턴스 생성
		// ref 타입 변수 mammoth 인스턴스 생성.  @6a6824be //->id25
		//mammoth.iceAmericano = 1400;
		//mammoth.hotAmericano = 1200;
		
		System.out.println(tomAndToms);
		System.out.println(mammoth);
		
		// 참조변수 . 메서드 명 -> 인스턴스 메소드.
		int tomAndTomsIceAmericanoPrice = tomAndToms.orderCoffee(1, 10); // 아이스아메리카노 10개 주문
		int tomAndTomsHotAmericanoPrice = tomAndToms.orderCoffee(2, 5); // 아이스아메리카노 10개 주문
		System.out.println("탐탐 아아 가격 : " + tomAndTomsIceAmericanoPrice);
		System.out.println("탐탐 뜨아 가격 : " + tomAndTomsHotAmericanoPrice);
		
		int mammothIceAmericanoPrice = mammoth.orderCoffee(1, 10);
		int mammothHotAmericanoPrice = mammoth.orderCoffee(2, 5);
		System.out.println("메머드 뜨아 : " + mammothHotAmericanoPrice);
		System.out.println("메머드 아아 : " + mammothIceAmericanoPrice);
		//탐앤탐스.오더커피 -> 인스턴스 메소드 -> 메모리 주소 생성 -> THIS가 받는다.
		//int price부분 인스턴스 주소가 같음 왜? int형 변수 -> prime 타입
		
	}
	
}
