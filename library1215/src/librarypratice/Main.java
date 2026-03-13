package librarypratice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();
		Scanner sc = new Scanner(System.in);
		
		Book book1 = new Book("가","김가가",2025);
		Book book2 = new Book("나","김나나",2024);
		EBook eBook1 = new EBook("다","김이다",2023,344.3,"pdf");
		EBook eBook2 = new EBook("라","김이라",2022,124.7,"epub");
		
		library.add(book1);
		library.add(book2);
		library.add(eBook1);
		library.add(eBook2);
		
		System.out.println("대여하실 책 이름을 입력하세요.");
		String findBook=sc.nextLine();
		try {
			library.find(findBook).borrow();	
		}catch(BorrowException e){
			
			System.out.println(findBook+"다시 대여 시도...");
			System.out.println(e.getMessage());
			
		}
		
		finally {
			library.remove("다");
			System.out.println("전체 책 목록 출력:");
			library.printAll();
		}

	}

}
