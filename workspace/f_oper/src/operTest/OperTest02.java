package operTest;

import java.util.Scanner;

public class OperTest02 {
		public static void main(String[] args) {
//				두 정수 입력받기(nextInt())
			
				Scanner sc = new Scanner(System.in);
//				입력 변수를 선언하는 부분
				
				String message = "두 정수를 입력하세요.\n";
//				메세지를 저장하는 부분
				String example = "예) 10 25";
//				예시를 저장하는 부분
				int number1 = 0, number2 = 0;
//				숫자를 저장하는 부분
				String result = "";
//				결과값을 저장하는 부분
				
				
				System.out.println(message + example);
//				메세지와 예시를 출력하는 부분
				
				number1 = sc.nextInt();
//				첫 번째 숫자를 받아오는 부분
				number2 = sc.nextInt();
//				두 번째 숫자를 받아오는 부분

//				System.out.println(number1);
//				첫 번째 숫자를 출력하는 부분
//				System.out.println(number2);
//				두 번째 숫자를 출력하는 부분
//				result = number1 > number2 ? number1 : number2;
//				결과를 삼항연산자를 사용하여 저장하는 부분
//				System.out.println("더 큰 값 : " + result);
//				더 큰 값을 출력하는 부분
				
//				단, 두 수가 같을 경우 "두 수가 같습니다" 출력
					result = number1 > number2 ? "더 큰 값 : " + number1 : 
										number1 == number2 ? "두 수가 같습니다." : "더 큰 값: "+ number2;
//					삼항연산자로 두 가지 조건식을 사용하여 저장하는 부분
					
					System.out.println(result);
//					결과를 출력하는 부분
//				
				
		}

}













