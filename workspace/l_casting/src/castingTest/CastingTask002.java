package castingTest;

import java.util.Scanner;

class Item{
	public Item() {;}		
	
	String name;
	int price;
	
	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	void printInfo() {
		System.out.println("아이템 이름: " + name + " / 가격: " + price);
	}

}
public class CastingTask002 {
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Item[] inventory = new Item[5];
			
			for (int i = 0; i < inventory.length; i++) {
				System.out.println("[" + (i + 1) + "번째 아이템]");
				System.out.print("이름: ");
				String name = sc.nextLine();
				
				System.out.print("종류 (potion / scroll / bomb) : ");
				String type = sc.nextLine();
				
				System.out.print("가격: ");
				int price = sc.nextInt();
				sc.nextLine();
				
				if(type.equals("potion")) {
					inventory[i] = new Potion(name, price);
				}else if(type.equals("scroll")) {
					inventory[i] = new Scroll(name, price);
				}else if(type.equals("bomb")) {
					inventory[i] = new Bomb(name, price);
				}else {
					System.out.println("존재하지 않는 아이템입니다.");
					i--;
				}
				}
			System.out.println("\n === 아이템 정보 및 기능 실행 ===");
			
			for (int j = 0; j < inventory.length; j++) {
				Item item = inventory[j];
				item.printInfo();
				
				if(item instanceof Potion) {
					((Potion)item).heal();
				}else if(item instanceof Scroll) {
					((Scroll)item).castScroll();
				}else if(item instanceof Bomb) {
					((Bomb)item).explode();
				}
				
				System.out.println();
				
			
			}
		
	}
	
	
	
}
