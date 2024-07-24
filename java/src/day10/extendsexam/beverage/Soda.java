package day10.extendsexam.beverage;

public class Soda extends Beverage{

	public String manufacturer;
	
	public double sugarContent;
	
	public Soda(String name, String manufacturer, double sugarContent) {
		super(name);
		this.manufacturer = manufacturer;
		this.sugarContent = sugarContent;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public double getSugarContent() {
		return sugarContent;
	}
	
	public void printManufacturer() {
		System.out.println(super.getName() + " 상품의 제조사는 " + this.manufacturer + "입니다.");
	}
	
	public void printSugarContent() {
		System.out.println(super.getName() + " 상품의 당분 함량은 " + this.sugarContent + "입니다.");
	}
}
