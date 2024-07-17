package day4.exam;

import javax.swing.plaf.ProgressBarUI;

public class ArithmaticProblem4 {

	public static int getSum(int korScore, int engScore, int mathScore, int progScore) {
		return korScore + engScore + mathScore + progScore;
	}
	
	public static double getAverage(int sum, int subjectCount) {
		return (double)sum / subjectCount; //명시적 형변환 필요.
		
	}
	
	public static String getGrade(double average) {
		String grade = "";
		
		if (average >= 95) {
			grade = "A+";
		} else if (average >= 90) {
			grade = "b";
		}  else if (average >= 85) {
			grade = "c";
		}  else if (average >= 80) {
			grade = "d";
		}  else if (average >= 75) {
			grade = "e";
		} else if (average >= 70) {
			grade = "f";
		}
		return grade;
	}
	
	public static void main(String[] args) {
		
		int korScore = 90;
		int engScore = 88;
		int mathScore = 70;
		int progScore = 80;
		
		int sum = getSum(korScore, engScore, mathScore, progScore);
		double average = getAverage(sum, 4);  //getAverage(sum,4)가 double형이므로 형변환 필요함.원래는 int average였음.
		String grade = getGrade(average);

		
	}

}
