package day6.product;

/**
 * (has a 클래스 실습)
 * 
 * 상품 주문 시스템 개발
 * 
 * 
 */
public class ProductMain {

	public static void main(String[] args) {
		
		Product bakkas = new Product("박카스", 15, 900);
		Product monster = new Product("몬스터", 20, 1500);
		Product hotSix = new Product("핫식스", 10, 1300);
		Product milkis = new Product("밀키스",  5, 1400);
		
		ProductOrder productOrder = new ProductOrder(bakkas, monster, hotSix, milkis);
		
		//재고 출력
		System.out.println("박카스 : " + productOrder.bakkas.productQuantity + "개 "+ "\n" + "몬스터 : " + productOrder.monster.productQuantity + "개" + "\n" + "핫식스 : " 
		+ productOrder.hotSix.productQuantity + "개 " + "\n" + "밀키스 : " + productOrder.milkis.productQuantity + "개");
	 
	}
}
