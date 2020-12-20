package brijesh.assignment39;

public class Book {
	String title;
	String bookPublisher;
	String author;
	public Book(String title, String bookPublisher, String author) {
		this.title=title;
		this.bookPublisher=bookPublisher;
		this.author=author;
	}
	
	public void displayBookDetails() {
		System.out.println("Book Title: "+title+", Book Publisher: "+bookPublisher+", Book Author: "+author);
	}

	public static void main(String[] args) {
		Book book1 = new Book("The Other Side of the Sky", "Amazon", "Amie Kaufman");
		Book book2 = new Book("2 States", "Amazon", "Chetan Bhagat");
		book1.displayBookDetails();
		book2.displayBookDetails();
	}
}
