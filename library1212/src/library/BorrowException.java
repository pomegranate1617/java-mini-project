package library;

public class BorrowException extends Exception{
	
	public BorrowException() {}
	//이미 대여중인 책입니다.
	public BorrowException(String message) {
		super(message);
	}
}
