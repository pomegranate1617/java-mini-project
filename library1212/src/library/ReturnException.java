package library;

public class ReturnException extends Exception{
	
	public ReturnException() {}
	//이미 반납된 책입니다.
	public ReturnException(String message) {
		super(message);
	}

}
