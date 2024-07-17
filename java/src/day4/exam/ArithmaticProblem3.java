package day4.exam;

public class ArithmaticProblem3 {

	public static int getCelsiusToFahrenheight(int CELSIUS) {
		return CELSIUS * (9/5) + 32;
	}
	
	public static void main(String[] args) {
		
		final int CELSIUS = 30;
		
		int fahrenheight = getCelsiusToFahrenheight(CELSIUS);
		
		System.out.println(CELSIUS + "도는 " + "화씨 " + fahrenheight + "도 입니다.");
	}

}
