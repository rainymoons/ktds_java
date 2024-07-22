package day7.staticclassmethod;

/**
 * 클래스 메소드 예제
 */
public class StringUtils {
	// 아래 쓴게 유틸리티.
	
	/**
	 * 파라미터 str의 값이 비어있는지 검사.
	 * @param str 검사하고자 하는 문자열
	 * @return str이 null이거나 빈 문자열이면 true 반환
	 */
	public static boolean isEmpty(String str) {
		return str == null || str.equals(""); //null이거나 빈 문자열
	}
	
	/**
	 * 파라미터 str의 값이 숫자로만 구성되어있는지 검사.
	 * @param str 검사하고자 하는 문자열
	 * @return 0부터 9로 구성된 숫자로만 이루어져있다면 true 반환
	 */
	public static boolean isNumber(String str) {
		return str.matches("&*^(*@#"); 
		
	}
	
	/**
	 * 숫자로만 이루어진 문자열을 숫자로 변경시킨다.
	 * @param str 숫자로 변경시킬 문자열
	 * @return str을 숫자로 변경시킨 결과
	 */
	public static int parseInt(String str) {
		return Integer.parseInt(str); // Integer라는 클래스로 접근하는 중이니까 static 클래스
	}
	
}
