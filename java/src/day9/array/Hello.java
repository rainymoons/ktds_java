package day9.array;

public class Hello {

	public static void main(String[] args) {
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i] + ", 안녕하세요?");
		}
		
		System.out.println(args); //[Ljava.lang.String;@65ae6ba4 -> null이 아닌걸 보니 뭔가가 전달중이다. 
	}
}
