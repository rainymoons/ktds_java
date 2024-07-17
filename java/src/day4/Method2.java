package day4;

import java.util.Scanner;

public class Method2 {
	
	public static void addOneToThousand() {
		// 1. 1 부터 1000까지의 합 출력.
		int sum = 0;
		for (int i = 1; i < 1001; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void addEvenInHundred() {
		// 2. 1부터 100 중 짝수의 합 출력.
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
	}
	
	public static void addEveninHundredUseIncrease() {
		int sum = 0;
		for (int i = 2; i < 101; i += 2) {
				sum += i;
		}
	}
	
	public static void printThreeTimeTable() {
		for (int i = 1; i < 10; i++) {
			int j = 3;
			System.out.println(j + " * " + i + " = " + j*i);			
		}
	}
	
	public static void printAllTimeTable() {
		for (int i = 1; i < 10; i++) {
			System.out.println(i + " 단 시작");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println(i + " 단 끝.");
		}
	}
	
	public static void prtintWantToTimeTable() {
		//5. 스캐너를 이용해서, 출력하고 싶은 구구단 수를 입력 받으면 해당 구구단이 출력되는 코드.
		// 1 ~ 9 <-- scanner를 이용해서 보고 싶은 곱할 수를 입력 받는다.
		// 예) 단수 : 10
		//    곱할 수 : 20
		// 출력 예 = 10 * 1 = 10 
		//    -------
		//     

		Scanner input = new Scanner(System.in);
		
		System.out.print("단 수를 입력하세요 : ");
		int danNum = input.nextInt();
		
		System.out.print("곱할 수를 입력하세요 : ");
		int mulNum = input.nextInt();

		System.out.println("구하고자 하는 단은 " + danNum + " * "+ mulNum + "단 입니다.");
		
		for(int i = 1; i < mulNum+1; i++) {
			System.out.println(danNum + " * " + i + " = " + danNum * i);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		addOneToThousand();
		
		addEvenInHundred();
		
		addEveninHundredUseIncrease();
		
		printThreeTimeTable();
		
		printAllTimeTable();
		
		prtintWantToTimeTable();
	}
	
}
