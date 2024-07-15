package day3;

import java.util.Scanner;

public class RandomGameClass {

	public static void main(String[] args) {
		
		System.out.println("------맞출때까지 반복하는 Up & Down 게임-------");
		System.out.println("1부터 100까지의 숫자를 입력해주세요!");
		
		//우리가 맞출 숫자를 랜덤하게 생성. random메서드 써도 됨
		double randomFloatingPoint = Math.random();
		int correctNumber = (int)(randomFloatingPoint * 100 + 1); //int로 명시적 형변환
		System.out.println(correctNumber);
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			
			int answer = input.nextInt();
			
			if (correctNumber == answer) {
				System.out.println("정답입니다!");
				System.out.println("프로그램이 종료됩니다!");
				break;
			} else if (correctNumber > answer) {
				System.out.println("Up!");
			} else {
				System.out.println("Down!");
			}			
		}
	}
}
