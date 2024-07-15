package day3;

import java.util.Scanner;

public class IfElseExam2_1 {

	public static void main(String[] args) {
		
		// 인원의 수가 필요할때
		// 인원수로 나누어서 요금을 구하는 것.
		Scanner input = new Scanner(System.in);
	
		int money = 900_000;
		
		System.out.print("아빠의 나이 : ");
		int father = input.nextInt();
		
		System.out.print("엄마의 나이 : ");
		int mother = input.nextInt();
		
		System.out.print("자녀의 나이 : ");
		int daughter = input.nextInt();
		
		final int ADULT_AGE = 19;
		
		int adultOneWayFlightFare = 300_000;
		int kidOnlyFlightFare = 120_000;
		
		int adultCount = 0;
		int kidCount = 0;
		
		
		if (father >= ADULT_AGE) {
			adultCount++;
		} else {
			kidCount++;
		}
		if (mother >= ADULT_AGE) {
			adultCount++;
		} else {
			kidCount++;
		}
		if (daughter >= ADULT_AGE) {
			adultCount++;
		} else {
			kidCount++;
		}
		
		int flightFare = adultOneWayFlightFare * adultCount + kidOnlyFlightFare * kidCount;
		
		
		
		System.out.println("성인 : " + adultCount);
		System.out.println("아동 : " + kidCount);
		
		System.out.println("필요 경비 : " + flightFare);
		System.out.println("준비된 현금 : " + money);
		
		
		if (money > flightFare) {
			System.out.println("여행 가자!");
		} else {
			System.out.println("다음에 가자!");
		}
	}
}