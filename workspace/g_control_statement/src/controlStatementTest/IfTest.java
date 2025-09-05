package controlStatementTest;

import java.util.Scanner;

public class IfTest {
		public static void main(String[] args) {
//			두 정수 입력받기(nextInt())
			
			Scanner sc = new Scanner(System.in);
//			입력 변수 선언
			
			String message = "두 정수를 입력하세요.\n";
//			메세지를 저장하는 부분
			String example = "예) 10 25";
//			예시를 저장하는 부분
			int number1 = 0, number2 = 0;
//			두 정수를 저장하는 부분
			String result = "";
//			결과값을 저장하는 부분
			
			System.out.println(message + example);
//			메세지와 예시를 출력하는 부분
			number1 = sc.nextInt();
//			첫 번째 숫자를 입력받는 부분
			number2 = sc.nextInt();
//			두 번째 숫자를 입력받는 부분
			
			if(number1 > number2) {
					result = "큰 값: " + number1;
			}else if(number1 < number2) {
					result = "큰 값: " + number2;
			}else {
					result = "두 수는 같습니다.";
			}
//			if문을 사용하여 첫 번째 숫자와 두 번째 숫자를 비교하여 크기를 비교하는 부분
			
			System.out.println(result);
//			결과를 출력하는 부분
		}
}
