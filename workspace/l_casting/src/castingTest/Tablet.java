package castingTest;

public class Tablet extends Device {
	public Tablet() {;}
	
	public Tablet(String brand, int price) {
		super(brand, price);
	}
	
	void draw() {
		System.out.println("그리기 기능");
	}

}
