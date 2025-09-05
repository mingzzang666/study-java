package exceptionTest;

import java.util.Scanner;

public class Game {
//		캐릭터 이름을 입력받고,
//		"멍청이", "바보", "똥개" 가 포함된 이름에 예외를 발생시켜
//		사용자에게 경고 메세지를 출력해준다.
//		강제 종료하지 않는다.
		void checkNickname(String nickname) throws BadNicknameException{
				if(nickname.contains("바보")||nickname.contains("멍청이")||nickname.contains("똥개")) {
					
//			         try {
//		            throw new BadWordException();
//		         } catch (BadWordException e) {
//		            message = "으응~ 안돼 나쁜말";
//		         }
					throw new BadNicknameException("닉네임에 비속어가 포함되었습니다.");
				}
		}
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
		      Game nickname = new Game();
		      String message = "사용 할 닉네임: ";
		      String data = null;
		      
		      while(true) {
		         System.out.print(message);
		         data = sc.nextLine();
		         try {
		            nickname.checkNickname(data);
		            System.out.println("닉네임: " + data);
		            
		         } catch (BadNicknameException e) {
//		        	 무슨 오류인지, 어디서 발생했는지 알고 싶을 때에는 반드시 작성해야 한다.
		        	 e.printStackTrace();
		            System.out.println("사용할 수 없는 닉네임입니다.");
		            
		         }
		      }
			
		}

}
