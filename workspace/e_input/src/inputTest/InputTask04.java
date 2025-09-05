package inputTest;

import java.util.Scanner;

public class InputTask04 {
		public static void main(String[] args) {
//				다섯 과목의 점수를 입력받은 뒤, 평균 점수를 출력하기
				String message = "다섯 과목의 점수를 입력하세요.";
//				메세지를 저장하는 부분
				String example = "예) 70 100 80 85 90";
//				예시를 저장하는 부분
				
				int num1 = 0;
				int num2 = 0;
				int num3 = 0;
				int num4 = 0;
				int num5 = 0;
				int result = 0;
//				각각 다섯개의 점수 숫자와 계산 결과를 저장하는 부분
				
				Scanner sc = new Scanner(System.in);
//				입력 변수를 선언하는 부분
				
				System.out.println(message);
//				메세지를 출력하는 부분
				System.out.println(example);
//				예시를 출력하는 부분
				
				num1 = sc.nextInt();
//				첫 번째 점수를 입력받는 부분
				num2 = sc.nextInt();
//				두 번째 점수를 입력받는 부분
				num3 = sc.nextInt();
//				세 번째 점수를 입력받는 부분
				num4 = sc.nextInt();
//				네 번째 점수를 입력받는 부분
				num5 = sc.nextInt();
//				다섯 번째 점수를 입력받는 부분
				
				result = (num1 + num2 + num3 + num4 + num5)/5;
//				결과값을 계산하는 부분
				
				System.out.println(result);
//				결과값을 출력하는 부분
		}
}
