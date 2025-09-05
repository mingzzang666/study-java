package inputTest;

import java.util.Scanner;

public class InputTest01 {
		public static void main(String[] args) {
//				String nameMessage = "이름: ";
//				Scanner scanner = new Scanner(System.in);
//				String name = "";
//				String resultMessage = "";
//				
//				System.out.print(nameMessage);
//				name = scanner.next() + "님";
//				resultMessage = name + "님";
//				
//				System.out.println(name);
				
//				이름을 입력받고 출력하기
				String nameMessage = "이름: ";
//				메세지를 저장하는 부분
				String name = "";
//				이름을 저장하는 부분
				
				Scanner sc = new Scanner(System.in);
//				입력 변수를 선언하는 부분
				
				System.out.println(nameMessage);
//				메세지를 출력하는 부분
				name = sc.next();
//				이름을 입력받는 부분
				
				System.out.println(name);
//				입력된 이름을 출력하는 부분
				
				
			
			
		}

}
