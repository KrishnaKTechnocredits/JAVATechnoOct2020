/*Create a class Book having Title, Book Publisher, Author with parameterized constructor using this keyword.
 * Write a method to display the details of the Book and Test the class by creating objects. */

package vishakha.Asgnmt39;

public class Book {
	
	String bookTitle, bookPublisher, author;
	
	public Book(String bookTitle, String bookPublisher, String author) {
		this.bookTitle = bookTitle;
		this.bookPublisher = bookPublisher;
		this.author = author;
	}
	
	void display(){
		System.out.println("Details of the book are :");
		System.out.println("Title "+bookTitle+ " \nPublisher : "+bookPublisher+ " \nAuthor : "+author);
	}

	public static void main(String[] args) {
		Book book = new Book("StayFit", "Chetna", "Ravi Verma");
		book.display();
		System.out.println("------------------------------------------------------");
		Book book1 = new Book("Five Point Someone", "Jyoti Books", "Chetan Bhagat");
		book1.display();
	}
}
