package inputTest;

import java.util.Scanner;

public class InputTest02 {
   public static void main(String[] args) {
	   		Scanner scanner = new Scanner(System.in);
//	   		입력 변수를 선언하는 부분
	   		int age = 0;
//	   		나이를 저장하는 부분
	   		
      
	   		String nameMessage = "이름을 입력해주세요.";
//	   		이름 메세지를 저장하는 부분
	   		String ageMessage = "나이를 입력해주세요.";
//	   		나이 메세지를 저장하는 부분
	   	
	   		String name = "";
//	   		이름을 저장하는 부분
      
	   		System.out.println(ageMessage);
//	   		나이 메세지를 출력하는 부분
	   		age = scanner.nextInt();
//	   		나이를 받아오는 부분

	//      nextLine()은 앞에서의 엔터(\n)를 먹기 때문에
	//      기존 입력 알고리즘에 문제가 생길 수 있다.
	//      따라서 nextLine()으로 입력받기 전 다른 입력이 실행되었다면,
	//      반드시 \n을 먹어줄 nextLine()을 사용해준다.
	   		scanner.nextLine();
//	      	\n을 먹어줄 nextLine() 사용
	   		System.out.println(nameMessage);
//	   		이름 메세지를 출력하는 부분
	   		name = scanner.nextLine();
//	   		이름을 입력받는 부분
	      
	   		System.out.println(name);
//	   		이름을 출력하는 부분
	   		System.out.println(age + "살");
//	   		나이를 출력하는 부분
   }
}











