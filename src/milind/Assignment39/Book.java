package milind.Assignment39;

import java.util.Scanner;

public class Book {
	
	String bookTitle, bookAuthor, bookPublisher;
	
	Book(String bookTitle, String bookAuthor, String bookPublisher){
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
	}
	
	void displayBookDetails() {
		System.out.println("Book Title : " + bookTitle);
		System.out.println("Book Author : " + bookAuthor);
		System.out.println("Book publisher : " + bookPublisher);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter book title : ");
		String title = scanner.nextLine();
		System.out.println("Enter book Author : ");
		String author = scanner.nextLine();
		System.out.println("Enter book publisher : ");
		String publisher = scanner.nextLine();
		Book book = new Book(title, author, publisher);
		book.displayBookDetails();
		scanner.close();
	 }
}
