package day2;

public class ArithmaticExam2 {
	
	public static void main(String[] args) {
		
		/* 산술 연산자를 이용해 processTime을 분(Minute), 초(Second)를 구한다음 minutes, seconds 변수에 할당하고 출력해보세요.*/
		
		final int DIV = 60;
		
		int processTime = 145;
		int minutes = 0;
		int seconds = 0;
		
		int minutes2 = 0;
		int seconds2 = 0;
	
		
		minutes = processTime / DIV;
		System.out.println(minutes);
		
		seconds = processTime % DIV;
		System.out.println(seconds);
		
		System.out.println(processTime + "초는 " + minutes + "분 " + seconds + "초 입니다.");
		
		
		
		minutes2 = Math.floorDiv(processTime, 60);
		System.out.println(minutes2);
		
		seconds2 = Math.floorMod(processTime, 60);
		System.out.println(seconds2);
		
	}
}
