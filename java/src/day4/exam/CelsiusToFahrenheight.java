package day4.exam;

public class CelsiusToFahrenheight {
	
	
	public static int celsiusToFahren(int CELSIUS) {
		return CELSIUS * (9/5) + 32;
	}
	
	public static void main(String[] args) {
		final int CELSIUS = 30;
		
		int fahrenheight = celsiusToFahren(CELSIUS);
		
		System.out.println(CELSIUS + "도는 " + "화씨 " + fahrenheight + "도 입니다.");
	}

}
