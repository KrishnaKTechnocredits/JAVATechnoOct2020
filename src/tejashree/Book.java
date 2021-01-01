package tejashree;
/*
	Create a class Book having Title, Book Publisher, Author with parameterized constructor 
	using this keyword. 
	Write a method to display the details of the Book and Test the class by creating objects. 
	 
 */
public class Book {
	String title, bookPublisher, author;

	Book(String title, String bookPublisher, String author) {
		this.title = title;
		this.bookPublisher = bookPublisher;
		this.author = author;
	}
	void displayBookDetails() {
		System.out.println("Book Title:" + title + "\nBook Publisher:" + bookPublisher + "\nBy Author: " + author);
	}

	public static void main(String[] args) {
		Book bookDetails = new Book("BermudaTriangle", "ABC Ed", "Vijay Devdhar");
		System.out.println("Details Of Book");
		bookDetails.displayBookDetails();
		}

}
