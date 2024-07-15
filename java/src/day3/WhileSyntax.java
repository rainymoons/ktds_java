package day3;

import java.util.Random;

public class WhileSyntax {

	public static void main(String[] args) {
		
//		int count = 1;
//		
//		while(count <= 10) {
//			System.out.println(count + ". 반복중입니다.");
//			count++;
//		}
//	}
		//무한 반복
		// - 사용하면 안됨
		// - 특정 케이스의 경우 사용.
//		while (true) {
//			System.out.println(Math.random()*100);
//		}
		
		// 조건은 알지만 언제 끝날지 모르는 반복문 -> while
		Random random = new Random();
		int enemyHealthPoint = random.nextInt(1, Integer.MAX_VALUE); // 1 ~ Integer 최댓값. nextInt(Integer.Max_Value)해도 됨
		System.out.println(enemyHealthPoint);
		
		while (enemyHealthPoint > 0) { //적체력이 0보다 클 때까지 반복해라. 작아지면 스톱

			int damage = random.nextInt(1000); // 0 ~ 999
			System.out.println(damage);
			
			enemyHealthPoint -= damage;
			
			System.out.println(enemyHealthPoint);
			
		}
	}
}