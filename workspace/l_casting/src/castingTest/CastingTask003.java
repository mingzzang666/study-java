package castingTest;

class Device{
	public Device() {;}
	
	String brand;
	int price;
	
	
	public Device(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}


	void showDeviceInfo() {
		System.out.println("기기명: " + brand + " / 가격: " + price);
	}
	
}

public class CastingTask003 {
		public static void main(String[] args) {
			
			Device[] arDevice = {
					new Tablet("삼성", 300_000),
					new Phone("애플",1_100_000),
					new Laptop("ASUS",1_500_000)
					};
			
			for (int i = 0; i < arDevice.length; i++) {
				Device device = arDevice[i];
				device.showDeviceInfo();
				
				if(device instanceof Tablet) {
					((Tablet)device).draw();
				}else if(device instanceof Phone) {
					((Phone) device).call();
				}else if(device instanceof Laptop) {
					((Laptop) device).coding();
				}
			}

		}
	

}
