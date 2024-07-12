package day1;

public class CastingTest1 {

	public static void main(String[] args) {

		//각 과목의 점수를 표현할 정수형 변수 4개를 생성. 각 과목의 점수 변수에 임의의 값을 할당.
		//double 타입의 평균 점수를 할당할 변수 1개를 생성. 평균 점수가 부동소수점 형태로 출력.
		int a = 80;
		int b = 90;
		int c = 95;
		int d = 60;
		
		double avg = (a + b + c + d) / 4.0;
		System.out.println(avg);
		
		double avg1 = (a + b + c + d) / (double)4;
		System.out.println(avg1);
		
		
	}
}
