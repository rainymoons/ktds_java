package day9.immutable;

public class Student {
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println(this.name);
	}
}
