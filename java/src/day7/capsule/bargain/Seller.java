package day7.capsule.bargain;

/**
 * 판매자
 */
public class Seller {

    private int asset;
    private int goods;

    /**
     * @param asset 판매자 보유 자산
     * @param goods 판매자 보유 상품 수량
     */
    Seller(int asset, int goods) {
        this.asset = asset;
        this.goods = goods;
    }
    
    public int getAsset() {
    	return this.asset;
    }
    
    public int getGoods() {
    	return this.goods;
    }

    /**
     * @param quantity 거래가 이루어지는 수량
     * @param price 상품 가격
     */
    public void sell(int quantity, int price) {
        if (quantity > this.getGoods()) {
            quantity = this.getGoods(); // 판매자의 재고 수량이 구매자의 구매 의사 수량보다 적을 경우 구매 의사 수량을 재고 수량과 같아지게 만듦
        }
        this.goods -= quantity;
        this.asset += quantity * price;
    }

}
