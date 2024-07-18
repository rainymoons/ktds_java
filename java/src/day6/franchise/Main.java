package day6.franchise;

public class Main {
	
	public static void main(String[] args) {
		
		 Coffee ice = new Coffee("아이스 아메리카노", 2500);
		 Coffee hot = new Coffee("따뜻한 아메리카노", 2000);
		 
		 CoffeeShop cs = new CoffeeShop(ice, hot);
		 
		 int price = cs.orderCoffee("아이스 아메리카노", 5);
		 System.out.println(price);
		 
		 Coffee iceLatte = new Coffee("아이스 라떼", 2500);
		 Coffee hotLatte = new Coffee("따뜻한 라떼", 2000);
		 
		 CoffeeShop megaCoffee = new CoffeeShop(iceLatte, hotLatte);
		 
		 int megaPrice = megaCoffee.orderCoffee("따뜻한 라떼", 5);
		 System.out.println(megaPrice);
	}

}
