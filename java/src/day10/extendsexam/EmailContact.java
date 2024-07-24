package day10.extendsexam;
/**
 * ===== 상속의 시작 =====
 * 이름, 전화번호를 가지고 있는 연락처(Contact)라는 클래스를 확장한 클래스.
 * 이메일만 추가.
 * 
 * extends Contact 했더니 EmailContact가 에러가 난다.
 * 확장의 대상이 되는 클래스(Contact)에 생성자가 존재할 경우
 * 확장을 하는 클래스(EmailContact)에서 반드시 해당 생성자를 호출해 주어야 한다!
 * 
 * Sub class is a Super class
 * EmailContact is a Contact(이메일 컨택트는 컨택트에 할당 될 수 있다.)
 * 
 */
public class EmailContact extends Contact {

	/**
	 * 사용자의 요청으로 이메일 추가.
	 */
	private String email;
//	 this.name이 왜 에러가 나나. 호출이 안되어서. 확장이 되는 클래스의 생성자를 호출해주는 방법 -> super();
	public EmailContact(String name, String phone, String Email) {
//		super(); // super(); Contact 클래스의 기본 생성자를 호출하는 방법.
		super(name, phone); // public Contact(String name, String phone) { ... } 호출. -> 확장의 대상이 되는 원본 클래스를 호출하는 방법.
		// super = contact의 생성자를 말하는 것.
		this.email = email;
	}
	@Override
	public String getName() {
		return email;
	}
	
	public String getEmail() {
		return email;
	}
	
	// 왼쪽에 초록 세모 표시 -> 오버라이딩(overrides day10.extendsexam.Contact.printContact)
	// 오버라이딩 한것을 알려주지 않으면 자원 낭비 발생 -> annotation 필요
	@Override
	public void printContact() {
		super.printContact(); //
		System.out.println("이메일 : " + this.email); // 이메일만 출력 -> 이름이랑 연락처가 나왔으면 좋겠어 -> contact에 있는 printContact를 호출 하면 됨. -> super
	}
	
	public void sendEmail() {
		System.out.println("이름: " + super.getName() + "에게 이메일을 보냅니다."); // this.name은 안됨.
	}
}
