package day10.extendsexam.ex;

public class RacingTrack {

	public static void startEngine(Vehicle vehicle) { 
		vehicle.startEngine();
	}
	
	public static void startTurboEngine(SportsCar vehicle) { 
		vehicle.startTurboEngine(); // 터보엔진은 스포츠카부터 있으므로. 비히클엔 없음.
	}
	
	
	public static void main(String[] args) {
			
		// is a 관계
		// Sub class `is a` Super class 
		Vehicle kona = new Vehicle("코나");
		Vehicle teslaModelX = new EV("테슬라 모델 X", 49.7);
		Vehicle ferrari = new SportsCar("Encho Ferrari");
		Vehicle batcar = new BatMobile("BatCaR"); // 실제 변수의 타입은 배트모빌이지만, 현재는 비히클로 되어있음. 비히클에는 터보엔진과 배트포트 기능이 없음. 그래서 에러가 나는 것.

		Vehicle kona2 = new Vehicle("코나");
		EV teslaModelX2 = new EV("테슬라 모델 X", 49.7);
		SportsCar ferrari2 = new SportsCar("Encho Ferrari");
		BatMobile batcar2 = new BatMobile("BatCaR");
		
		startEngine(kona);
		startEngine(teslaModelX);
		startEngine(ferrari);
		startEngine(batcar);
		
		startEngine(kona2);
		startEngine(teslaModelX2);
		startEngine(ferrari2);
		startEngine(batcar2);
		
		startTurboEngine(batcar2);
		//startTurboEngine(batcar); -> Vehicle 타입이라 안된다.
		//startTurboEngine(ferrari);
		startTurboEngine(ferrari2);
		//startTurboEngine(teslaModelX2); -> 부모에 터보엔진 기능이 없다.
		//startTurboEngine(kona2); -> 터보엔진 기능이 없다.
		
		
	}
	
}
