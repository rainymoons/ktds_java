package day9.array;

public class Zoo {

	public static void main(String[] args) {
		
		Animal[] animalArray = new Animal[3];
		
		animalArray[0] = new Animal("고양이", "나비");
		animalArray[1] = new Animal("강아지", "초코");

		animalArray[0].printMyInformation();
		animalArray[1].printMyInformation();
		System.out.println(animalArray[2]);
		animalArray[2].printMyInformation(); // 초기화는 했지만 초기값 입력이 되지 않아서 null.
		
		

	}
}
