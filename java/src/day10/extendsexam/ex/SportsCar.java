package day10.extendsexam.ex;

public class SportsCar extends Vehicle{
	
	public SportsCar(String modelName) {
		super(modelName);
	}
	
	public void startTurboEngine() {
		String modelName = super.getModelName();
		System.out.println(modelName + "이(가) 터보 엔진을 시작합니다.");
	}
	
	
}
