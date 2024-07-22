package com.naver.member.management;

public class Member {

	private String id;
	private String name;
	
	public String getId() { // 레퍼런스타입이면 참조값의 주소가 같지 않냐? Getter의 역할은 참조값을 분리시켜 전송해주는 것. -> 레퍼런스의 역참조.
		// 메모리 분리 코드.
		// String은 불변 타입 ==> 메모리 분리 필요 없음.
		return this.id;
	}

	public String getName() {
		return this.name;
	}
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
}
