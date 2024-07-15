package day3;

public class For1 {
	
	public static void main(String[] args) {
	
		/*
		 * for (초기값; 반복조건; 증감식) {
		 * 		반복할 코드
		 * }
		 */
		
//		for (int i = 1; i < 101; i++) {
//			System.out.println(i);
//		}
		
		// 1. 1 부터 1000까지의 합 출력.
		int sum = 0;
		for (int i = 1; i < 1001; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		
		// 2. 1부터 100 중 짝수의 합 출력.
		/// 1_ 연산자(%) + if 활용
		sum = 0; // 변수 초기화. 위에서 선언 했음.
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		sum = 0;
		for (int i = 2; i < 101; i+=2) { // 초기식 유연하게 수정 할 수 있게 생각해야됨.
			sum += i;
		}
		System.out.println(sum);
		
//		3. 구구단 3단을 출력해보자
		for (int i = 1; i < 10; i++) {
			int j = 3;
			System.out.println(j + " * " + i + " = " + j*i);			
		}

//		4. 9*9 구구단
		for (int i = 1; i < 10; i++) {
			System.out.println(i + " 단 시작");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println(i + " 단 끝.");
		}
		//5. 스캐너를 이용해서, 출력하고 싶은 구구단 수를 입력 받으면 해당 구구단이 출력되는 코드.
		// 1 ~ 9 <-- scanner를 이용해서 보고 싶은 곱할 수를 입력 받는다.
		// 예) 단수 : 10
		//    곱할 수 : 20
		// 출력 예 = 10 * 1 = 10 
		//    -------
		//     

	}
}
