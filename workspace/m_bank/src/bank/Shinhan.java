package bank;

public class Shinhan extends Bank {
	public Shinhan() {;}
	
	public Shinhan(int money) {
		super();
	}
	
	@Override
	public void deposit(int money) {
		money /= 2;
		super.deposit(money);
	}


}
