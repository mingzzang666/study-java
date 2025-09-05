package constantTest;

public class ConstantTest {
		public static void main(String[] args) {
				final int ON = 187568;
//				켜지는 코드를 저장하는 부분(변수가 변하지 않도록 final을 사용)
				final int OFF = 187455;
//				꺼지는 코드를 저장하는 부분(변수가 변하지 않도록 final을 사용)
				
//				on = 123;
			
				System.out.println(ON);
//				켜지는 코드를 출력하는 부분
				System.out.println(OFF);
//				꺼지는 코드를 출력하는 부분
				
//				로그인 성공: 0
//				로그인 실패: 1
//				관리자: 2
				
				final int LOGIN_SUCCESS_STATUS = 0;
//				로그인 성공 시의 상태값을 저장하는 부분
				final int LOGIN_FAIL_STATUS = 1;
//				로그인 실패 시에 상태값을 저장하는 부분
				final int LOGIN_ADMIN_MANAGER = 2;
//				관리자로 로그인 했을 시에 상태값을 저장하는 부분
				
				System.out.println(LOGIN_SUCCESS_STATUS);
//				로그인 성공 시의 상태값을 출력하는 부분
				System.out.println(LOGIN_FAIL_STATUS);
//				로그인 실패 시의 상태값을 출력하는 부분
				System.out.println(LOGIN_ADMIN_MANAGER);
//				관리자로 로그인 했을 시의 상태값을 출력하는 부분
		}
		

}
