package day7.capsule.product;

public class Product {

	/**
	 * 상품명
	 */
	private String productName;
	/**
	 * 상품 수량
	 */
	private int productQuantity;
	/**
	 * 상품 가격
	 */
	private int productPrice;
	
	
	public Product(String productName, int orderQuantity, int productPrice) {
		
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = orderQuantity;
	}
	
	public String getProductName() {
		return productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}
	
	public int getProductPrice() {
		return productPrice;
	}
	
	public void changeQuantity(int quantity) {

		this.productQuantity -= quantity;
	}
}
