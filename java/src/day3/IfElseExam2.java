package day3;

import java.util.Scanner;

public class IfElseExam2 {

	public static void main(String[] args) {
		
		//함정 - 나이와 같은 값들은 언제든지 바뀔 수 있다. *2 이런식으로 구하면 안됨.
		Scanner input = new Scanner(System.in);
	
		int money = 900_000;
		
		System.out.print("아빠의 나이 : ");
		int father = input.nextInt();
		
		System.out.print("엄마의 나이 : ");
		int mother = input.nextInt();
		
		System.out.print("자녀의 나이 : ");
		int daughter = input.nextInt();
		
		int adult = 19;
		
		int adultOneWayFlightFare = 300_000;
		int kidOnlyFlightFare = 120_000;
		
		int totalFlightFare = 0;

		// 여기 간소화 하고 싶어 미치겠다
		
		if (father >= adult) {
			totalFlightFare += adultOneWayFlightFare;
		} else {
			totalFlightFare += kidOnlyFlightFare;
		} 
		
		if (mother >= adult) {
			totalFlightFare += adultOneWayFlightFare;
		} else {
			totalFlightFare += kidOnlyFlightFare;
		} 
		
		if (daughter >= adult) {
			totalFlightFare += adultOneWayFlightFare;
		} else {
			totalFlightFare += kidOnlyFlightFare;
		}

		
		System.out.println("필요 경비 : " + totalFlightFare);
		System.out.println("준비된 현금 : " + money);
		
		
		if (money > totalFlightFare) {
			System.out.println("여행 가자!");
		} else {
			System.out.println("다음에 가자!");
		}
	}
}