package day4;

public class Method1 {
		
	public static void greeting() {
		System.out.println("Hello, Method!");
	}
	
	public static void addNumber() {
		int numberOne = 10;
		int numberTwo = 30;
		System.out.println(numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
	}
	
	public static void gugudan() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
	}

	public static void main(String[] args) {
		
		gugudan(); // 디버그 F11 -> F6(실행) -> F5(메서드로 이동, gugudan()으로 ). 돌아가려면 F7
		
		addNumber();
		
		for (int i = 0; i < 5; i++ ) {
			greeting();			
		}
	}
}
