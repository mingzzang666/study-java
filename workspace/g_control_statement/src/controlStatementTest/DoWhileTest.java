package controlStatementTest;

import java.util.Scanner;

public class DoWhileTest {
		public static void main(String[] args) {
			String message = "1.통신 요금 조회\n2.번호 변경\n3.통신사 변경\n0.상담원 연결";
//			메세지를 저장하는 부분
      
      
			Scanner scanner = new Scanner(System.in);
//			입력 변수를 선언하는 부분
			int choice = 0;
//			입력 번호를 저장하는 부분
			do {
				System.out.println(message);
//				메세지를 출력하는 부분
				choice = scanner.nextInt();
//				번호를 입력받는 부분
				} while(choice != 0);
//				do~while문의 조건식을 설정하는 부분
   }
}