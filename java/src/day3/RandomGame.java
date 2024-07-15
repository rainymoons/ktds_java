package day3;

import java.util.Scanner;

public class RandomGame {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		double randomNumber = Math.random();
		int answer = (int)(randomNumber * 100);
		//System.out.println(answer);
		
		while(true) {
			System.out.print("정답을 입력하세요 : ");
			int num = input.nextInt();
			
			if (answer > num) {
				System.out.println("Up!");
			} else if (answer < num) {
				System.out.println("Down!");
			} else if (answer == num){
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}
		System.out.println("정답을 맞췄습니다! 답은 " + answer + "입니다.");
	}
}
