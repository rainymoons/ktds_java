package day10.extendsexam.ex;

public class BatMobile extends SportsCar{

	public BatMobile(String modelName) {
		super(modelName);
	}
	
	public void disUniteBatport() {
		String modelName = super.getModelName();
		System.out.println(modelName+ "에서 배트포트가 분리 되었습니다.");
		
	}
}
