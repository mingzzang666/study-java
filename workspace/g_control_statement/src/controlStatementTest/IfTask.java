package controlStatementTest;

import java.util.Scanner;

public class IfTask {
		public static void main(String[] args) {//      심리 테스트
//	      
//	      Q. 당신이 좋아하는 색을 선택하세요.
//	      1. 빨간색
//	      2. 노란색
//	      3. 검은색
//	      4. 흰색
//	      
//	      빨간색 : 불같고 열정적이고 적극적이다.
//	      노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
//	      검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
//	      흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
	      
	      Scanner sc = new Scanner(System.in);
//	      입력 변수를 선언하는 부분
	      String title = "Q. 당신이 좋아하는 색을 선택하세요.";
//	      제목을 저장하는 부분
	      String menu = "1.빨간색\n2.노란색\n3.검은색\n4.흰색";
//	      보기를 저장하는 부분
	      int choice = 0;
//	      선택을 저장하는 부분
	      String redMessage = "불같고 열정적이고 적극적이다.";
//	      빨간색의 메세지를 저장하는 부분
	      String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다.";
//	      노란색의 메세지를 저장하는 부분
	      String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다.";
//	      검은색의 메세지를 저장하는 부분
	      String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
//	      흰색의 메세지를 저장하는 부분
	      String errorMessage = "잘못 입력하셨습니다.";
//	      에러 메세지를 저장하는 부분
	      String resultMessage = "";
//	      결과 메세지를 저장하는 부분
	      
	      boolean condition1 = false, condition2 = false;
	      boolean condition3 = false, condition4 = false;
//	      1,2,3,4번의 논리값을 저장하는 부분
	      
	      System.out.println(title);
//	      제목을 출력하는 부분
	      System.out.println(menu);
//	      보기를 출력하는 부분
	      
	      choice = sc.nextInt();
//	      번호를 입력받는 부분
	      
	      condition1 = choice == 1;
	      condition2 = choice == 2;
	      condition3 = choice == 3;
	      condition4 = choice == 4;
//	      입력받은 번호를 각 논리값에 대입하여 결과를 저장하는 부분
	      
	      if(condition1) {
	         resultMessage = redMessage;
//	         1번일 경우 결과 메세지에 해당 메세지를 담음
	         
	      } else if(condition2) {
	         resultMessage = yellowMessage;
//	         2번일 경우 결과 메세지에 해당 메세지를 담음
	      } else if(condition3) {
	         resultMessage = blackMessage;
//	         3번일 경우 결과 메세지에 해당 메세지를 담음
	         
	      } else if(condition4) {
	         resultMessage = whiteMessage;
//	         4번일 경우 결과 메세지에 해당 메세지를 담음
	         
	      } else {
	         resultMessage = errorMessage;
//	         잘못 입력했을 때 결과값에 에러 메세지를 담음
	      }
	      
	      System.out.println(resultMessage);
//	      결과 메세지를 출력하는 부분
	   }

}
