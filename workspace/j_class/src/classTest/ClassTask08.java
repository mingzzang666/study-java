package classTest;

public class ClassTask08 {
	
//	화면
	
//	회원마다 여러 종류의 운동을 한다.
//	진행한 운동마다 칼로리를 기록한다.
//	이 때, 회원들은 각각 운동한 총 칼로리를 계산할 수 있다.
	
//	회원(User)
//	회원번호
//	이름
//	나이
	
//	운동(Exercise)
//	종목명
//	칼로리(정수)
	
	public static void main(String[] args) {
		Exercise[] arExercise = {
				new Exercise("러닝", 300),
				new Exercise("서핑", 500)
		};
		
		User 한동석 = new User(1, "한동석", 20, arExercise);
		
		System.out.println(한동석.total);
	}
}
















