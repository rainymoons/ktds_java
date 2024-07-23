package day8.string;

/**
 * String 참고문서
 */
public class StringExam {
	
	
	/**
	 * 파라미터에서 파일의 이름만 추출해서 변환
	 * @param filePath
	 */
	public static String extractFileName(String filePath) {
		// 추출 기준 - 마지막으로 나타나는 \\ 뒷부분 -> 그러면 마지막 백슬래시 앞을 다 짤라라
		
		return filePath.substring(filePath.lastIndexOf("\\") + 1); // -> 백슬래시의 위치를 정해준다. 그 위치 뒤부터 짤라 올것임. 근데 우리는 \는 필요 없음. 그래서 +1 해준다.
	}
	
	
	// substring 2번 사용처
	// 파일의 경로에서 파일명만 추출하고 싶을때
	// 한개의 메소드를 통해서 여러 파일의 이름들을 추출하고 싶다.
	public static void printSubStringExtractFileNameResult() {
		//				   01  23456789012  345678  9012345678  -> 0넘어가면 10임.
		String filePath = "C:\\dev_program\\images\\pen.png";
		String fileName = extractFileName(filePath);
		System.out.println(fileName);
		
		filePath = "C:\\dev_program\\uploadedImages\\mouse.png";
		fileName = extractFileName(filePath);
		System.out.println(fileName);
		
		filePath = "C:\\programs\\mouse.png";
		fileName = extractFileName(filePath);
		System.out.println(fileName);
		
	}
	
	// substring 1번 사용처
	// 원하는 위치에서 원하는 위치까지 잘라서 그 사이의 값을 뽑아오는 것. -> 날짜 핸들링 -> 생년월일 -> 출생년도, 출생월, 출생일 등등 가져오는 것.
	// 예약 일시 - 몇월 몇일 몇시 몇분. 몇초 등 원하는 데이터를 뽑아올 때 사용하는 것. 
	// 이거는 인덱스를 보내는 것.
	public static void printSubStringDateTimeResult() {
		
//                         0123456789012345678
		String datetime = "2023-05-02 14:56:13";
		
		// datetime에서 연도만 추출 0-4 주면 0에서 4-1까지 잘라옴
		String year = datetime.substring(0,4); // 2023
		System.out.println(year + "년");
		
		// datetime에서 월 만 추출
		String month = datetime.substring(5,7); // 
		System.out.println(month + "월");
		
		// datetime에서 일 만 추출
		String day = datetime.substring(8, 10); // 
		System.out.println(day + "일");
		
		// datetime에서 시 만 추출 
		String hour = datetime.substring(11, 13);
		System.out.println(hour + "시");
		
		// datetime에서 분 만 추출 
		String minutes = datetime.substring(14, 16);
		System.out.println(minutes + "분");
		
		// datetime에서 초 만 추출 
		String seconds = datetime.substring(17); // 17번 부터 끝까지
		System.out.println(seconds +"초");
	}
	
	
	
	// 확장자를 검색할때 많이 쓰인다. .JPEG, .png, JPG, .gif
	public static void endsWithResult() {
		
		String fileName = "pencil.gif";
		
		// fileName이 .gif로 끝나는가?
		boolean isGifFile = fileName.endsWith(".gif");
		System.out.println(isGifFile); //true
		
		isGifFile = fileName.endsWith(".GIF");
		System.out.println(isGifFile); //false
	
		// 근데 그림 파일은 대소문자 지들 마음대로 쓴다. 그럼 올바른 검사 방법은?
		
		isGifFile = fileName.endsWith(".gif") || fileName.endsWith(".GIF");
		System.out.println(isGifFile); //true
		
		// fileName의 값을 대(소)문자로 변경 후 .GIF 혹은 .gif로 검사  -> 한번에 검사하는 것
		isGifFile = fileName.toLowerCase().endsWith(".gif");
		System.out.println(isGifFile); //true
	}
	
	
	
	// 날짜와 시간을 핸들링할때 가끔 쓰인다.
	public static void printSplitResult() {
		String phoneNumber = "+82-10-1234-5678";
		
		/**
		 * +82 : 국가 번호
		 * 0 : 지금 망을 벗어나서
		 * 10 : 이동통신망으로 들어가라
		 * 1234 : 개통시 기지국 번호
		 * 5678 : 개인 번호
		 */
		
		// "-" 문자를 기준으로 자른다.
		String[] splittedPhoneNumber = phoneNumber.split("-");
		System.out.println(splittedPhoneNumber[0]);
		System.out.println(splittedPhoneNumber[1]);
		System.out.println(splittedPhoneNumber[2]);
		System.out.println(splittedPhoneNumber[3]);
	}
	
	
	public static void printReplaceAllResult() {
		String phoneNumber = "010-1234-1234";
		
		//phoneNumber에서 모든 것들을 제거해라.
		//01012341234
		/**
		 * [^0-9] : 숫자가 아닌 글자
		 * ^ 이 그룹 지정자 내부에 있을떄 !(NOT)의 역할을 한다.
		 */
		String dirtyPhoneNumber = phoneNumber.replaceAll("[^0-9]", ""); // 0-9이외의 것은 다 지워라.
		System.out.println(dirtyPhoneNumber);
			
	}
	
	
	public static void printReplaceResult() {
		String title = "<script>alert('alert! 내가 해킹할거야!');</script>"; // 이 해킹 로직을 막으려면? -> < > 등 이런 부등호들을 없애버리면 됨.
		
		//< , > 를 title에서 제거 -> sanitizing 한다!
		String dirtyTitle = title.replace("<", ""); // < 이걸 지워라.
		dirtyTitle = dirtyTitle.replace(">", "");
		System.out.println(dirtyTitle);
	}
	
	
	public static void printAlphabetFormatResult() {
		String cardName = "PARK KI MOON";
		String cardName1 = "Park Ki Moon"; // "^[A-Za-z ]+$"
		
		//영문자 중 영 대문자로만 구성이 되어 있는가?
		boolean isAlphabet = cardName.matches("^[A-Z ]+$"); // [A-Z]이렇게 물어보려면 띄어쓰기가 있으면 안됨. 따라서 A-Z 뒤에 한칸 띄움
		System.out.println(isAlphabet);
	
	}
	
	public static void printIsHangulFormatResult() {
		//한글로 이루어져 있는지 검사
		String age = "마흔"; // 나이를 한글로 적어야 함. 숫자로 적으면 안됨.
		String age2 = "40";
		// 한글은 ㄱ~ㅎ
		//       ㅏ~ㅣ
		// 받침은 ㄱ~ㅎ 로 끝남.
		// 모든 한글 처리 가능
		boolean isHangul = age.matches("^[가-힣]+$");
		System.out.println(isHangul);
		
		if (isHangul) {
			System.out.println("한글 나이는 " + age + "입니다.");
		} else {
			System.out.println(age + "는 한글 형태가 아닙니다.");
		}
		
	}
	
	public static void printIsNumberForamtResult() {
		// 웹 페이지에서 어떤 데이터를 읽어 들이는 중. 나이를 입력해라 라고 시킨 것. 숫자-> 서버는 문자로 처리하게 됨 -> 이걸 숫자로 다시 처리하고 싶음
		String age = "40";
		String age1 = "마흔";
		
		/**
		 * 정규 표현식에서 캐럿의 의미
		 * ^[0-9]+$ : 숫자로 시작해서 숫자로 끝나는 형태. => 문자가 숫자로만 이루어져 있는가? 를 물어보는 것.
		 * 
		 * ^ : ~으로 시작한다.
		 * [ ] : Group 지정자. 내부에 지정된 문자 중 한 글자.
		 * [0-9] : 숫자 그룹 지정자. 0부터 9까지의 모든 숫자 중 한 글자. (숫자 한개)
		 * + : 앞에 지정된 문자 혹은 그룹이 한 글자 이상 반복된다.
		 * [0-9]+ : 숫자가 하나 이상 반복된다.
		 * $ : ~으로 끝난다.
		 * 
		 */
		
		// age 문자열을 숫자로 변경해보자
		// int를 class로 바꿔놓는게 필요함.
//		int numAge = Integer.parseInt(age);
//		System.out.println(numAge);
//		System.out.println(numAge * 2);
		//int numAge1 = Integer.parseInt(age1);
		//System.out.println(numAge1);
		//Exception in thread "main" java.lang.NumberFormatException: For input string: "마흔" -> "마흔"은 숫자가 아니기 때문에 int로 바꿀 수 없다.
		//에러가 나니까 숫자인지 판단해보고 아니면 바꾸지말자 -> "matches"
		
		//age에 할당된 값이 숫자로만 구성이 되어있는지 검증하자 파라미터가  str regex -> regex는 정규표현식을 의미.
		boolean isNumber = age1.matches("^[0-9]+$");
		System.out.println(isNumber);
		
		if(isNumber) {
			int numAge = Integer.parseInt(age1);
			System.out.println(numAge);
			System.out.println(numAge*2);
		} else {
			System.out.println(age1 + "는 숫자형태가 아닙니다.");
		}

	}
	
	
	public static void printLastIndexOfResult() { // 찾고싶은 문자열이 마지막의 몇번째에 있냐
		/**
		 * \(back slash) : escape code(탈출문자)
		 * 
		 * \\ : 원 표시(통화기호)
		 * \" : 쌍 따옴표
		 * \' : 홑 따옴표
		 * \r : 개행 후 커서를 가장 앞으로 이동
		 * \n : 줄 개행
		 * \t : Tab
		 */
		
		//"안녕하세요, 제 이름은 "박기문"입니다."
		String hello = "안녕하세요, 제 이름은 \"박기문\"입니다."; // \를 넣지 않으면 박기문을 변수로 인식함.
		System.out.println(hello);
		
		//				   01 234567890123 4567890 12345678 -> 우리가 찾는것 21 첫 \는 세지 않는다.
		String filePath = "C:\\dev_program\\images\\pen.png";
		
		// 원하는 것. filePath에서 pen.png가 시작되는 위치를 알고 싶다.
		// indexOf(\\) 하면 가장 앞에것 찾아옴. \\뒤에서 부터 찾아야 pen.png를 찾을 수 있다. 경로가 바뀌어도.
		int lastIndexOfBackSlash = filePath.lastIndexOf("\\");
		System.out.println(lastIndexOfBackSlash); //21     // 없는 글자 찾으면 -1 반환
		
	}
	
	
	
	// 배열
	public static void printJoinResult() {
		// " " 부분들이 char sequence로 전달됨. 무한대로 사용 가능.
		String phone = String.join("-", "010", "1234", "1234");
		System.out.println(phone);
	}
	
	
	//문자열이 비어있다 비어있지 않다 ->검증
	
	/**
	 * String instance.trim()
	 * (결과예시) 
	 * 		String abc = "  abc   ";
	 * 		abc.length(); ==> 총 길이가 나옴. 8
	 * 		abc.trim(); ==> "a b c"; 앞뒤 공백 제거
	 * 		abc.trim().length(); ==> 5
	 * 		
	 * 		String abc = "     ";
	 * 		abc.length(); => 5
	 * 		abc.trim(); ==> ""; 이렇게 됨
	 * 		abc.trim().length(); ==> 0
	 * 왜 굳이 이런식으로 하냐? 에러에 안전해서 그렇다.
	 */
	
	// str2 == null || 이거 지우고 실행하면 결과값이 다르다. NullPointerException 그래서 null 체크를 해줘야 함.
	// java11 이상에서는 == null || str.isBlank()를 쓰면 된다.
	public static void printIsNullOrEmptyResult() {
		String str = "";
		boolean isEmpty = str == null || str.trim().length() == 0; // 이면 비어있는것이다.
		System.out.println(isEmpty); //true
		
		String str2 = "   ";
		isEmpty = str2 == null || str2.trim().length() == 0;
		System.out.println(isEmpty); // true
		
		String str3 = "   aa aaa   ";
		isEmpty = str3 == null || str3.trim().length() == 0;
		System.out.println(isEmpty); // false
		
		String str4 = "   aa aaa   ";
		isEmpty = str4 == null || str4.trim().length() == 0;
		System.out.println(isEmpty); // false
	}
	
	
	public static void printIsEmptyResult() {
		String str = "    ";//4
		boolean isEmpty = str.isEmpty();
		System.out.println(isEmpty); //false
	
		String str2 = ""; // 0
		isEmpty = str2.isEmpty();
		System.out.println(isEmpty); //true
		
		String str3 = "a"; // 1
		isEmpty = str3.isEmpty();
		System.out.println(isEmpty); //false
		
	}
	
	
	public static void printIsBlankResultOnJava11() {
		String str = "    ";
		boolean isBlank = str.isBlank();
		System.out.println(isBlank);
	
		String str2 = "";
		isBlank = str2.isBlank();
		System.out.println(isBlank);
		
		String str3 = "a";
		isBlank = str3.isBlank();
		System.out.println(isBlank);

	}
	
	public static void printIndexOfResult() {
		
		String fileName = "score.xlsx";
		int dotIndex = fileName.indexOf(',');
		System.out.println(dotIndex);
		
		int smallXIndex = fileName.indexOf("x");
		System.out.println(smallXIndex);
		
		int bigXIndex = fileName.indexOf("X");
		System.out.println(bigXIndex);
		
		int extentionNameIndex = fileName.indexOf(".xlsx");
		System.out.println(extentionNameIndex);
		
	}
	
	public static void printFormatResult() {
		/*
		 * %s : String 할당
		 * %d : Decimal 할당 (정수형)
		 * %f : floating point number 할당
		 * %.2f : 부동소수점들을 소수점 이하 두 자리만 표현
		 * %.4f : 부동소수점들을 소수점 이하 두 자리만 표현
		 */
		String format = "%s 에서 교육하는 %s %d 교육입니다.";
		
		String formatedString = String.format(format, "ktds University", "Java", 22);
		
		System.out.println(formatedString);
		
	}
	
	public static void printstartWithResult() {
		String address= "https://edu.ktdsuniversity.com";
		boolean isSecureProtocol = address.startsWith("https://");
		System.out.println(isSecureProtocol);
		boolean isNonSecureProtocol = address.startsWith("http://");
		System.out.println(isNonSecureProtocol);
	}
	
	public static void printContainsResult() {
		String address = "서울특별시 서초구 효령로 176";
		boolean isSeocho = address.contains("서초");
		System.out.println(isSeocho);
		
		boolean isGangNam = address.contains("강남");
		System.out.println(isGangNam);
	}
	
	public static void main(String[] args) {
		printSubStringDateTimeResult();
		endsWithResult();
		printSplitResult();
//		printReplaceAllResult();
//		printReplaceResult();
//		printAlphabetFormatResult();
//		printIsHangulFormatResult();
//		printIsNumberForamtResult();
//		printLastIndexOfResult();
//		printJoinResult();
//		printIsNullOrEmptyResult();
//		printIndexOfResult();
//		printIsEmptyResult();
	}

}
