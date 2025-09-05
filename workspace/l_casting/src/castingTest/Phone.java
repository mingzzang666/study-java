package castingTest;

public class Phone extends Device {
	public Phone() {;}
	
	public Phone(String brand, int price) {
		super(brand, price);
	}
	
	void call() {
		System.out.println("전화 기능");
	}
}
