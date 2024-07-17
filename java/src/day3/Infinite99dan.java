package day3;

import java.util.Scanner;

public class Infinite99dan {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("단 수를 입력하세요(-1을 입력하면 프로그램이 종료됩니다.) : ");
			int danNum = input.nextInt();

			
			if (danNum == -1) {
				System.out.println("프로그램이 종료됩니다.");
				break;

			} else if (danNum == 0) {
				System.out.println("0보다 큰 수를 입력 하세요.");
				continue;
				
			} else {
				System.out.println("구하고자 하는 단은 " + danNum + "단 입니다.");
				
				for(int i = 1; i < 10; i++) {
					System.out.println(danNum + " * " + i + " = " + danNum * i);
				}	
			}
		}
	}
}
