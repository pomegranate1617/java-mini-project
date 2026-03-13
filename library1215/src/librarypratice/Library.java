package librarypratice;

public class Library implements Manageable{
	//필드
	private Book[] books = new Book[100];
	private int count = 0;
	
	//생성자
	public Library() {}
	
	//메서드
	public void add(Book book) {
		books[count] =book;
		count++;
	}
	
	public void remove(String title) {
	
			for(int i=0;i<count;i++) {
				if(books[i].getTitle().equals(title)) {
					books[i] = null;
					count--;
					for(int j=i;j<count;j++) {
						books[j]=books[j+1];
					}
					break;
				}
				if(++i == count) {
					System.out.println("해당 책은 등록되어있지 않아 삭제할 수 없습니다.");
					break;
				}
				
				
				
				
				
				
				
				
				
				
				
			}
			
	}
	//?
	public Book find(String title) {
		try {
			for(int i=0;i<count;i++) {
				if(books[i].getTitle().equals(title)) {
					return books[i];
				}	
			}
			return null;
		}
		catch(Exception e){
			return null;
		}
	}
	
	public void printAll() {
		for(int i=0;i<count;i++) {
			System.out.println(books[i]);
		}
	}

}
