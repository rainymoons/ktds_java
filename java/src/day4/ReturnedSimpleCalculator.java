package day4;
/**
 * <pre>
 * 사칙연산을 지원하는 계산기
 * 
 * 더하기 연산이 가능
 *  - 두 숫자를 파라미터로 받아서 두 수의 합을 출력.
 * 
 * 빼기 연산이 가능
 *  - 두 숫자를 파라미터로 받아서 두 수의 차를 출력.
 *  
 * 곱하기 연산이 가능.
 *  - 두 숫자를 파라미터로 받아서 두 수의 곱을 출력
 *  
 * 나누기 연산이 가능.
 *  - 두 숫자를 파라미터로 받아서 두 수를 나눈 몫을 출력.
 *  
 * main(String[] args) 메소드에서 호출하여 반환된 값을 출력. -> 메소드는 계산만 해라. 출력은 main 메서드에서 해라.
 * </pre>
 */
public class ReturnedSimpleCalculator {

	public static int getAddResult(int a, int b) {
		return a + b;
	}
	
	public static int getSubResult(int a, int b) {
		return a - b;
	}
	
	public static int getMulResult(int a, int b) {
		return a * b;
	}
	
	public static double getDivResult(double a, double b) { 
		return a / b;
	}
	
	
	public static void main(String[] args) {
		
		int addResult = getAddResult(1, 2);
		System.out.println("결과 출력"+ addResult);
		
		int subtractResult = getSubResult(3,1);
		
		
		int multiplicateResult = getMulResult(4, 2);
		
		
		double divideResult = getDivResult(3, 4);
		
		
		
		
	}
	
}
