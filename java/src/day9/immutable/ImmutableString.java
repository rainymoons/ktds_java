package day9.immutable;

public class ImmutableString {
	
	// buffer - 임시 저장 공간. 뭐가 들어올지 모르니 일단 buffer 메모리에 올려두겠다.
	// 자바 15버전 이상에서 + 없이 문자열 더하기
	public static void makeStringOverJava15() {
		String dummyText = """
			Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
			Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
			when an unknown printer took a galley of type and scrambled it to make a type specimen book. 
			It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. 
			It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, 
			and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
			""";
		System.out.println(dummyText);
	}
	
	
	/**
	 * 매우 큰 String 합 연산 - 10만번
	 */
	public static void hugeStringConcat() {
		String dummyText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		// + 연산 할때마다 메모리 공간이 새로 할당됨. 반복문을 수행하면 1번 + 1000번. 1001개가 생김. 10만번 하니까 결과 안나옴.
		// 그래서 이런식으로 더하면 안됨.
		for (int i = 0; i < 100000; i++) {
			dummyText += "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		}
		System.out.println(dummyText);
	}
	
	/**
	 * String의 값에 + 연산을 이용해
	 * 숫자나 boolean 등 다른 타입의 값을 더하면 
	 * 그 결과는 반드시 String이 된다.를 확인
	 */
	public static void concatenation2() {
		int numberOne = 10;
		int numberTwo = 5;
		
		String resultString = numberOne + " + " + numberTwo + "의 결과는 " + numberOne + numberTwo;
		System.out.println(resultString);
	 
	
		Student student = new Student("케이티");
		String classNameString = "student 인스턴스의 클래스는 " + Student.class;
		System.out.println(classNameString);
		
		String instanceString = "student 인스턴스는 " + student;
		System.out.println(instanceString);
	}
	
	/**
	 * String의 값에 + 연산을 할 경우
	 * 새로운 메모리로 할당 되는지 확인.
	 */
	public static void concatenation() {
		
		String hello = "안녕하세요";
		/* hash Data를 조회하는 기능
		 *  -> Reference Type(Instance)의 메모리 주소를 확인하는 방법
		 */
		int hashData = System.identityHashCode(hello);
		System.out.println(hashData + " > " + hello);
		
		hello += "반갑습니다.";
		hashData = System.identityHashCode(hello);
		System.out.println(hashData + " > " + hello);
	}
	
	public static void main(String[] args) {
		concatenation();
		concatenation2();
//		hugeStringConcat(); 
		makeStringOverJava15();
	}

}
