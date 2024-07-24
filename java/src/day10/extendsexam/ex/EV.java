package day10.extendsexam.ex;

public class EV extends Vehicle {
	
	public EV(String modelName, double battery) {
		super(modelName);
	}

	private double battery;
	
	public EV(String modelName, String BatteryLevel) {
		super(modelName);
		this.battery = battery;
	}
	
	public double getBattery() {
		return battery;
	}
	
	public void checkBattery() {
		String modelName = super.getModelName();
		System.out.println("자동차 모델명: " + modelName);
		
		
		System.out.println("배터리 잔량" + this.battery);
		
		
		if(this.battery > 50) {
			System.out.println("배터리 용량이 충분합니다.");
		} else {
			System.out.println("충전이 필요합니다.");
		}
	}

	
}
