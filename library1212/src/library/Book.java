package library;

public class Book {
	//필드
	private String title;
	private String author;
	private int  year;
	private boolean borrowed;
	
	//생성자
	public Book(String title,String author,int year,boolean borrowed) {
		this.title=title;
		this.author=author;
		this.year=year;
		this.borrowed=borrowed;	
	}
	
	
	public Book(String title,String author,int year) {
		this(title,author,year,false);
	}
	
	//메서드
	public void borrow(String title) throws BorrowException{
		if(borrowed == true) {
			throw new BorrowException("이미 대여중인 책입니다.");
		}
		else {
			borrowed =true;
		}
	}
	
	//다시 고치기
	public void returnBook() throws ReturnException{
		if(borrowed ==false) {
			throw new ReturnException("이미 반납된 책입니다.");
		}
	}
	
	public void printInfo() {
		System.out.println("제목: "+title+" / 저자: "+author+" / 출판년도: "+year+" / 대여여부: "+borrowed);
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getYear() {
		return year;
	}
	//boolean타입이면 get대신 is
	public boolean getBorrowed() {
		return borrowed;
	}
	
}
