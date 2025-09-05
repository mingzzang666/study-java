package castingTest02;

public class CastingTest02 {
		public static void main(String[] args) {
				System.out.println("" + 3 + 8);
//				숫자를 문자열로 변환하여 출력하는 부분
				
//				아래 코드를 수정하여 결과가 11이 나오도록 한다.
				System.out.println(3 + 8 + "");
//				숫자를 문자열로 변환하지 않고 계산한 뒤 문자열로 변환하는 부분
				
//				"1 + 3 = 4"
//				위의 문자열에서 4를 변수로 사용한다.
//				변수 선언
//				아래의 출력 메소드에서 사용한다.
				
				int result = 4;
//				결과값을 저장하는 부분
				
				System.out.println("1 + 3 = 4");

//				출력 결과: "1 + 3 = 4"
				
				System.out.println("1 + 3 = " + result);
//				결과값만 따로 저장하여 값을 출력하는 부분
				
				String name = "한동석";
//				이름을 저장하는 부분
				String message = name + "님 환영합니다.";
//				이름과 이름에 붙일 메세지를 하나의 값으로 저장하는 부분
				
				System.out.println(message);
//				메세지를 출력하는 부분
				
		}

}
