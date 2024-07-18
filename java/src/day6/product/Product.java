package day6.product;

public class Product {

	/**
	 * 상품명
	 */
	String productName;
	/**
	 * 상품 수량
	 */
	int productQuantity;
	/**
	 * 상품 가격
	 */
	int productPrice;
	
	
	public Product(String productName, int orderQuantity, int productPrice) {
		
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = orderQuantity;
	}
}
