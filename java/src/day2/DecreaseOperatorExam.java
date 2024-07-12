package day2;

public class DecreaseOperatorExam {
	
	
	/**
	 * class를 실행시키는 특별한 코드.
	 * @param args
	 */

	public static void main(String[] args) {

		//스스로에게 1을 빼는 실습.
		//일반 연산자
		int num1 = 0;
		num1 = num1 - 1;
		
		//짧은 연산자
		num1 = 0; //0으로 초기화(재할당)
		num1 -= 1;
		
		//단항 연산자
		num1 = 0;
		num1--;
		
		System.out.println(num1--); //1. -1
		System.out.println(num1--); //2. -2
		System.out.println(num1--); //3. -3
		System.out.println(num1);   //4. -4
		
		
		int num2 = 0;
		--num2;
		
		System.out.println(--num2); // -2
		System.out.println(--num2); // -3
		System.out.println(--num2); // -4
		System.out.println(num2);   // -4
		
	}

}
