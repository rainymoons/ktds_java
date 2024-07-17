package ex;

public class GradeCounter {

	public static void main(String[] args) {
		
		StudentScore studentScore = new StudentScore();

		studentScore.java = 90;
		studentScore.python = 81;
		studentScore.cpp = 97;
		studentScore.csharp = 88;
		
		System.out.println("총점은 " + studentScore.getSumAllScores());
		System.out.println("평균은 " + studentScore.getAverage());
		System.out.println("평점 평균은 " + studentScore.getCourseCredit());
		System.out.println("학점은 " + studentScore.getABCDEF());
		
		
		
	}
	
	
}
