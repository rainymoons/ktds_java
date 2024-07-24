package day10.extendsexam;

public class ContactMain {

	public static void main(String[] args) {
		
		Contact[] contactArray = new Contact[5];
		contactArray[0] = new Contact("민창", "010-1234-1234");
		contactArray[1] = new Contact("mj", "010-4312-1234");
		contactArray[2] = new Contact("SpideMan", "010-2321-1684");
		contactArray[3] = new Contact("Octopus", "010-9843-5553");
		contactArray[4] = new EmailContact("김","010-2131-1241", "kim@korea.com"); // is a 관계 이용 but 한계점 존재. 
		
		for (int i = 0; i < contactArray.length; i++) {
			contactArray[i].printContact();
			contactArray[i].phoneCall();
//			contactArray[i].sendEmail(); -> 안된다. 왜? 배열은 contact타입. contact에는 sendEmail이 없음. 들어있는 인스턴스가 email이라고 할지라도 인스턴스 안에 email 항목이 존재하지 않아 에러 발생.
			// 방법 -> [i]가 emailContact의 인스턴스냐? -> instanceof 로 검사 -> 아니라고 할 경우 형변환
			if(contactArray[i] instanceof EmailContact) {
				// 에러나는 이유 = EmailContact is a Contact (correct)
				// Contact is not a EmailContact (false) 
				// -> is a 관계가 역전되어 있음. 이럴 경우 명시적 형변환을 사용한다.
				//EmailContact emailContactInstance = contactArray[i];
				EmailContact emailContactInstance = (EmailContact) contactArray[i];
				emailContactInstance.sendEmail();
			}
		
		}
		
		
//		이러한 contact들이 굉장히 많다고 할 때
//		Contact minchang = new Contact("민창", "010-1234-1234");
//		minchang.printContact();
//		
//		Contact mj = new Contact("mj", "010-4312-1234");
//		mj.printContact();
		
		// 하 여기서 email까지 출력하고 싶은데? -> 메서드 오버라이딩
		// 메서드 오버라이딩 -> 상위 클래스에서 만든 기능을 하위 클래스에서 덮어 쓰는것(사용하는 것) 
//		EmailContact kim = new EmailContact("kim","010-2344-4827","kim@gmail.com"); -> is a 관계를 이용해서 이제 굳이 이렇게 안써도 됨.
//		kim.printContact(); // EmailContact 클래스에서 정의하지 않았음에도 사용할 수 있다.
		
		
		
		
		
		
		
		
		
		
	}
	
}
