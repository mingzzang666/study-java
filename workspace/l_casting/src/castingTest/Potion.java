package castingTest;

public class Potion extends Item {
	
	public Potion() {;}

	public Potion(String name, int price) {
			super(name, price);
		}
	
	
	void heal() {
		System.out.println("체력을 회복합니다!");
	}

}
