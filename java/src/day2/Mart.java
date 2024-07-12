package day2;

import java.util.Random;

public class Mart {

	public static void main(String[] args) {

		/*
		 * 내가 가진 돈이 2000원이 있다. 
		 * 어떤 물건을 사고 싶은데, 가격이 랜덤이다.
		 * 이 물건을 살 수 있으면 "구매 성공" 이라고 출력하고,
		 * 살 수 없으면 "구매 실패"라고 출력한다.
		 * 
		 * 살 수 있는 조건은 내가 가진 돈 >= 물건의 가격  --> 구매 성공
		 */
		int money = 2000;
		
		//ctrl+shift+o
		Random random = new Random(); //랜덤한 숫자를 가져오는 코드
		
		//int price = random.nextInt(); //-21억 ~ 21억
		int price = random.nextInt(4000); // 0 ~ 3999
		
		System.out.println("내가 가진 돈 : " + money);
		System.out.println("상품의 가격 : " + price);
		
		if(money >= price) {
			System.out.println("구매 성공!");
		} else {
			System.out.println("구매 실패!");
		}
		
	}

	
}
