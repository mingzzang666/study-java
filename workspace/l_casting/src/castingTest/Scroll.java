package castingTest;

public class Scroll extends Item {
	 public Scroll() {;}
	 
		public Scroll(String name, int price) {
			super(name, price);
		}
	 
	 void castScroll() {
		 System.out.println("마법을 시전합니다!");
	 }

}
