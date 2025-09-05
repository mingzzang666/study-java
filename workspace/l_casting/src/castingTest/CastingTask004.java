package castingTest;

class Employee{
	
	public Employee() {;}
	
	String name;
	int hourlyWage;
	
	public Employee(String name, int hourlyWage) {
		super();
		this.name = name;
		this.hourlyWage = hourlyWage;
	}
	
	void introduce() {
		System.out.println("안녕하세요, 저는 " + name + "이고 " + "시급은 " + hourlyWage + "원 입니다.") ;
	}
	
	int wage(int hours) {
		return hourlyWage * hours;
	}
	

	}

class Waiter extends Employee{
	
	public Waiter(String name, int hourlyWage) {
		super(name, hourlyWage);
	}
	public Waiter() {
		
	}
	void serve() {
		System.out.println("서빙을 합니다.");
	}
}

class Chef extends Employee{
	
	public Chef(String name, int hourlyWage) {
		super(name, hourlyWage);
	}

	public Chef() {;}
	
	void cook() {
		System.out.println("요리를 합니다.");
	}
	
	@Override
	void introduce() {
		System.out.println("요리가 최고야!");
	}
}

class Cleaner extends Employee{

	public Cleaner(String name, int hourlyWage) {
		super(name, hourlyWage);
	}

	public Cleaner() {;}
	
	void clean() {
		System.out.println("청소를 합니다.");
	}
}


public class CastingTask004 {

	public static void main(String[] args) {
		
			Employee[] staff = {
					new Waiter("민경", 10000),
					new Cleaner("영호", 9810),
					new Chef("미래", 10200)
			};
			
			int[] workingHours = { 8, 7, 5 };
			
			for (int i = 0; i < staff.length; i++) {
				Employee employee = staff[i];
				employee.introduce();
				System.out.println("오늘의 급여: " + employee.wage(workingHours[i]) + "원");
			
			if(employee instanceof Waiter) {
				((Waiter)employee).serve();
			}else if(employee instanceof Chef) {
				((Chef)employee).cook();
			}else if(employee instanceof Cleaner) {
				((Cleaner)employee).clean();
			}
			
			System.out.println();
		}	
	}
}
