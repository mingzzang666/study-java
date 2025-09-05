package arrayTest;

import java.util.Scanner;

public class ArTask {
			public static void main(String[] args) {
////						1 ~ 10까지 배열에 담고 출력
//				int[] arData = new int[10];
//				10개의 값을 가진 arData 배열을 생성하는 부분
//				
//				for (int i = 0; i < arData.length; i++) {
//					arData[i] = i + 1;
//				}	
//				arData 배열에 1~10까지 값을 저장
//				
//				for (int i = 0; i < arData.length; i++) {
//					System.out.println(arData[i]);
//				}
//				arData 배열 값을 출력하는 부분
//				
////						10 ~ 1까지 중 짝수만 배열에 담고 출력
//				int[] arData = new int[5];
//				5개의 값을 가진 배열 생성
//				
//				for (int i = 0; i < arData.length; i++) {
//					arData[i] = (5 - 1) * 2;
//				arData 배열에 각 10, 8, 6, 4, 2 값을 저장 
//					
//					System.out.println(arData[i]);
//				}
//				arData 값을 출력
//				
////						1 ~ 100까지 배열에  담은 후 홀수만 출력
//				int[] arData = new int[100];
//				100개의 값을 가진 arData 변수 선언
//				
//				for (int i = 0; i < arData.length; i++) {
//					arData[i] = i + 1;
//				}
//				arData 변수에 1 ~ 100까지의 값을 저장
//				
//				for (int i = 0; i < arData.length; i++) {
//					if(arData[i] % 2 == 1) {
//						System.out.println(arData[i]);
//					}
//				}
//				arData의 각 값을 2로 나누어 나머지가 1이 되는 수만 출력하여 홀수만을 출력
				
//				반복횟수를 최소화하기
				
//				1 ~ 100까지 배열에 담은 후 짝수의 합 출력
//				int[] arData = new int[100];
//				int result = 0;
//				
//				for (int i = 0; i < arData.length; i++) {
//					arData[i] = i + 1;
//				}
//				
//				for (int i = 0; i < 50; i++) {
//					result = result + arData[i * 2];
//				}
//				위의 코드를 수정하여 반복 횟수 최소화
//				
//				System.out.println(result);
				
				
			
				
				
				
//				A ~ F까지 배열에 담고 출력
				
//				int[] arData = new int[6];		
//				6개의 값을 가진 arData 배열 선언
//				for(int i = 0; i < 6; i++) {
//					char c = (char)(65 + i);
//					arData[i] = c;
//				문자형 자료형 char를 이용하여 아스키코드값에 i를 더해 arData 변수에 알파벳을 저장
//					System.out.println((char)arData[i]);
//				저장한 값 출력
//				}
//				
				
				
//				A ~ F까지 중 C를 제외하고 배열에 담은 후 출력
				
//				int[] arData = new int[5];
//				5개의 값을 가진 arData 배열 선언
//				for(int i = 0; i < 5; i++) {
//					arData[i] = (char)((i > 1 ? 66 : 65) + i);
//					System.out.println((char)arData[i]);
//				}
//				for문과 삼항연산자를 이용하여 C를 제외하고 arData 배열에 값 저장
				
//				char[] arData = new char[6];
//				for (int i = 0; i < arData.length; i++) {
//					arData[i] = (char)(65 + i) ;
//					System.out.println(arData[i]);
//				}
				
//				char[] arData = new char[5];
//				for (int i = 0; i < arData.length; i++) {
//					arData[i] = (char)((i > 1 ? 66 : 65) + i);
//					System.out.println(arData[i]);
//				}
				
//				char[] arData = new char[6];
//				for (int i = 0; i < 6 ; i++) {
//					if(i == 2) {
//						continue;
//					} else {
//					char c = (char)(65 + i);
//					arData[i] = c;
//					System.out.println(arData[i]);
//					}
//				}
//					위의 코드를 if문과 continue를 활용하여 알파벳 C를 제외
				
//				5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//				단, 같은 수는 없다고 가정한다.
				
//				Scanner sc = new Scanner(System.in);
////				
//				int[] arData = new int[5];
//				
//				arData[0] = sc.nextInt();
//				int max = arData[0];
//				int min = arData[0];
////				System.out.println(max);
//				for (int i = 1; i < arData.length; i++) {
//					arData[i] = sc.nextInt();				
//					if(max < arData[i]) {
//						max = arData[i];
//					}
//					if(min > arData[i]) {
//						min = arData[i];
//					}
//				}
//					System.out.println("최댓값: " + max + " 최소값: " + min);
					
//				
				
//				칸 수를 입력받고, 칸 수만큼 정수를 다시 입력받는다.
//				입력한 정수들의 평균값을 구한다
				
//				Scanner sc = new Scanner(System.in);
//				
//				int[] arData = null;
//				int length = 0;
//				int result = 0;
//				System.out.println("칸 수를 입력해주세요.");
//				
//				length = sc.nextInt();
//				arData = new int[length];
//				System.out.println(length + "개 만큼 정수를 입력해주세요.");
//								
//				for (int i = 0; i < arData.length; i++) {
//					arData[i] = sc.nextInt();
//					result += arData[i];
//				}
//				System.out.println("평균 값은 "+ (double)result / length + "입니다.");
				
				
		 		
//				(1)	001.png ~ 010.png 를 배열에 담고 출력
				
//				i /10 < 1					: 00
//				i /10 < 10				: 0
//				i /10 < 100 			:
//				String[] arData = new String[10];
//				
//				for(int i = 0; i < 10; i++) {
//					String fileName = "";
//					
//						String zero = "";
//						
//						if((i + 1) / 10 < 1) {
//								zero = "00";
//						}else if((i + 1) / 10 < 10) {
//								zero = "0";
//						}
//						
//						fileName += zero;
////						fileName = fileName + (i + 1);
//						fileName += i + 1;
//						fileName += ".png";
//						arData[i] = fileName;
////						System.out.println(fileName);
//				}
//				
//				for(int i = 0; i < arData.length; i++) {
//					System.out.println(arData[i]);
//				}
				
//				(2)	001.png ~ 010.png 를 배열에 담고 출력
//				(글자수의 길이를 사용)
				
				
				
//				(3)	001.png ~ 010.png 를 배열에 담고 출력
//				서식문자 사용
				
			}

}
