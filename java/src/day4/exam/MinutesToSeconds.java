package day4.exam;
/**
 * 산술 연산자 연습 문제를 분, 초를 파라미터로 받으면 초를 반환하는 메소드로 만들어 호출하고 결과를 출력해보세요.
 */
public class MinutesToSeconds {

	public static int getMinResult(int minutes) {
		return 60 * minutes;
	}
	
	public static int getSecResult(int seconds) {
		return seconds;
	}
	
	public static void main(String[] args) {
		
		int minutes = 5;
		int seconds = 50;
		
		System.out.println("분과 초의 합을 초로 나타내면 " + (getMinResult(minutes) + getSecResult(seconds)));
		
	}
	
}
