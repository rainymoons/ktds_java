package day4.exam;

public class familyTrip {
//한 사람 한사람의 여행 비용을 계산해서 더한 후 갈 수 있는가 없는가 판단.
//count에 너무 매몰 되어서, 나이 -> 요금 -> 합산. 이 구조를 파악하지 못했음.
//증감연산자를 못쓴다는 것도 배웠다. 안됨. count에 값을 담을수가 없음.
	
	
	public static int getOneWayFlightFare(int age) { //누구의 나이인지는 중요하지 않는다.
		final int ADULT_AGE = 19;
		
		final int ADULT_ONE_WAY_FLIGHT_FARE = 300_000;
		final int KID_ONE_WAY_FLIGHT_FARE = 120_000;
		
		if (age >= ADULT_AGE) { //비행요금과 관련된 정보는 밑에 있고 여기서 알고 싶은건 나이임. 정보는 밑에서 끌어서 쓰지 못함. 그래서 변수를 위로 올림.
			return ADULT_ONE_WAY_FLIGHT_FARE; // return이 없다고 하더라도 if가 끝나면 자연스럽게 종료.
		} else {
			return KID_ONE_WAY_FLIGHT_FARE; // 결과가 false이면 자연스럽게 이 조건을 충족하고 if는 종료됨.
		}
		
		// System.out.println(); -> 이 코드는 반드시 에러. 근데 else if(age < ADULT_AGE) 로 하면 에러가 안남. 둘다 아닐 수가 없거든.
		// 왜? IF와 ELSE IF가 둘다 아니면 SOUT 실행. 그러면 메서드 자체가 오류남. 뭔가가 할게 있다고 판단하여 오류가 나는 것. 
		
	}
	
	public static void main(String[] args) {
		
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daughter = 12;
		int adult = 19;
		
		int flightFare = 0;
		flightFare += getOneWayFlightFare(father);
		flightFare += getOneWayFlightFare(mother);
		flightFare += getOneWayFlightFare(daughter); // 위에 다 들어감.
		
		System.out.println(flightFare);
		
		if (flightFare <= money) {
			System.out.println("여행 가자");
		} else {
			System.out.println("다음에 가자");
		}


		
		
		
	}
}
