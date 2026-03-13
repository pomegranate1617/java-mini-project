package librarypratice;

public class EBook extends Book{
	//필드
	public double fileSize;
	public String format;
	
	//생성자
	public EBook(String title,String author,int year,boolean borrowed,double fileSize,String format) {
		super(title,author,year,borrowed);
		this.fileSize =fileSize;
		this.format = format;
	}
	public EBook(String title,String author,int year,double fileSize,String format) {
		super(title,author,year,false);
		this.fileSize =fileSize;
		this.format = format;
	}
	
	//메서드
	@Override
	public void printInfo() {
		System.out.println("제목: "+ getTitle() + " /  저자:" + getAuthor() + " / 출판년도:" + getYear() + " / 대여여부:" + isBorrowed() + " /파일크기: "+ fileSize + " / 포맷: "+ format);
	}
	@Override
	public String toString() {
		 return "제목: "+ getTitle() + " /  저자:" + getAuthor() + " / 출판년도:" + getYear() + " / 대여여부:" + isBorrowed() + " /파일크기: "+ fileSize + " / 포맷: "+ format;
	}
}
