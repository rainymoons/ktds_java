package day10.extendsexam;

public class Contact {

	private String name;
	private String phone;
	/**
	 * 사용자의 요청으로 이메일 추가.
	 */
//	private String email;
	/**
	 * 사용자의 요청으로 주소 추가.
	 */
	private String address;
	
	public Contact(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	
	// 이메일 추가 오류 해결 -> 생성자 오버라이딩. 에러는 해결 되었지만, 이메일 항목을 반영해줘야 함. 주소도 추가됬네? -> 생성자 무한 오버로딩 
	// 이걸 쉽게 하는게 상속!
//	public Contact(String name, String phone, String address) {
//		this.name = name;
//		this.phone = phone;
//		this.address = address;
//	} -> 이걸 상속의 대상으로 가져온다. address를 Email.로 바꿔서
	
//	public Contact(String name, String phone, String email, String address) {
//		this.name = name;
//		this.phone = phone;
//		this.email = email;
//		this.address = address;
//	}
	
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
//	public String getEmail() { -> emailContact 상속해주고 왔는데 에러가 난다.
//		return email;
//	}
	
	public void printContact() {
		// 이 클래스가 가지고 있는 변수들만 출력 (이메일은 지웠음)
		System.out.println("이름:" + this.name + ", 연락처: " + this.phone + ", 주소 : " + this.address);
	}
	
	public void phoneCall() {
		System.out.println("이름 : " + this.name + "에게 전화를 겁니다.");
	}
}
