package castingTest;

public class Encryption {
   public static void main(String[] args) {
	   		String password = "ehdtjrdl1234";
//	   		비밀번호를 저장하는 부분
	   		String encryptedPassword = "", decryptedPassword = "";
//	   		암호화 한 비밀번호, 복구화한 비밀번호를 저장하는 부분
	   		final int KEY = 3;
//	   		키 값을 설정하는 부분 (변수가 변하지 않도록 final을 사용하여 저장)
      
	   		for (int i = 0; i < password.length(); i++) {
	   			encryptedPassword += (char)(password.charAt(i) * KEY);
      }
   
//	   		반복문을 사용하여 비밀번호 각 문자 아스키코드 값에 키 값을 곱해서 비밀번호를 암호화하는 부분
	   		
	   		System.out.println(encryptedPassword);
//	   		암호화 된 비밀번호를 출력하는 부분
      
	   		for (int i = 0; i < encryptedPassword.length(); i++) {
	   			decryptedPassword += (char)(encryptedPassword.charAt(i) / KEY);
      }
//	   		반복문을 사용하여 암호화 된 비밀번호를 복구화하는 부분
      
	   		System.out.println(decryptedPassword);
//	   		복구화된 비밀번호를 출력하는 부분
      
   }
}
