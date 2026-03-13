package librarypratice;

public class Book {
	//필드
	private String title;
	private String author;
	private int year;
	private boolean borrowed;
	
	
	//생성자
	public Book(String title,String author,int year,boolean borrowed) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.borrowed = borrowed;
	}
	public Book(String title,String author,int year) {
		this(title,author,year,false);
	}
	
	
	//메서드
	public void borrow() throws BorrowException{
		if(borrowed) {
			throw new BorrowException("이미 대여중인 책입니다.");
		}
		else {
			borrowed = true;
			System.out.println("책 대여 성공");
		}
	}
	public void retrunBook() throws ReturnException{
		if(!borrowed) {
			throw new ReturnException("이미 반납된 책입니다.");
		}
		else {
			borrowed = false;
			System.out.println("책 반납 성공");
		}
		
	}
	public void printInfo() {
		System.out.println("제목: "+ title + " /  저자:" + " / 출판년도:" + year + " / 대여여부:" + borrowed);
	}
	
	public String toString() {
		return "제목: "+ title + " /  저자:" + author + " / 출판년도:" + year + " / 대여여부:" + borrowed;
	}
	
	
	//getter메서드
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public boolean isBorrowed() {
		return this.borrowed;
	}

	
}
