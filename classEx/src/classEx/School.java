package classEx;

public class School {
	
	public static void main(String[] args) {
		
		// 객체 생성(ex: Scanner, Random)
		Purifier lg = new Purifier();
		
		//100 = full
		lg.remainWater = 30;
		lg.temperature = 0; //냉수
		lg.remainIceBlock = 0;
		lg.filter = 100;
		
		System.out.println("물의 양 : " + lg.remainWater);
		System.out.println("현재 배출될 물의 온도 : " + (lg.temperature == 0 ? "냉수" : "온수"));
		System.out.println("얼음 개수 : " + lg.remainIceBlock);
		System.out.println("필터 상태 : " + lg.filter);
	
		lg.chooseTemperature(); // 냉수 -> / 온수 -> 냉수
		lg.makeIce(); // 얼음 생성.
		lg.makeIce(); // 얼음 생성.
		
		lg.waterExhaust(); // 물 배출.
		lg.waterExhaust(); // 물 배출.
		lg.waterExhaust(); // 물 배출.

		lg.fillWater(); // 물을 보충.
		
		System.out.println("물의 양 : " + lg.remainWater);
		System.out.println("현재 배출될 물의 온도 : " + (lg.temperature == 0 ? "냉수" : "온수"));
		System.out.println("얼음 개수 : " + lg.remainIceBlock);
		System.out.println("필터 상태 : " + lg.filter);
	
		
	}
}
