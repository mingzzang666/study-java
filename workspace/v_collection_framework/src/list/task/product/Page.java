package list.task.product;

import list.task.DBConnecter;

public class Page {
	public static void main(String[] args) {
		ProductService productService = new ProductService();
		Product product1 = new Product(1L, "모니터", 35000, 20);
		Product product2 = new Product(2L, "키보드", 75000, 12);
		
		productService.insert(product1);
		productService.insert(product2);
		
		System.out.println(DBConnecter.products.get(0).hashCode());
		System.out.println(product1.hashCode());
		
//		System.out.println(DBConnecter.products.indexOf(product1));
		
	}
}
