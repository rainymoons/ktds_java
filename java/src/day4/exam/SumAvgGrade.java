package day4.exam;

import java.util.Scanner;

public class SumAvgGrade {
	
	public static int getScoreSum(int korScore, int engScore, int mathScore, int progScore) {
		return korScore + engScore + mathScore + progScore;
	}
	
	public static int getScoreAvg(int getScoreSum, int SUBJECT_NUM) {
		return getScoreSum / SUBJECT_NUM;
	}
	
	public static String getGrade(int getScoreAvg) {
		if (getScoreAvg >= 95) {
			return "A+";
		} else if (getScoreAvg >= 90) {
			return "A";
		} else if (getScoreAvg >= 85) {
			return "B+";
		} else if (getScoreAvg >= 80) {
			return "B";
		} else if (getScoreAvg >= 75) {
			return "C+";
		} else if (getScoreAvg >= 70) {
			return "C";
		} else {
			return "F";
		}
	}
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		int korScore = keyboard.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		int engScore = keyboard.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
		int mathScore = keyboard.nextInt();
		
		System.out.print("코딩 점수를 입력하세요 : ");
		int progScore = keyboard.nextInt();
		
		
		final int SUBJECT_NUM = 4;
		
		int totalScore = getScoreSum(korScore, engScore, mathScore, progScore);
		int average = getScoreAvg(totalScore, SUBJECT_NUM);
		String grade = getGrade(average);
		
		System.out.println("평점 합계는 " + totalScore + " 평점 평균은 " + average + " 학점은 " + grade);
	}
}
