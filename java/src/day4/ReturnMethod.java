package day4;

import java.util.Random;

public class ReturnMethod {
	// 무언가를 반환시킬때 쓰는 단어 get
	public static int getRandomNumber() {
		Random random = new Random();
		//return 키워드의 역할
		//1. 값을 반환 시킨다.
		//2. 메소드(getRandomNumber)를 종료시킨다.
		return random.nextInt();
	}
	
	
	public static void main(String[] args) {
		int randomNumber = getRandomNumber();
		System.out.println(randomNumber);
	}
}
