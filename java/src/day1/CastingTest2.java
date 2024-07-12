package day1;

/**
 * <pre>
 *
 * Document 주석 (클래스 주석)
 * 
 * 클래스나 메소드 혹은 멤버 변수들을 설명하기 위한 가이드.
 * 
 * 해당 클래스나 메소드 혹은 멤버 변수에 마우스를 가져다 올리면 주석이 툴팁으로 나타난다.
 * </pre>
 */
public class CastingTest2 {
	/** (멤버변수 주석)
	 * 형변환 예제 실습 번호
	 */
	int testCaseNumber; //멤버 변수

	/** (메소드 주석)
	 * 클래스의 실행을 담당하는 메소드.
	 * 
	 * @param args 실행할 때 전달된 데이터
	 */
	public static void main(String[] args) {

		/** Q1.정수형 값 9725를 부동소수점 값 97.25로 변경 후 출력해 보세요. **/
		int number = 9725;
		double doubleNumber = number * 0.01;
		
		System.out.println(doubleNumber);
		
		
		/* Q2. 93.167 값을 93.17로 반올림해 출력해보세요.(교재 p.86참고) */
		double average1 = 93.167;
		double average2 = Math.round(average1 * 100) * 0.01;
		System.out.println(average2);
		
		
		double avg = 93.167;
		double tempAvg = avg * 100;
		System.out.println(tempAvg);

		long intAvg = Math.round(tempAvg);
		System.out.println(intAvg);
		
		avg = (double)intAvg / 100;
		System.out.println(avg);
		
	}
	
	public static double round(double value, int point) {
	
		double result = value * Math.pow(10, point);
		
		result = Math.round(result);
		result /= Math.pow(10, point);
		return result;
	}
}

	// single line Comment

	/*
	 * Multi Line Comment
	 */
