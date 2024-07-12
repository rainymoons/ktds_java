package day2;

import java.util.Scanner;

public class LogicalOperatorProblem {
	
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		/*
		 * Q. 정수형 변수 두 개를 생성하고, keyboard.nextInt()를 이요해 값을 각각의 변수에 할당한 뒤
		 * 두 변수의 값 중 큰 값을 가진 변수의 값을 출력
		 * (삼항연산자 사용)
		 */
		System.out.println("첫 번째 숫자를 입력하세요.");
		int num1 = keyboard.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int num2 = keyboard.nextInt();
		
		boolean isBigger = num1 > num2 ;
		System.out.println(num1);
		
		System.out.println(num1 > num2 ? num1 : num2);
		//일단 비교. 1이 2보다 크다면 1을 출력하고 싶다. -> 출력은 마지막에 해주는 것. println
		
		int biggestNum = num1 > num2 ? num1 : num2; // 둘 중 하나가 biggestNum에 들어감.
		System.out.println(biggestNum);
		
		//삼항연산자가 잘 사용 되지 않는 이유
		//조건과 처리의 구분이 모호하다. -> 의미를 분석하기 쉽지않다.
	}

}
