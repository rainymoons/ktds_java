package day9.array;

import java.util.Random;

public class lotto {

	public static void main(String[] args) {
		Random random = new Random();
		int[] lottoNumList = new int[6];
		
		for (int i = 0; i < lottoNumList.length; i++) { // 추출
			lottoNumList[i] = random.nextInt(45)+1;
			
			for (int j = 0; j < i; j++) { // 검사 => 검사하는 범위는 i-1(최대값이 줄어드는 것)
				System.out.println(i + ":" + lottoNumList[i] + " / " + j + ":" + lottoNumList[j]);
				if(lottoNumList[i] == lottoNumList[j]) {
					System.out.println("중복된 숫자입니다." + lottoNumList[j]);
				}
			}
		}
		
		System.out.println("로또 번호 추출 결과");
		for (int i = 0; i < lottoNumList.length; i++) {
			System.out.println(lottoNumList[i]);
		}
		
		
	}
		
}

