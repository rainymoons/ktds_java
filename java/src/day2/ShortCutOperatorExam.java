package day2;

public class ShortCutOperatorExam {
	
	public static void main(String[] args) {

		//일반 산술 연산자 실습
		int num1 = 10;
		num1 = num1 + 2;
		System.out.println(num1);
		
		
		//짧은 표현식 실습
		//생겨난 배경 : 코드르 짧은 시간내에 효율적으로 작성하기 위해
		int num2 = 20;
		num2 += 4;
		System.out.println(num2);
		
		int num3 = 30;
		//num3 = num3 + 6;
		num3 += 6;
		System.out.println(num3);
		
		int num4 = 40;
		//num4 = num4 - 10;
		num4 -= 10;
		System.out.println(num4);
		
		int num5 = 50;
		//num5 = num5 * 12;
		num5 *= 12;
		System.out.println(num5);
		
		int num6 = 60;
		//num6 = num6 / 14;
		num6 /= 14;
		System.out.println(num6);
		
		int num7 = 70;
		//num7 = num6 % 16;
		num7 %= 16;
		System.out.println(num7);
		
	}

}
