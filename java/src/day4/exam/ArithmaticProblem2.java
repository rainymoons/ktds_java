package day4.exam;

public class ArithmaticProblem2 {

	public static int getMinutes(int seconds) {
		final int MINUTES = 60;
		return seconds / MINUTES;
	}
	
	public static int getRemainSeconds(int seconds) {
		final int MINUTES = 60;
		return seconds % MINUTES;
	}
	
	public static void main(String[] args) {
		
		int processTime = 145;
		
		int minutes = getMinutes(processTime);
		int seconds = getRemainSeconds(minutes);
		
		System.out.println(processTime + " " + minutes + " " + seconds);
	}

}
