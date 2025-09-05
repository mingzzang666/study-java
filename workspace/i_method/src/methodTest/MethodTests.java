package methodTest;

import java.util.Scanner;

public class MethodTests {
	
//	문제1. 배열을 입력받고 배열의 모든 값의 평균을 구하는 메소드 생성
	
		int getAverage(int[] arData) {
			
			int total = 0;
			for (int i = 0; i < arData.length; i++) {
				total += arData[i];
			}
			return total / arData.length;
		}
	
	
//	문제2. 문자열이 대칭인지 판별하는 메소드
//	예) level, radar = true;
		
		boolean getToPalindrome(String str) {
			
			for (int i = 0; i < str.length() / 2; i++) {
			    if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
			    	return false;
			    }
			}
			return true;
			
		}
	
//	문제3. 입력받은 두 수 사이의 모든 정수의 합을 구하는 메소드 생성
		
		int add(int firstNumber, int secondNumber) {
			
			int betweenCount = 0;
			int sum =  0;
			
					if(firstNumber > secondNumber) {
						betweenCount = firstNumber - secondNumber;
					}else {
						betweenCount = secondNumber - firstNumber;
					}
			for(int i = 1; i < betweenCount; i++) {
						if(firstNumber < secondNumber) {
							sum += firstNumber + i;
						}else {
							sum += secondNumber + i;
						}
//						System.out.println(sum);
			}
			return sum;		
		}
				
//	문제4. 이메일 형식이 올바른지 검사하는 메소드 생성
//	예시) test@example.com  -> true
//			example.com -> false
		
		boolean emailCheck(String email) {
			int atCheck = email.indexOf("@");
			int dotCheck = email.lastIndexOf(".");
			
			if (atCheck <= 0) {
				return false;
			}else if(dotCheck <= atCheck + 1 || dotCheck == 0) {
				return false;
			}else if(dotCheck == email.length() - 1) {
				return false;
			}
			return true;
		}
	
//	문제5. 2개의 배열을 입력받고 하나의 배열로 합치는 메소드 생성
		
			int[] mergeArray(int[] arData1, int[] arData2){
				
				int[] mergedArray = new int[arData1.length  + arData2.length];
				
				for (int i = 0; i < arData1.length; i++) {
					mergedArray[i] = arData1[i];
				}
				for (int i = 0; i < arData2.length; i++) {
					mergedArray[i + arData1.length] = arData2[i];
				}
			
				return mergedArray;
				
			}
			
//			5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
			
//			int[] getMaxAndMin(int[] arData) {
//				int max = arData[0];
//				int min = arData[0];
//				
//		      System.out.println(message);

//		      for (int i = 1; i < arData.length; i++) {
//		         if(max < arData[i]) {
//		            max = arData[i];
//		         }
//		         if(min > arData[i]) {
//		            min = arData[i];
//		         }
//		      
//		      }
//		      return max;
//			}
//			문제6. 정수 배열을 입력받아, 모든 요소를 오른쪽으로 한 칸씩 이동시킨 새 배열 반환하는 메소드 생성
// 			 짝수인지 홀수인지 0인지 구분하여 알맞은 문자열값을 리턴
			   String ouput(int input) {
			      if (input == 0) {
			         return "0입니다.";
			      }

			      if (input % 2 == 1) {
			         return "홀수입니다.";
			      }

			      return "짝수입니다";
			   }

//  			 대소문자 구분 없이 처리
			   int countVowels(String text) {
			      text = text.toUpperCase();
			      String vowels = "AEIOU";

			      int count = 0;

			      for (int i = 0; i < text.length(); i++) {
			         char ch = text.charAt(i);
			         if (vowels.indexOf(ch) != -1) {
			            count++;
			         }
			      }
			      return count;
			   }
			//   다섯 개의 정수를 입력받고 짝수만 리턴하는 메소드
			   int[] getEvens(int[] arData) {
			      int count = 0;
			      int[] arEven = null;
			      int index = 0;

			      for (int i = 0; i < arData.length; i++) {
			         if (arData[i] % 2 == 0) {
			            count++;
			         }
			      }

			      arEven = new int[count];

			      for (int i = 0; i < arData.length; i++) {
			         if (arData[i] % 2 == 0) {
			            arEven[index++] = arData[i];
			         }
			      }

			      return arEven;
			   }

			//  문자열에서 대문자 개수 세기
			   int changeABC2(String capital) {
			      String result = "";
			      for (int i = 0; i < capital.length(); i++) {
			         char c = capital.charAt(i);
			         if (64 < c && c < 91) {
			            result += (char) (c);     }
			      }
			      return result.length();
			   }
			   
			//   두 정수를 입력받고 두 정수 사이의 수를 모두 합한다.
			//   단, 양수만 가능
			   int getTotalFromStartToEnd(int firstNumber, int lastNumber){
			      if(firstNumber > lastNumber) {
			         return getTotal(lastNumber, firstNumber);
			      }
			      
			      return getTotal(firstNumber, lastNumber);
			      
			   }
			   
			//   n ~ m까지의 합
			   int getTotal(int start, int end){
			      int result = 0;
			      for (int i = start + 1; i < end; i++) {
			         result += i;
			      }
			      
			      return result;   
			   }

			//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//			   int[] getMaxAndMin(int[] arData){
//			      int[] result = new int[2];
//			      
//			      for (int i = 0; i < result.length; i++) {
//			         result[i] = arData[0];
//			      }
//			      
//			      for (int i = 1; i < arData.length; i++) {
//			         if(result[0] < arData[i]) {
//			            result[0] = arData[i];
//			         }
//			         if(result[1] > arData[i]) {
//			            result[1] = arData[i];
//			         }
//			      }
//			      
//			      return result;
//			   }
			   
			//   
			   void increase(int[] data) {
			      data[0] = data[0] + 10;
			   }
			   
			//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
			   void getMaxAndMin2(int[] arData, int[] result){
			      
			      for (int i = 0; i < result.length; i++) {
			         result[i] = arData[0];
			      }
			      
			      for (int i = 1; i < arData.length; i++) {
			         if(result[0] < arData[i]) {
			            result[0] = arData[i];
			         }
			         if(result[1] > arData[i]) {
			            result[1] = arData[i];
			         }
			      }
			   }
			   
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			MethodTests methodTasks = new MethodTests();
			
//			1번 출력
//			int[] arData = {30, 50, 27, 90, 88};
//		
//			int average = methodTasks.getAverage(arData);
//			
//			System.out.println(average);
			
//			2번 출력
//			boolean symmetry = methodTasks.getToPalindrome("radar");
//			System.out.println(symmetry);
			
//			3번 출력
//			int sum = methodTasks.add(33, 29);
//			System.out.println(sum);
			
//			4번 출력
			
//			String email = sc.next();
//			boolean emailCheck = methodTasks.emailCheck(email);
//			System.out.println(emailCheck);
			
//			5번 출력
			
//			int[] arData1 = {4, 26, 3, 62, 8, 1, 42, 69, 39};
//			int[] arData2 = {11, 67, 2, 10, 7, 55};
//			int[] mergedArray = methodTasks.mergeArray(arData1, arData2);
//			
//			
//			for (int i = 0; i < mergedArray.length; i++) {
//				System.out.println(mergedArray[i]);
//				
//			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

}
