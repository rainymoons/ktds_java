package day4;

import java.util.Scanner;

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
public class SimpleCalculator2 {

	public static void add(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}
	
	public static void dif(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a - b));
	}
	
	public static void div(double a, double b) {
		System.out.println(a + " / " + b + " = " + (a / b));
	}
	
	public static void mul(int a, int b) {
		System.out.println(a + " * " + b + " = " + (a * b));
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int a = input.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int b = input.nextInt();
		
		add(a,b);
		dif(a,b);
		div(a,b);
		mul(a,b);
		
//		System.out.println("두 수의 합은 " + add(a,b));
//		System.out.println("두 수의 차는 " + dif(a,b));
//		System.out.println("두 수의 곱은 " + mul(a,b));
//		System.out.println("두 수의 나눗셈은 " + div(a,b));
//		
	}
	
}
