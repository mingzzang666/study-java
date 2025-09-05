package castingTask;

public class Example {
//	 문제 1: 도서관 도서 관리 시스템
//	 도서관에 다양한 종류의 책(소설, 잡지, 만화)을 관리
	
//	 Book 클래스:
//	 필드: title, author
//	 메서드: void describe() → "일반 도서입니다."
	
//	 Novel, Magazine, ComicBook 클래스는 Book 상속
	
//	 각각 describe()를 오버라이딩하여 고유 설명 출력
//	 ComicBook 클래스에는 void readPage(int page) 메서드 추가
//	 "만화책 X페이지를 읽었습니다." 출력
//	 Book[] 배열에 다양한 도서를 저장 (업캐스팅)
//	 모든 책에 대해 describe() 호출
//	 만화책인 경우만 다운캐스팅하여 readPage(5) 호출
	
//	문제 2: 운송 수단 추적 시스템
//	다양한 운송 수단을 추적하고, 각 타입별 동작을 분리
//	
//	Transport 클래스:
//	필드: id
//	메서드: void move() → "이동 중입니다."
	
//	하위 클래스: Car, Bicycle, Airplane
	
//	move() 오버라이딩 (예: "도로를 주행 중입니다", "하늘을 비행 중입니다")
//	Airplane 클래스에는 void flyHigh() 메서드 추가
//	Transport[] 배열에 다양한 교통수단 저장 (업캐스팅)
//	반복문으로 move() 호출
//	Airplane 객체인 경우 다운캐스팅 후 flyHigh() 호출
	
//	문제 3: 음식 주문 시스템
//	음식 종류별로 처리하는 시스템을 만들어 다운캐스팅 적용
	
//	Food 클래스:
//	필드: name, price
//	메서드: void serve() → "음식이 제공되었습니다."
	
//	하위 클래스: Pizza, Sushi, Burger
	
//	serve() 오버라이딩 (음식마다 고유한 메시지)
//	Pizza 클래스에는 void addCheese() 메서드 추가
//	Food[] 배열에 음식 저장
//	반복문으로 serve() 호출
//	Pizza 객체는 다운캐스팅 후 addCheese() 호출

//	문제 4: 스마트홈 기기 제어
//	다양한 스마트 기기를 제어하고, 특정 기기의 고유 기능 실행
	
//	SmartDevice 클래스:
//	필드: deviceName
//	메서드: void activate() → "기기가 작동합니다."
	
//	하위 클래스: SmartLight, SmartThermostat, SmartSpeaker
	
//	각 클래스는 activate() 오버라이딩
//	SmartSpeaker 클래스에는 void playMusic(String song) 메서드 추가
//	SmartDevice[] 배열에 다양한 기기 저장
//	반복문으로 activate() 호출
//	SmartSpeaker인 경우 다운캐스팅 후 playMusic("노래 제목") 호출
	
//	문제 5: 게임 캐릭터 전투 시뮬레이션
//	게임 캐릭터의 다양한 행동을 오버라이딩하고, 고유 스킬을 다운캐스팅으로 실행
	
//	Character 클래스:
//	필드: name, level
//	메서드: void attack() → "기본 공격"
	
//	하위 클래스: Warrior, Archer, Wizard
	
//	각 클래스에서 attack() 오버라이딩
//	Wizard 클래스에는 castSpell(String spellName) 메서드 추가
//	Character[] 배열에 캐릭터 저장
//	반복문으로 attack() 호출
//	Wizard 객체일 경우 다운캐스팅 후 castSpell("파이어볼") 호출

//	🧠 문제 6: 정부 민원 처리 시스템
//	시민들이 다양한 민원을 접수합니다.
//	건의, 신고, 질문 등 민원의 종류에 따라 처리 방법이 다릅니다.
	
//	Complaint 클래스:
//	필드: title, content, submittedDate
//	메서드: process()
	
//	하위 클래스: Suggestion, Report, Inquiry
	
//	각각의 process()를 다르게 오버라이딩
//	Report 클래스에 isAnonymous 필드 추가
//	배열에 저장 후 process() 호출
//	Report 객체만 다운캐스팅해서 익명 여부 출력
	
//	🧠 문제 7: 의료 진료 기록 시스템
//	병원에서는 다양한 진료 형태를 기록합니다.
//	외래 진료, 응급 진료, 원격 진료가 있습니다.
	
//	MedicalRecord 클래스:
//	필드: patientName, date
//	메서드: printSummary()
	
//	하위 클래스: Outpatient, Emergency, Telemedicine
	
//	Emergency는 ambulanceUsed 필드 포함
//	printSummary() 오버라이딩
//	배열에 저장 후 모든 기록 출력
//	Emergency 객체만 다운캐스팅하여 ambulanceUsed 여부 출력
//

}
