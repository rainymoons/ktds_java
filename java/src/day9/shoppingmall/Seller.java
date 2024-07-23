package day9.shoppingmall;

public class Seller {

	Product[] products;
	
	public Seller(int orderCount) {
		this.products = new Product[orderCount];
	}
	
	public void order(Product product, int orderCount) {
		products[orderCount] = product;
	}
	
	
	public void sell(String productName, int stock) {
		for(int i = 0; i < products.length; i++) {
			if(products[i].productName.equals(productName)) {
				if(this.)
		}

		}
		
	
	}
	
}
