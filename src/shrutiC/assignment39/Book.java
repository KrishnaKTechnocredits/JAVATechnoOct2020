package shrutiC.assignment39;

public class Book {

	String bookTitle;
	String bookPublisher;
	String author;

	Book(String bookName, String bookPublisher, String author) {
		this.author = author;
		this.bookPublisher = bookPublisher;
		this.bookTitle = bookName;
	}

	void displayBookDetails() {
		System.out.println("Book Title : " + bookTitle);
		System.out.println("Author : " + author);
		System.out.println("Book Publisher : " + bookPublisher);
		
	}
	
	public static void main(String[] args){
		Book book = new Book("Rich Dad Poor Dad","Warner books","Robert Kiyosaki");
		book.displayBookDetails();
	}
}
