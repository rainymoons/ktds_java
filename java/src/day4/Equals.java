package day4;

import java.util.Scanner;

public class Equals {

	
	public static void main(String[] args) {
		
		/**
		 * 비교 연산자 -> 숫자만 처리 가능! 숫자가 아니면 처리할 수 없다.
		 * ==
		 * !=
		 * >
		 * <
		 * >=
		 *  ***
		 */
		System.out.println("+" == "+"); // -> true가 나오는데 이건 메모리 주소와 관련된 이슈.
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요!");
		int age = input.nextInt(); // -> 이거 쓰고
		
		input.nextLine(); // 여기서 해줘야 개행문자 가져감.
		
		System.out.println("문자를 입력하세요!");
		String operator = input.nextLine(); // -> 이거 쓰면 둘이 동시에 출력되는 버그
		
		System.out.println("입력한 값은 " + operator + " 입니다.");
		
//		String operator = input.nextLine();
		
		System.out.println(operator == "+"); // false
		
		System.out.println(operator.equals("+")); //true
	}
}
