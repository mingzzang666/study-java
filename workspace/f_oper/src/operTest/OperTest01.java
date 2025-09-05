package operTest;

public class OperTest01 {
		public static void main(String[] args) {
			
				boolean isTrue = 10 == 11;
//				논리형 isTrue의 값을 저장하는 부분
				boolean result = isTrue && 10 <= 20;
//				논리형 result의 값을 and를 사용하여 저장하는 부분
			
				System.out.println(10  == 11);
//				false를 출력하는 부분
//				System.out.println(10 > 3);
//				true를 출력하는 부분
//				System.out.println(isTrue);
//				isTrue의 값을 출력하는 부분
//				System.out.println(result);
//				result의 값을 출력하는 부분
				
//				isTrue && 10 <= 20의 결과를 true가 나오도록 변경하기
//				단, 숫자는 변경하지 않는다.
//				System.out.println(!result);
			 
//				boolean isTrue = 10 <= 11;
//				논리형 값을 저장하는 부분
//				boolean result = isTrue && 10<=20;
//				논리형 값을 and를 사용하여 저장하는 부분
				boolean result2 = isTrue || 10<=20;
//				논리형 값을 or를 사용하여 저장하는 부분
				
				System.out.println(result);
//				result 값을 출력하는 부분
				System.out.println(result2);
//				result2의 값을 출력하는 부분
				
		}

}
