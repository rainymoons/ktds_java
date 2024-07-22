package day7.staticclassmethod;

public class Track {

	public static void main(String[] args) {
		
		Car matiz = new Car(Car.SMALL, "마티즈"); //"경차" 대신에 클래스 상수 이용. 이거 말고는 쓰지마라. 동시성 문제(클래스 메소드)
		matiz.startEngine();
		
		Car kona = new Car(Car.MEDIUM, "코나");
		kona.startEngine();
		
		Car GenesisG90 = new Car(Car.LARGE, "제네시스 G90");
		GenesisG90.startEngine();
		
		System.out.println(StringUtils.isEmpty(""));
		System.out.println(StringUtils.isEmpty("AAA"));
		System.out.println(StringUtils.isNumber("AAA"));
		System.out.println(StringUtils.isNumber("2123"));
		System.out.println(StringUtils.parseInt("123124"));
	}
}
