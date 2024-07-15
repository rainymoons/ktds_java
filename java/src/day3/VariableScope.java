package day3;

public class VariableScope {
	
	public static void main(String[] args) {
		
		int number = 10;
		int other = 5;
		
		//number의 수와 other의 수 중 큰 숫자는 무엇인가?
		if (number > other) {
			System.out.println(number + "과 " + other + " 중 큰 숫자는 " + number + "입니다.");
		} else {
			System.out.println(number + "과 " + other + " 중 큰 숫자는 " + other + "입니다.");
		}
		//if문 밖에서 결과를 출력하고 싶다면? 더 큰 숫자를 변수에 안에 넣어 두고 밖에서 꺼내 쓰면 된다.
	}
}
