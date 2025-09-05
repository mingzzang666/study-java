package classTest;

public class Order {
	int id;
	Product[] arProduct;
	int price;

	public Order(int id, Product[] arProduct) {
		this.id = id;
		this.arProduct = arProduct;
		for (int i = 0; i < arProduct.length; i++) {
			if(arProduct[i].stock < 1) {
				continue;
			}
			this.price += arProduct[i].price;
			arProduct[i].stock--;
		}
	}
}
