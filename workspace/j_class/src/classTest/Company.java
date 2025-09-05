package classTest;

public class Company {
	int id;
//	 회사의 고유번호
	String name;
//	 회사의 이름
	Department[] arDepartment;
//	각 부서별 이름과 소득을 저장한 클래스 자료형으로 배열 선언

	int total;
	double average;
//총 수입과 평균을 저장할 변수 선언
	public Company(int id, String name, Department[] arDepartment) {
		this.id = id;
		this.name = name;
		this.arDepartment = arDepartment;
		for (int i = 0; i < arDepartment.length; i++) {
			total += arDepartment[i].income;
		}
//		회사의 번호와 이름,  소득을 설정할 생성자 호출
		this.average = (double)total / arDepartment.length;
//		평균값을 설정할 생성자 호출
	}
	
	
}
