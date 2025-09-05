package castingTest;

public class CastingTest01 {
		public static void main(String[] args) {
//				자동 형변환
				System.out.println(5 / 2);
//				5/2의 결과값을 정수로 출력
				System.out.println(5 / 2.0);
//				자동 형변환을 사용하여 5/2의 값을 실수로 출력
				
//				강제 형변환
				System.out.println(5 / (double)2);
//				5/2의 값을 강제 형변환을 사용하여 출력
				System.out.println((int)2.9 + 5);
//				강제 형변환을 사용하여 2.9+5의 값을 정수로 출력
				
////				8.43 + 2.59 = 10
//				double num1 = 8.43;
//				double num2 = 2.59;
//				System.out.print(num1);
//				System.out.print("+");
//				System.out.print(num2);
//				System.out.print("=");
//				System.out.println((int)num1+(int)num2);
//				
				double number1 = 8.43, number2 = 2.59;
//				숫자의 값을 저장하는 부분
//				double result = number1 + number2;
				int result = (int)number1 + (int)number2;
//				두 수의 덧셈 값을 결과값으로 저장하는 부분
				
				System.out.println(result);
//				결과값을 출력하는 부분
				
		}
}
