package classTest;

class Product{
	String name;
	int stock;
	int price;
	int discount;
	
	public Product(String name, int price, int discount) {
		this.price = price;
		this.name = name;
		this.discount = discount;
	}
	
	int getDiscountedPrice(){
		int discountedPrice = price - (price * discount / 100);
		return discountedPrice;
	}
	
	void printInfo() {
		System.out.println("상품명: " + name + ", 할인 전: " + price + "원, 할인율: " + discount + "%");		
	}
}
public class ClassTask003 {
		public static void main(String[] args) {
			 Product coffee = new Product("아메리카노", 1700, 20);
			 
			 coffee.printInfo();
			System.out.println(coffee.getDiscountedPrice());
		}
}
