package day6.constructor;

public class ConstructorMain {
	
	/*
	 * 생성자란,
	 * 	인스턴스를 만들어주는 메소드.
	 * 	반환타입이 없다 -> 기능을 수행한 결과를 반환 시킬 수 없다. -> 반환 시킬수 없는 생성자 = 메소드
	 * 메소드란,
	 * 	특정 기능을 수행하는 코드 묶음.
	 * 	특정 기능을 수행하기 위해서 파라미터를 요구할 수 있다.
	 * 	기능을 수행한 결과를 반환시킬 수 있다.
	 */
	
	
	public static void main(String[] args) {
		
		//(컴파일 에러) ConstructorTest constTest2 = new ConstructorTest();
		// 생성자가 만들어져있기 때문에 위의 기본 생성자를 호출할 수 없음.
		ConstructorTest constTest = new ConstructorTest("홍길동");
		
		System.out.println(constTest.name);
		
		constTest.name = "홍길동2";
		System.out.println(constTest.name);
		
		
	}
}
