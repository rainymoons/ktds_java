package com.ktdsuniversity.edu.string;

public class StringExam {

	
	
	public static void printIndexOfResult() {
		String fileName = "score.xlsx"; // 문자들은 각각의 고유한 자리수가 있다. 0 1 2 3 4 5 .... 하나씩 증가함. -> 글자 자를때 써먹음.
		int dotIndexOf = fileName.indexOf('.'); //5
		System.out.println(dotIndexOf);
		
		int smallXIndex = fileName.indexOf("x"); //6
		System.out.println(smallXIndex);
		
		int bigXIndex = fileName.indexOf("X"); // -1
		System.out.println(bigXIndex);
	
		//여러글자 동시에 검색 가능 - 정확하게 .XLSX로 시작하는 위치가 어디냐?
		int extentionNameIndex = fileName.indexOf(".xlsx");  // 5
		System.out.println(extentionNameIndex);
	
	}
	
	/**
	 * %S - string 할당
	 * %D - decimal 할당
	 * %f - floating point number할당(부동소수점)
	 * %.2f : 부동소수점들을 소수점 이하 두 자리만 표현
	 * %.4f : 부동소수점들을 소수점 이하 네 자리만 표현
	 */
	public static void printFormatResult() {
		String format = "%s 에서 교육하는 %s %d 교육입니다."; // %S - string 할당, %D - decimal 할당 , %f - floating point number할당(부동소수점)
		String formattedString = String.format(format, "ktds university", "java", 22);
		System.out.println(formattedString);
	}
	
	public static void printContaintResult() {
		String address = "서울특별시 서초구 효령로 176";
		boolean isSeocho = address.contains("서초");
		System.out.println(isSeocho);
		boolean isGangNam = address.contains("강남");
		address.contains("강남");
	}
	
	public static void printStartWithResult() {
		String address = "hhtps://edu.ktdsuniversity.com";
		boolean isSecureProtocol = address.startsWith("https://");
		System.out.println(isSecureProtocol);
		
		boolean isNonSecureProtocol = address.startsWith("http://");
		System.out.println(isNonSecureProtocol);
	}
	
	public static void main(String[] args) {
		printFormatResult();
		printContaintResult();
		printStartWithResult();
		printIndexOfResult();
	}
	
}
