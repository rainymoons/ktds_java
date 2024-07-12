package day2;

public class TypeCasting {
	
	public static void main(String[] args) {

		String numberString = "10";
		byte byteNumber  = Byte.parseByte(numberString);
		System.out.println(byteNumber);
			
		numberString = "10000";
		short shortNumber = Short.parseShort(numberString);
		System.out.println(shortNumber);
		
		numberString = "1000000";
		int intNumber = Integer.parseInt(numberString);
		System.out.println(intNumber);
		
		
		
		//String charString = "A"; //정수형이 아닌 문자열을 반환하려 할 경우 error. NumberFormatException.
		//int intString = Integer.parseInt(charString);
		//System.out.println(intString);
		
		String numberString1 = "10.5"; // 부동소수점을 정수형으로 변환하려고 하여도 error. NumberFormatException.
		int intString1 = Integer.parseInt(numberString1);
		System.out.println(intString1);
		
	}


}
