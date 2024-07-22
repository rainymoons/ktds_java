package day7.assignT;

public class MarketPlace {

	public static void main(String[] args) {
		
		Seller shoeMarker = new Seller(100, 150000, 1000);
		Buyer me = new Buyer(1_000_000);
		
		int orderCount = 2;
		if (orderCount * shoeMarker.PRICE >= me.getMoney()) {
			int orderQuantity = shoeMarker.sell(orderCount); //sell -> 판매자가 판매할 수 있는 수량
		
			me.buy(orderQuantity, orderCount * shoeMarker.PRICE);
		
		}
	shoeMarker.printSellerInfo();
	me.printBuyerInfo();
	}
	
}
