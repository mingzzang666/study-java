package methodTest;

import java.util.Scanner;

public class MethodTask {
//   1 ~ 10까지 println()으로 출력하는 메소드
   void printFrom1To10(){
      for (int i = 0; i < 10; i++) {
         System.out.println(i + 1);
      }
   }
   
//   "홍길동"을 n번 println()으로 출력하는 메소드
   void printHong(int n){
      for (int i = 0; i < n; i++) {
         System.out.println("홍길동");
      }
   }
   
//   이름을 n번 println()으로 출력하는 메소드
   void printName(String name, int n){
      for (int i = 0; i < n; i++) {
         System.out.println(name);
      }
   }
   
//   세 정수의 뺄셈 메소드
//   int subtract(int number1, int number2, int number3){
//      return number1 - number2 - number3;
//   }
   
//   int subtract(int[] arNumber){
//      int result = 0;
//   뺄셈 메소드를 선언하고 result 값을 기본값으로 설정
//      
//      arNumber[0] *= -1;
//   		뺄셈 메소드를 만들기 위해 ar[0]에다가 음수를 곱해 결과값을 음수로 만들어줌. (0에서 차례대로 빼기 위하여)
//      
//      for (int i = 0; i < arNumber.length; i++) {
//         result -= arNumber[i];
//      }
//      return result;
//   }
   
//   두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//   return 값은 반드시 1개만 가능하다.
   int[] divide(int number1, int number2){
      int[] arResult = new int[2];
//  나눗셈 메소드 선언    
      
      if(number2 != 0) {
         arResult[0] = number1 / number2;
         arResult[1] = number1 % number2;
         return arResult;
      }
//      arResult[0] = 몫 구하는 조건문
//      arResult[1] = 나머지 구하는 조건문
//      합쳐서 결과 출력
      
      return null;
   }
   
//   1 ~ n까지의 합을 구해주는 메소드
   int getTotal(int n){
      int result = 0;
      for (int i = 0; i < n; i++) {
         result += i + 1;
      }
      return result;
   }
   
//   문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
   String changeABC(String content){
      String result = "";
      
      for (int i = 0; i < content.length(); i++) {
         char c = content.charAt(i);
//       입력받은 문자열의 길이만큼 반복문 생성
         
         if(c >= 97 && c <= 122) {
            result += (char)(c - 32);
//      입력받은 문자열이 소문자이면 대문자로 바꿔주는 조건문 생성
            
         }else if(c >= 65 && c <= 90) {
            result += (char)(c + 32);
//      입력받은 문자열이 대문자이면 소문자로 바꿔주는 조건문 생성
            
         }else {
            result += c;
         }
      }
      
      return result;
   }
   
//   한글을 정수로 바꿔주는 메소드
//   일공이사 -> 1024
   int changeToInteger(String data){
      String hangeul = "공일이삼사오육칠팔구";
//      한글로 된 숫자 문자열 생성
      String temp = "";
//      변환된 정수 담을 문자열 생성
      for (int i = 0; i < data.length(); i++) {
         temp += hangeul.indexOf(data.charAt(i));
      }
//      매개변수의 첫번째 글자부터 한글로 된 숫자 문자열의 어느 위치에 해당하는지 대입하여 변환
      
      return Integer.parseInt(temp);
   }
//   문자열을 숫자로 형변환하여 출력
   
//   정수를 한글로 바꿔주는 메소드
//   1024 -> 일공이사
   String changeToHangeul(int number){
      String hangeul = "공일이삼사오육칠팔구";
//      한글로 된 숫자 문자열 선언
      String result = "";
//      한글로 변환된 숫자를 담을 문자열 선언
      while(number != 0) {
         result = hangeul.charAt(number % 10) + result;
         number /= 10;
      }
//      숫자가 0이 아닐경우 한글 문자열의 첫번째 글자부터 10으로 나눠서 결과값에 대입
      return result;
   }
   
//   문자열과 문자를 입력받고 해당 문자가 몇 개 있는지 구하기
//   입력 예) banana, a
//   출력 예) 3
   int getCount(String content, char c){
//   문자열과 문자를 입력받음
      int count = 0;
//      해당 문자가 몇 개 있는지 세어 줄 변수 선언
      for (int i = 0; i < content.length(); i++) {
         if(content.charAt(i) == c) {
            count ++;
//            문자열에서글자를 추출하여 첫 번째 글자부터 대입, 맞으면 카운트 증가
         }
      }
      return count;
   }
   
//   1~100을 입력받고 짝수만 리턴하는 메소드
   int[] getEven(int[] arData){
      int[] arEven = new int[50];
//      짝수를 담을 배열 선언
      for (int i = 0; i < arEven.length; i++) {
         arEven[i] = arData[i * 2 + 1];
      }
      
      return arEven;
   }
   
//   숙제
//   문제 5개 만들어서 풀어오기
   
//   		1번 문제
//   		배열을 입력받아 평균을 반환하는 메소드 작성
   			double getAverage(int[] arNumber) {
   				
   					int total = 0;
   					for(int i = 0; i < arNumber.length; i++) {
   						total += arNumber[i];
   					}
   					return (double) total / arNumber.length;
   			}
   
   
   
   
   
   
//   		2번 문제
//   		정수 배열과 기준값을 받아 기준값 이상인 값만 출력하는 메소드 작성
   					void getReferenceValue(int[] arData, int referenceNumber){
   							for (int i = 0; i < arData.length; i++) {
								if(arData[i] >= referenceNumber) {
										System.out.println(arData);
								}
							}
   					}
   			
   		
//   		3번 문제
//   		문자열을 입력받아 문자열이 대칭인지 확인하는 메소드 작성
//   		예) level, radar = true
   
//   		4번 문제
//   		두 개의 정수를 입력받아 그 사이에 있는 모든 정수의 합 반환하는 메소드 작성
   			
   		
//   		5번 문제
//   		이메일 형식이 올바른지 검사하는 메소드 작성
//   			예시) test@example.com - > true
//						example.com -> false
   
   public static void main(String[] args) {
//      메소드를 선언했다면, 반드시 사용해서 테스트한다.
      
      Scanner scanner = new Scanner(System.in);
      
      MethodTask methodTask = new MethodTask();
//      methodTask.printFrom1To10();
//      methodTask.printHong(10);
      
//      String message = "이름: ";
//      System.out.print(message);
//      methodTask.printName(scanner.next(), 5);
      
//      int[] arNumber = {3, 4, 1};
//      int result = methodTask.subtract(arNumber);
//      System.out.println(result);
      
//      int[] arResult = methodTask.divide(10, 3);
//      
//      if(arResult == null) {
//         System.out.println("0으로 나눌 수 없습니다.");
//      }else {
//         System.out.println("몫: " + arResult[0]);
//         System.out.println("나머지: " + arResult[1]);
//      }
      
//      int result = methodTask.getTotal(10);
//      System.out.println(result);
      
//      String result = methodTask.changeABC("aBcDefff!@#!@#123");
//      System.out.println(result);
      
//      int result = methodTask.changeToInteger("공공공공공공공일");
//      System.out.println(result);
      
//      String data = methodTask.changeToHangeul(48125750);
//      System.out.println(data);
      
//      int count = methodTask.getCount("banana", 'z');
//      System.out.println(count);
      
//      int[] arData = new int[100];
//      int[] arEven = null;
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//      }
//      
//      arEven = methodTask.getEven(arData);
//      
//      for (int i = 0; i < arEven.length; i++) {
//         System.out.println(arEven[i]);
//      }
      
//					1번 출력
//      			int[] arData = {60, 40, 50, 20, 60};
//      			double average = methodTask.getAverage(arData);
//      			System.out.println(average);
      
//      			2번 출력
      				int[] arData = new int[10];
      				
      				for (int i = 0; i < arData.length; i++) {
      						arData[i] = (i + 5) * 2;
					}
      				
//      				int referenceValue = 
      					methodTask.getReferenceValue(arData, 20);
//      				System.out.println(referenceValue);
      				
      				
      					
      
   }
}
















