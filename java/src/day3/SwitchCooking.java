package day3;

public class SwitchCooking {
	
	public static void main(String[] args) {
	
		// 라면 끓이기 순서
		// 웹 어플리케이션에서는 이런 것이 쓰이지 않음.
		// 엔진 같은 코어 프로그래밍에서는 사용 가능.
		int step = 0;
		
		switch (step) {
			case 0:
				System.out.println("문을 연다.");
				System.out.println("냄비를 꺼낸다.");
				System.out.println("싱크대로 냄비를 가져간다.");	
			case 1:
				System.out.println("문을 연다.");
				System.out.println("냄비를 꺼낸다.");
				System.out.println("싱크대로 냄비를 가져간다.");	
				System.out.println("수도꼭지를 튼다.");
				System.out.println("냄비에 물을 받는다.");
				System.out.println("수도꼭지를 잠근다.");
				
			case 2:
				System.out.println("문을 연다.");
				System.out.println("냄비를 꺼낸다.");
				System.out.println("싱크대로 냄비를 가져간다.");	
				System.out.println("수도꼭지를 튼다.");
				System.out.println("냄비에 물을 받는다.");
				System.out.println("수도꼭지를 잠근다.");
				System.out.println("렌지 위에 냄비를 올린다.");
				System.out.println("가스 밸브를 연다.");
				System.out.println("불을 켠다.");
			case 3:
				System.out.println("라면을 꺼낸다.");
				System.out.println("라면 봉지를 뜯는다.");
				System.out.println("스프를 꺼낸다.");
				System.out.println("스프를 흔든다.");
				System.out.println("스프를 뜯는다.");
				System.out.println("물이 끓기를 기다린다.");
				System.out.println("스프를 넣는다.");
				System.out.println("건더기 스프를 꺼낸다.");
				System.out.println("건더기 스프를 흔든다.");
				System.out.println("건더기 스프를 뜯는다.");
				System.out.println("건더기 스프를 넣는다.");
				System.out.println("비닐봉지들을 쓰레기통에 버린다.");
				System.out.println("면을 넣는다.");
			case 4:
				System.out.println("냉장고로 가서 계란을 꺼내어 깨어 냄비에 넣는다.");
			case 5:
				System.out.println("면을 들었다놨다해준다.");
				System.out.println("익을 때 까지 반복한다.");
				System.out.println("불을 끈다.");
				System.out.println("가스 밸브를 잠근다.");
			case 6:
				System.out.println("전공책 깔고 냄비를 올리고 젓가락을 맛잇게 먹는다.");
				System.out.println("설거지를 하고 정리한다.");

		}

		
	}
}
