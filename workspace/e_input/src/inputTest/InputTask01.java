package inputTest;

import java.util.Scanner;

public class InputTask01 {
		public static void main(String[] args) {
//			반려동물 이름을 입력받고 출력하기
			String nameMessage = "반려동물 이름을 입력하세요.";
//			메세지를 저장하는 부분
			String petName = "";
//			반려동물 이름을 저장하는 부분
			
			Scanner sc = new Scanner(System.in);
//			입력 변수를 선언하는 부분
			System.out.println(nameMessage);
//			메세지를 출력하는 부분
			
			petName = sc.next();
//			반려동물 이름을 입력받는 부분
			System.out.println(petName);
//			입력된 반려동물 이름을 출력하는 부분
			
			
			
		}

}
