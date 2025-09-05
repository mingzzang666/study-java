package inputTest;

import java.util.Scanner;

public class InputTask02 {
		public static void main(String[] args) {
//				두 정수를 입력받은 뒤 곱셈 결과를 출력한다.
//				단, nextInt()가 아닌 next()로 사용한다.
			
				Scanner sc = new Scanner(System.in);
//				입력 변수를 선언하는 부분
				String message = "곱할 두 정수를 입력하세요.";
//				메세지를 저장하는 부분
				String example = "예) 4 5";
//				예시를 저장하는 부분
				String format = "%d * %d = %d";
//				식의 형태를 저장하는 부분
				
				int number1 = 0 , number2 = 0;
//				숫자를 저장하는 부분
				int result = 0;
//				결과값을 저장하는 부분
				
				System.out.println(message);
//				메세지를 출력하는 부분
				System.out.println(example);
//				예시를 출력하는 부분
				
				number1 = Integer.parseInt(sc.next());
//				문자열을 입력받아서 정수를 추출해낸 뒤, 숫자값1에 저장하는 부분
				number2 = Integer.parseInt(sc.next());
//				문자열을 입력받아서 정수를 추출해낸 뒤, 숫자값2에 저장하는 부분
				
				result = number1 * number2;
//				결과값을 계산하여 저장하는 부분
				System.out.printf(format, number1, number2, result);
//				식의 형태대로 입력받은 숫자값과 결과값을 출력하는 부분
				
			
				
				
		}

}
