package day4.exam;
/**
 * 산술 연산자 연습 문제를 processTime을 파라미터로 받아 분을 반환, processTime을 파라미터로 받아 초를 반환하는 메소드로 만들어 호출하고 결과를 출력해보세요.
 */
public class SecondsToMinutes {

	public static int minutes(int PROCESS_TIME, int MIN) {
		return PROCESS_TIME / MIN;
	}
	
	public static int seconds(int PROCESS_TIME, int MIN) {
		return PROCESS_TIME % MIN;
	}
	
	public static void main(String[] args) {
		final int MIN = 60;
		final int PROCESS_TIME = 145;
		
		System.out.println(PROCESS_TIME + "초 는 " + minutes(PROCESS_TIME, MIN) + "분 " + seconds(PROCESS_TIME, MIN) + "초 입니다." );
		
	}
}
