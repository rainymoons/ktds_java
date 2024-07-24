package day10.extendsexam.ex;

public class Vehicle {
	
	private String modelName;
	
	public Vehicle(String modelName) {
		this.modelName = modelName;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public void startEngine() {
		System.out.println(this.modelName + "을(를) 시동을 겁니다.");
	}
	
	public void endEngine() {
		System.out.println(this.modelName + "의 시동을 끕니다.");
	}
	
}
