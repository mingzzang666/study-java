package stringTest;

import java.util.Scanner;

public class StringTask03 {
		public static void main(String[] args) {
//			사용자로부터 정수 10개를 입력받는다.
//			입력된 숫자들 중 짝수와 홀수의 개수를 각각 출력한다.
//			짝수와 홀수에 해당하는 숫자들도 함께 출력한다.
			
//			결과를 총 3줄로 출력:
//				전체 입력된 수
//				짝수 개수 및 짝수 목록
//				홀수 개수 및 홀수 목록
			
			Scanner sc = new Scanner(System.in);
			
			int[] arData = new int[10];
			String totalNumber = "";
			String evenNumber = "";
			String oddNumber = "";
			int evenCount = 0;
			int oddCount = 0;
			System.out.println("정수 10개를 입력하세요.");
			
			
			for (int i = 0; i < arData.length; i++) {
				arData[i] = sc.nextInt();
				totalNumber += arData[i] + " ";
				
				if (arData[i] % 2 == 0) {
					evenNumber += arData[i] + " ";
					evenCount ++;
				}else {
					oddNumber += arData[i] + " ";
					oddCount ++;
					
				}
			}
			System.out.println("1. 입력된 전체 숫자들: " +  totalNumber);
			System.out.println("2. 짝수 개수: " + evenCount + "개, " + "짝수 목록: " + evenNumber);
			System.out.println("3. 홀수 개수: " + oddCount + "개, " + "홀수 목록: " + oddNumber);
			
			
			
		}

}
