package library;

public class Library implements Manageable{
	//필드
	private Book[] books =new Book[100];
	private int count =0;
	
	//생성자
	public Library() {}
	
	//메서드
	@Override
	public void add(Book book) {
		for(int i=0;i<books.length;i++) {
			if(books[i] == null) {
				books[i]=book;
				count++;
				break;
			}
		}
	}
	public void remove(String title) {
		for(int i=0;i<books.length;i++) {
			if(books[i].getTitle().equals(title)) {
				books[i]=null;
				count--;
				//빈 배열 생기면 앞으로 땡기기?
				for(int j=i;j<books.length;j++) {
					books[j]=books[j+1];
				}
				break;
			}
		}
		
	}
	public Book find(String title) {
	    for (int i = 0; i < books.length; i++) {
	        if (books[i] != null && books[i].getTitle().equals(title)) {
	            System.out.println(books[i]);
	        	return books[i];
	        }
	    }
	    System.out.println("찾으시는 책이 없습니다.");
	    return null;
	}

	public void printAll() {
		for(int i=0;i<books.length;i++) {
			System.out.print("전체 책 목록 출력:");
			if(books[i] != null) {
				System.out.println(books[i]);
			}
			
		}
		
	}
	

}
