package day6.constructor;

public class CoffeeShop {
	
	String iceAmericanoName;
	String hotAmericanoName;

	int iceAmericano;
	int hotAmericano;
	
	double discountRatio;
	
	// 상품의 개수가 추가될수록 길어짐. 실제로 쓰기는 불가능하다. 상품을 놓고 상품과 관련된 클래스를 만드는게 낫지 않냐.
	// --> 데이터 클래스로 연결됨.
	public CoffeeShop(int iceAmericano, int hotAmericano) {
		this.iceAmericano = iceAmericano;
 		this.hotAmericano = hotAmericano;
	}
	
	// static이 없는 메소드. 인스턴스 메소드.
	public int orderCoffee(int menu, int quantity) { 
		if (menu == 1) {
			return this.iceAmericano * quantity; // this를 붙여 멤버변수임을 알려준다.
		}
		return this.hotAmericano * quantity;
	}
}
