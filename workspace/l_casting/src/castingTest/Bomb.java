package castingTest;

public class Bomb extends Item {

	public Bomb() {;}

	public Bomb(String name, int price) {
		super(name, price);
	}
	void explode() {
		System.out.println("폭탄이 폭발합니다!");
	}
}
