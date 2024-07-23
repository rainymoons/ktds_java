package day9.student;

public class ClassRoom {

	Student[] students;
	
	public ClassRoom(int count) {
		this.students = new Student[count];
		
	}
	
	public void addStudent(int count, Student student) {
		students[count] = student;
	}
	
	public int getSumAllScores() {
		int sum = 0;
		for (int i = 0; i < students.length; i++) {
			sum += this.students[i].getSumAllScores();
		}
		return sum;
	}
	
	public double getAverage() {
		double average = getSumAllScores() / 4.0 / this.students.length;;
		return average;
	}
	
	public double getCourseCredit() {
		double courseCredit = ((getAverage() - 55) / 10 * 100) / 100.0 ;
		return courseCredit;
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
