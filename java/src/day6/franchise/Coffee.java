package day6.franchise;
/**
 * 커피샵이 판매하는 상품의 정보들.
 * 데이터 클래스에 존재하는 것.
 * 	- 멤버변수
 * 	- 생성자
 */
public class Coffee {
	
	String name;
	int price;
	
	public Coffee(String name, int price) { // 생성자를 초기화 시키기 위해 파라미터를 적는다. 
		
		this.name = name;
		this.price = price; // 어디에 쓰일지는 모르지만 일단 할당 시키는 것.
		
	}
}
