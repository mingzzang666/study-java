package exceptionTest;

public class BadNicknameException extends Exception {
	
	public BadNicknameException() {;}
	
	public BadNicknameException(String message) {
			super(message);
	}

}
