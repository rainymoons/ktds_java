package day4.exam;

public class ArithmaticProblem1 {

	public static int getTotalSeconds(int minutes, int seconds) {
		return minutes * 60 + seconds;
	}
	
	public static void main(String[] args) {
		
		int minutes = 5;
		
		int seconds = 50;
		
		int time = getTotalSeconds(minutes, seconds);
	}

}
