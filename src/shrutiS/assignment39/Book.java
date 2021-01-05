/*Assignment - 39 
Program - 3: 
Create a class Book having Title, Book Publisher, Author with parameterized constructor using this keyword. 
Write a method to display the details of the Book and Test the class by creating objects.*/

package shrutiS.assignment39;

public class Book {

	String bookTitle, bookPublisher, author;

	public Book(String bookTitle, String bookPublisher, String author) {
		this.bookTitle = bookTitle;
		this.bookPublisher = bookPublisher;
		this.author = author;
	}

	void display() {
		System.out.println("Details of the book are ");
		System.out.println("Title     : " + bookTitle + " \nPublisher : " + bookPublisher + " \nAuthor    : " + author);
	}

	public static void main(String[] args) {
		Book book = new Book("Five Points Someone", "Rupa Publications", "Chetan Bhagat");
		book.display();
	}
}
