package day3;

import java.util.Scanner;

public class IfElseExam1 {

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
		
	
		int sum = korScore + engScore + mathScore + progScore;
		int average = sum / 4;

		String grade = "";
		
		if (average >= 95) {
			grade = "A+";
		} else if (average >= 90) {
			grade = "A";
		} else if (average >= 85) {
			grade = "B+";
		} else if (average >= 80) {
			grade = "B";
		} else if (average >= 75) {
			grade = "c+";
		} else if (average >= 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
		System.out.println("학점 : " + grade);
	}
}
