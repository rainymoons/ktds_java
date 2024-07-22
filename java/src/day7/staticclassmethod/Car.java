package day7.staticclassmethod;

public class Car {

	/**
	 * 클래스 상수. //클래스 변수에 final을 붙이지 않으면 동시성 문제가 발생한다.
	 */
	public static final String SMALL = "경차";
	public static final String MEDIUM = "중형차";
	public static final String LARGE = "대형차";
	
	private String carSize;
	
	private String carName;
	
	public  Car(String carSize, String carName) {
		this.carSize = carSize;
		this.carName = carName;
	}
	
	public void startEngine() {
		System.out.println(this.carName + "(" + this.carSize + ")" + "시동걸기");

	}
	
}
