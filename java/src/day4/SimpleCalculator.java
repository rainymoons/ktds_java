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
 * main(String[] args) 메소드에서 호출.
 * </pre>
 */
public class SimpleCalculator {

	public static int add(int a, int b) {
		return a + b ;
	}
	
	public static int dif(int a, int b) {
		return a - b;
	}
	
	public static double div(double a, double b) {
		return a / b;
	}
	
	public static int mul(int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("두 수의 합은 " + add(a,b));
		System.out.println("두 수의 차는 " + dif(a,b));
		System.out.println("두 수의 곱은 " + mul(a,b));
		System.out.println("두 수의 나눗셈은 " + div(a,b));
		
	}
	
}
