package day3;

import java.util.Scanner;

public class Home3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("마지막 단에 출력하고 싶은 별의 개수를 입력하세요 : ");
		int rows = input.nextInt();
		
		for(int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
