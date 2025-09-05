package castingTest;

class Vehicle{
	public Vehicle() {;}
	
	String name;
	int speed;
	
	public Vehicle(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
	}
	
	void showInfo() {
		System.out.println("이름: " + name + " 속도: " + speed + "km/h");
	}
	
	int move(int time) {
		return time * speed;
	}
	
}


class Taxi extends Vehicle{
	public Taxi() {;}
	public Taxi(String name, int speed) {
	super(name, speed);
	}
	
	void drive() {
		System.out.println("택시가 고속도로를 달립니다.");
	}
}
class Bus extends Vehicle{
	public Bus() {;}
	public Bus(String name, int speed) {
		super(name, speed);
	}
	void boardPassengers() {
		System.out.println("승객을 태웁니다.");
	}

}
class Bicycle extends Vehicle{
	public Bicycle() {;}
	public Bicycle(String name, int speed) {
		super(name, speed);
	}
	void pedal() {
		System.out.println("자전거로 페달을 밟습니다.");
	}

}
public class CastingTask005 {
		public static void main(String[] args) {
			
			Vehicle[] fleet = {
					new Taxi("경기도택시", 100),
					new Bicycle("따릉이", 20),
					new Bus("8002번", 80)			
			};
			
			for (int i = 0; i < fleet.length; i++) {
				Vehicle vehicle = fleet[i];
				vehicle.showInfo();
				int[] moveHours = {2, 3, 8};
				System.out.println("오늘 달린 거리: " + vehicle.move(moveHours[i]) + "km");
				
				if(vehicle instanceof Taxi) {
					((Taxi)vehicle).drive();
				}else if(vehicle instanceof Bicycle) {
					((Bicycle) vehicle).pedal();
				}else if(vehicle instanceof Bus) {
					((Bus) vehicle).boardPassengers();					
				}
			}
			System.out.println();
			
			
		}

}
