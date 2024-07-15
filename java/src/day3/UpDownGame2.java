package day3;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame2 {

	public static void main(String[] args) {
		// Psuedo Code.(의사 코드)
		// 코드의 논리식을 문자로 나열.
		
		//1. 랜덤한 숫자 하나를 생성.
		Random random = new Random();
		int answer = random.nextInt(100); //100이면 0~99 범위의 난수 생성
		//System.out.println(answer);
		
		//2. 사용자가 숫자를 입력.
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int inputNum = input.nextInt();
		
		String result = "";
		
		
		//3. 랜덤한 숫자와 사용자가 입력한 숫자가 같은지 비교. -> "정답입니다!" 출력.
		if (answer == inputNum) {
			result = "정답입니다.";
		}
	
		//4. 랜덤한 숫자가 사용자가 입력한 숫자보다 작은지 비교. -> "Down!" 출력.
		else if(answer < inputNum) {
			result = "Donw!";
		} 
		
		//5. 랜덤한 숫자가 사용자가 입력한 숫자보다 큰 지 비교. -> "Up!" 출력.
		else {
			result = "Up!";
		}
		
		System.out.println(result);
	}
}
