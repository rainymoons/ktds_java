package day4;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		int a = 2;
		int b = 1; 
		String str = "";
		
		Scanner input = new Scanner(System.in);
		
		
		
		
		while(true) {
			

			System.out.println("=== 다음의 연산자 중 하나를 선택해 입력하세요! === ");
			System.out.print("  === (  +  ,  -  ,  *  ,  /  ) === : ");
			String inputMsg = input.nextLine();
			
			if (input.equals("exit") ) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
			
			System.out.print("=== 숫자를 입력하세요! === : ");
			int inputNum1 = input.nextInt();
			
			System.out.print("=== 숫자를 입력하세요! === : ");
			int inputNum2 = input.nextInt();
			input.nextLine();
			
			int resultPlus = inputNum1 + inputNum2;
			int resultSub = inputNum1 - inputNum2;
			int resultMul = inputNum1 * inputNum2;
			int resultDiv = inputNum1 / inputNum2;
			
			if (inputMsg.equals("exit")) {
				System.out.println("프로그램을 종료합니다!");
				break;
			} else if (inputMsg.equals("+")) {
				System.out.println(resultPlus);
			} else if (inputMsg.equals("-")) {
				System.out.println(resultSub);
			} else if (inputMsg.equals("*")) {
				System.out.println(resultMul);
			} else if (inputMsg.equals("/")) {
				System.out.println(resultDiv);
			}
			
			
		}
	}
}
