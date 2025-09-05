package castingTask;

//문제 3: 음식 주문 시스템
//음식 종류별로 처리하는 시스템을 만들어 다운캐스팅 적용

//Food 클래스:
//필드: name, price
//메서드: void serve() → "음식이 제공되었습니다."

//하위 클래스: Pizza, Sushi, Burger

//serve() 오버라이딩 (음식마다 고유한 메시지)
//Pizza 클래스에는 void addCheese() 메서드 추가
//Food[] 배열에 음식 저장
//반복문으로 serve() 호출
//Pizza 객체는 다운캐스팅 후 addCheese() 호출

class Food{
	public Food() {;}
	String name;
	int price;
	
	public Food(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	void serve() {
		System.out.println("음식이 제공되었습니다.");
	}
	
}
class Pizza extends Food{
	public Pizza(String name, int price) {
		super(name, price);
	}
	@Override
	void serve() {
		System.out.println("피자가 제공되었습니다.");
	}
	void addCheese() {
		System.out.println("치즈를 추가합니다.");
	}
}
class Sushi extends Food{
	public Sushi(String name, int price) {
		super(name, price);
		}
	@Override
	void serve() {
		System.out.println("초밥이 제공되었습니다.");
	}
}
class Burger extends Food{
	public Burger(String name, int price) {
		super(name, price);
	}
	@Override
	void serve() {
		System.out.println("버거가 제공되었습니다.");
	}
}
public class Task3 {
		public static void main(String[] args) {
				Food[] arFood = {
						new Burger("불고기버거", 4000),
						new Sushi("연어초밥", 8000),
						new Burger("새우버거", 4500),
						new Pizza("고구마피자", 12000),
						new Sushi("계란초밥", 6000)
				};
				for (int i = 0; i < arFood.length; i++) {
					Food food = arFood[i];
					food.serve();
				
					if(food instanceof Pizza) {
						((Pizza) food).addCheese();
					}
				}
				
				System.out.println();
				
		}

}
