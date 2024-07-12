package day1;

public class NumberTypeExam {
	
	public static void main(String[] args) {

		byte byteNumber = 1;
		short shortNumber = 10;
		int intNumber = 1_000_000_000;
		long longNumber = 3_000_000_000L; //자바는 기본적으로 int가 정수의 대표 타입. 20억 이상은 int로 포현이 불가능 함.

		System.out.println(byteNumber);
		System.out.println(shortNumber);
		System.out.println(intNumber);
		System.out.println(longNumber);
		
		float floatNumber = 50;
		double doubleNumber = 100;
		
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		
		float floatNumber2 = 10.33333333333333333f;  //자바에서 부동소수점의 기본 타입은 double. 
		double doubleNumber2 = 50.6666666666666666666666;
		
		System.out.println(floatNumber2);
		System.out.println(doubleNumber2);
		
		final int AGE = 10; //final로 인해서 상수가 됨. 상수의 변수명은 대문자!
		// AGE = 20; -> 상수의 값이 한번 쓰여지면 상수의 값은 바꿀 수 없다.
		final int MY_AGE;
		
		MY_AGE = 30;
		//MY_AGE = 40; -> 불가
		
	}

}
