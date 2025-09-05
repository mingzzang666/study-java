package castingTest;

public class Laptop extends Device {

	public Laptop() {;}
	
	public Laptop(String brand, int price) {
		super(brand, price);
	}
	
	void coding() {
		System.out.println("코딩 기능");
	}
}
