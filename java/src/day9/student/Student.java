package day9.student;

public class Student {

	private int java;

	private int python;
	
	private int cpp;
	
	private int csharp;
	
	
	public Student(int java, int python, int cpp, int csharp) {
		this.java = java;
		this.python = python;
		this.cpp = cpp;
		this.csharp = csharp;
	}
	
	public int getSumAllScores() {
		int sum = java + python + cpp + csharp;
		return sum;
	}
	
	public double getAverage() {
		double average = getSumAllScores() / 4.0 ;
		return average;
	}
	
	public double getCourseCredit() {
		double courseCredit = ((getAverage() - 55) / 10 * 100) ;
		return courseCredit / 100.0;
	}
	
	public String getABCDE() {
		double courseCredit = getCourseCredit(); 
		
		if(courseCredit >= 4.1) {
			return "A+";
		} else if(courseCredit >= 3.6) {
			return "A";
		} else if(courseCredit >= 3.1) {
			return "B+";
		} else if(courseCredit >= 2.6) {
			return "B";
		} else if(courseCredit >= 1.6) {
			return "C+";
		} else if(courseCredit >= 0.6) {
			return "C";
		} else {
			return "F";
		}
	}
	
}
