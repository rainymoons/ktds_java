package day3;

public class VariableScopeLv {
	
	public static void main(String[] args) {
		
		int number = 10;
		int other = 15;
		int bigNumber = 0;
		
		//number의 수와 other의 수 중 큰 숫자는 무엇인가?
		if (number > other) {
			bigNumber = number; //if와 else의 bigNumber는 서로 다른 변수. scope가 다르기 때문.
		} else {
			bigNumber = other;
		}
		//if문 밖에서 결과를 출력하고 싶다면? 더 큰 숫자를 변수 안에 넣어 두고 밖에서 꺼내 쓰면 된다.
		System.out.println(number + "과 " + other + "중 큰 숫자는 " + bigNumber + "입니다.");

	}
}
