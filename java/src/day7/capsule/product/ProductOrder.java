package day7.capsule.product;

public class ProductOrder {
	
	Product bakkas;
	Product monster;
	Product hotSix;
	Product milkis;

	public ProductOrder(Product bakkas, Product monster, Product hotSix, Product milkis) {
		this.bakkas = bakkas;
		this.monster = monster;
		this.hotSix = hotSix;
		this.milkis = milkis;
	}
	
	public Product getBakkas() {
		return bakkas;
	}
	
	public Product getMonster() {
		return monster;
	}
	
	public Product getHotsix() {
		return hotSix;
	}
	
	public Product getMilkis() {
		return milkis;
	}
	
	//주문하기
	public Product orderProduct(String productName, int quantity) {
		if(this.bakkas.getProductName().equals(productName)) {
			if (this.bakkas.getProductQuantity() >= quantity) {
				Product product = new Product();
				return new Product("박카스", this.bakkas.getProductQuantity(), this.bakkas.getProductPrice()*quantity);
			} else if (this.bakkas.getProductQuantity() < 0) {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}	 						
		
				 						
		}
		return null ;
	}
	
	// 입고하기
	public void stockManage(String productName, int quantity) {
		
		if(this.bakkas.getProductName().equals(productName)) {
			this.bakkas.getProductQuantity() = this.bakkas.productQuantity + quantity;
		}
		if(this.monster.productName.equals(productName)) {
			this.monster.productQuantity = this.monster.productQuantity + quantity;
		}
		if(this.hotSix.productName.equals(productName)) {
			this.hotSix.productQuantity = this.hotSix.productQuantity + quantity;
		}
		if(this.milkis.productName.equals(productName)) {
			this.milkis.productQuantity = this.milkis.productQuantity + quantity;
		}
	}
}