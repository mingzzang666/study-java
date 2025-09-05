package inputTest;

import java.util.Scanner;

public class InputTask03 {
		public static void main(String[] args) {
//				3개의 정수를 한 번에 입력받은 후 덧셈 결과 출력
//				nextInt() 사용하기
			
			Scanner sc = new Scanner(System.in);
//			입력 변수를 선언하는 부분
			
			String message = "더할 세 개의 정수를 입력하세요.";
//			메세지를 저장하는 부분
			String example = "예: 2 8 19";
//			예시를 저장하는 부분
			String format = "%d + %d + %d = %d\n";
//			식의 형태를 저장하는 부분
			
			int number1 = 0, number2 = 0 , number3 = 0;
//			세 개의 정수를 저장하는 부분
			int result = 0;
//			결과값을 저장하는 부분
			
			System.out.println(message);
//			메세지를 출력하는 부분
			System.out.println(example);
//			예시를 출력하는 부분
		
			
			number1 = sc.nextInt();
//			첫 번째 정수를 입력받는 부분
			number2 = sc.nextInt();
//			두 번째 정수를 입력받는 부분
			number3 = sc.nextInt();
//			세 번째 정수를 입력받는 부분
			
			result = number1 + number2 + number3;
//			결과값을 계산하는 부분
			
			System.out.printf(format, number1, number2, number3, result);
//			식의 형태대로 계산 결과를 출력하는 부분
			
			
		}
}
