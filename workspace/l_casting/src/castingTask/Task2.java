package castingTask;

//문제 2: 운송 수단 추적 시스템
//다양한 운송 수단을 추적하고, 각 타입별 동작을 분리
//
//Transport 클래스:
//필드: id
//메서드: void move() → "이동 중입니다."

//하위 클래스: Car, Bicycle, Airplane

//move() 오버라이딩 (예: "도로를 주행 중입니다", "하늘을 비행 중입니다")
//Airplane 클래스에는 void flyHigh() 메서드 추가
//Transport[] 배열에 다양한 교통수단 저장 (업캐스팅)
//반복문으로 move() 호출
//Airplane 객체인 경우 다운캐스팅 후 flyHigh() 호출

class Transport{
	public Transport() {;}
	
	int id;
	public Transport(int id) {
		super();
		this.id = id;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	void move() {
		System.out.println("이동 중입니다.");
	}
	
}
class Car extends Transport{
	@Override
	void move() {
		System.out.println("도로를 주행 중입니다.");
	}
	
}

class Bicycle extends Transport{
	@Override
	void move() {
		System.out.println("자전거 전용 도로를 주행 중입니다.");
	}
}

class Airplane extends Transport{
	@Override
	void move() {
		System.out.println("하늘을 비행 중입니다.");
	}
	void flyHigh() {
		System.out.println("이야호!");
	}
}


public class Task2 {
		public static void main(String[] args) {
				Transport[] arTransport = {
						new Bicycle(),
						new Airplane(),
						new Car()
				};
				
				for (int i = 0; i < arTransport.length; i++) {
					Transport transport = arTransport[i];
					transport.move();
					
					if(transport instanceof Airplane) {
						((Airplane)transport).flyHigh();
					}
				}
				System.out.println();
				
		}

}
