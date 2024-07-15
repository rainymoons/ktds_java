package day3;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
	
		//5. 스캐너를 이용해서, 출력하고 싶은 구구단 수를 입력 받으면 해당 구구단이 출력되는 코드.
		// 1 ~ 9 <-- scanner를 이용해서 보고 싶은 곱할 수를 입력 받는다.
		// 예) 단수 : 10
		//    곱할 수 : 20
		// 출력 예 = 10 * 1 = 10 
		//    -------
		//         10 & 20 = 200
		
		// 전부 다 출력하는거는 중첩 for문인데, 하나만 출력하려면 중첩 for문이 필요가 없다. 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("단 수를 입력하세요 : ");
		int danNum = input.nextInt();
		
		System.out.print("곱할 수를 입력하세요 : ");
		int mulNum = input.nextInt();

		System.out.println("구하고자 하는 단은 " + danNum + " * "+ mulNum + "단 입니다.");
		
		for(int i = 1; i < mulNum+1; i++) {
			System.out.println(danNum + " * " + i + " = " + danNum * i);
		}
		
		//Java의 출력 방법
		// System.out.println(); -> ln은 출력한 뒤에 개행(엔터).
		// System.out.print(); -> 출력한 뒤 개행을 하지 않는 것.
		System.out.println();
		System.out.print("2");
		
		
		
	}
}
