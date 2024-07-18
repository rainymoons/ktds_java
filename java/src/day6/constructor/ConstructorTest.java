package day6.constructor;

public class ConstructorTest {
	
	String name;
	/**
	 * 클래스 내부에 어떤 형태의 생성자가 하나라도 있다면,
	 * 자바 컴파일러(javac)는 기본 형태의 생성자를 만들어주지 않는다!
	 * 기본 형태의 생성자 = public ConstructorTest() { }
	 */
	public ConstructorTest(String name) {
		
		System.out.println("ConstructorTest 인스턴스를 생성합니다.");
		
		//인스턴스가 생성된 직후에 아래 코드가 실행됨. 멤버 변수를 초기화 하자 마자 바로 name에 값을 넣는 것.
		//name = "unknown";
		
		// 자기가 자기 자신에게 할당
		// name = name;
		this.name = name;
	}
	
	
	
}
