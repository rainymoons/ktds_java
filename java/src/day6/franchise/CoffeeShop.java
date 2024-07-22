package day6.franchise;

/**
 * 상품 정보를 멤버변수로 가지고 있음.
 */
public class CoffeeShop {
	
	Coffee iceAmericano;
	Coffee hotAmericano;
	
	public CoffeeShop(Coffee iceAmericano, Coffee hotAmericano) {
		this.iceAmericano = iceAmericano;
		this.hotAmericano = hotAmericano;
	}
	
	/**
	 * 커피숍에서 음료를 주문한다.
	 * @param menu 주문할 음료의 번호 1. 아이스 아메리카노, 0. 따뜻한 아메리카노
	 * @param quantity 주문할 수량
	 * @return 주문 총액
	 */
	public int orderCoffee(int menuName, int quantity) {
		if (menuName == 1) {
			this.iceAmericano.price * quantity;
		} else if (this.hotAmericano.name == menuName) {
			this.hotAmericano*quantity;
		}
	}

}
