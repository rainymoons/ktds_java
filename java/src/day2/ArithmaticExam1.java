package day2;

public class ArithmaticExam1 {

	public static void main(String[] args) {
		/*
         * 산술연산자를 이용해 minutes와 seconds의 값을 초로 변환해 time 변수에 할당하고 출력해보세요.
         */
		final int ONE_MINUTES = 60; //상수는 최상단
		
		int minutes = 5;
		int seconds = 50;
		int time = 0;
		
		time = minutes * ONE_MINUTES + seconds;
		
		System.out.println(time);
		System.out.println(minutes + "분 " + seconds + "초는 총 " + time + "초 입니다.");

	}
}
