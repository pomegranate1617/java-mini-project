package library;

public class Book {
	private String title;
	private String author;
	private int year;
	private boolean borrowed;
	
	public Book(String title,String author,int year,boolean borrowed) {
		this.title=title;
		this.author=author;
		this.year=year;
		this.borrowed=borrowed;
	}
	
	public Book(String title,String author,int year) {
		this(title, author, year,false);
	}
	
	public void borrow(boolean borrowed) throws BorrowException{
		if(borrowed==true) {
			throw new BorrowException();
		}
	}
	public void returnBook(boolean borrowed) throws ReturnException{
		if(borrowed==false) {
			throw new ReturnException();
		}
	}
	public void printInfo() {
		System.out.println("제목:"+title+"/저자:"+author+"/출판년도:"+year+"/대여여부:"+borrowed);
	}
}
