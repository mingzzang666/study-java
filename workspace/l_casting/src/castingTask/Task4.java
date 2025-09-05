package castingTask;

//문제 4: 스마트홈 기기 제어
//다양한 스마트 기기를 제어하고, 특정 기기의 고유 기능 실행

//SmartDevice 클래스:
//필드: deviceName
//메서드: void activate() → "기기가 작동합니다."

//하위 클래스: SmartLight, SmartThermostat, SmartSpeaker

//각 클래스는 activate() 오버라이딩
//SmartSpeaker 클래스에는 void playMusic(String song) 메서드 추가
//SmartDevice[] 배열에 다양한 기기 저장
//반복문으로 activate() 호출
//SmartSpeaker인 경우 다운캐스팅 후 playMusic("노래 제목") 호출

class SmartDevice{
	
	public SmartDevice() {;}
	
	String deviceName;

	public SmartDevice(String deviceName) {
		super();
		this.deviceName = deviceName;
	}
	
	void activate() {
		System.out.println("기기가 작동합니다.");
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
}
class SmartLight extends SmartDevice{
		public SmartLight(String deviceName) {
			super(deviceName);
		}
		@Override
		void activate() {
			System.out.print("SmartLight");
		super.activate();
		}
}

class SmartThermostat extends SmartDevice{
	public SmartThermostat(String deviceName) {
			super(deviceName);
	}
	
	@Override
	void activate() {
		System.out.println("SmartThermostat");
		super.activate();
	}
}
class SmartSpeaker extends SmartDevice{
	public SmartSpeaker(String deviceName) {
		super(deviceName);
}
	@Override
	void activate() {
		System.out.println("SmartSpeaker");
		super.activate();
	}
	
	void playMusic(String song) {
		System.out.println(song);
	}
}
public class Task4 {
		public static void main(String[] args) {
				SmartDevice[] arSmartDevice = {
						new SmartSpeaker("기기1"),
						new SmartThermostat("기기2"),
						new SmartLight("기기3")
				};
				
				for (int i = 0; i < arSmartDevice.length; i++) {
					SmartDevice smartDevice = arSmartDevice[i];
					smartDevice.activate();
					
					if(smartDevice instanceof SmartSpeaker) {
						((SmartSpeaker)smartDevice).playMusic("뮤직1");
					}
				}
			System.out.println();
		}

}
