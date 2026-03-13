package library;

public interface Manageable {
	public void add(Book book);
	public void remove(String title);
	public Book find(String title);
	public void printAll();	
}
