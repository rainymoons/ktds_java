package day3;

import java.util.Scanner;

public class Home2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("현재 소지금 : ");
		int money = input.nextInt();
		
		System.out.print("영화 관람료 : ");
		int fee = input.nextInt();
		
		if (money >= fee) {
			System.out.println("관람 가능");
			System.out.println("남은 금액은 " + (money-fee) + "원 입니다.");
		} else if (money < fee) {
			System.out.println("관람 불가능");
			System.out.println("모자란 금액은 " + (fee-money) + "원 입니다.");
		}
	}
}
