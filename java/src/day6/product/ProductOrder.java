package day6.product;

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
	
	//주문하기
	public Product orderProduct(String productName, int quantity) {
		if(this.bakkas.productName.equals(productName)) {
			if (this.bakkas.productQuantity >= quantity) {
				this.bakkas.productQuantity = this.bakkas.productQuantity - quantity;
				return new Product("박카스", this.bakkas.productQuantity, this.bakkas.productPrice*quantity);
			} else if (this.bakkas.productQuantity < 0) {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}	 						
		} else if(this.monster.productName.equals(productName)) {
			if (this.monster.productQuantity >= quantity) {
				this.monster.productQuantity = this.monster.productQuantity - quantity;
				return new Product("몬스터", this.monster.productQuantity, this.monster.productPrice*quantity);
			} else if (this.monster.productQuantity < 0) {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}	 						
		} else if(this.hotSix.productName.equals(productName)) {
			if (this.hotSix.productQuantity >= quantity) {
				this.hotSix.productQuantity = this.hotSix.productQuantity - quantity;
				return new Product("몬스터", this.hotSix.productQuantity, this.hotSix.productPrice*quantity);
			} else if (this.hotSix.productQuantity < 0) {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}	 						
		} else if(this.milkis.productName.equals(productName)) {
			if (this.milkis.productQuantity >= quantity) {
				this.milkis.productQuantity = this.milkis.productQuantity - quantity;
				return new Product("밀키스", this.milkis.productQuantity, this.milkis.productPrice*quantity);
			} else if (this.milkis.productQuantity < 0) {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}	 						
		}
		return null ;
	}
	
	// 입고하기
	public void stockManage(String productName, int quantity) {
		
		if(this.bakkas.productName.equals(productName)) {
			this.bakkas.productQuantity = this.bakkas.productQuantity + quantity;
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