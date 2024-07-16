package day4;
/**
 * Simple Parameter
 */
public class Method3 {

	public static void printHello(String name, String message) {
		System.out.println(name + "씨, " + message);
	}
	
	public static void main(String[] args) {
		
		//String name = "불안이"; -> 이게 파라미터로 들어가게 되는 것. 즉, 변수 -> 파라미터
		//System.out.println(name + "씨, 안녕하세요?");
		
		printHello("불안이", "안녕하세요!"); // 파라미터에 값을 넣어서 확인 할 수 있다.
		printHello("따분이", "반갑습니다!"); 
		printHello("기쁨이", "누구세요?"); 
		printHello("부럽이", "안녕히가세요!");
	}
}
