/*Program - 3: 
Create a class Book having Title, Book Publisher, Author with parameterized constructor using this keyword. 
Write a method to display the details of the Book and Test the class by creating objects. 
*/
package poojap;

public class Book {
	String bookTitle, bookPublisher, bookAuthor;

	Book(String bookTitle, String bookPublisher, String bookAuthor) {
		this.bookTitle = bookTitle;
		this.bookPublisher = bookPublisher;
		this.bookAuthor = bookAuthor;
	}

	void display() {
		System.out.println("Book Title :" + bookTitle + "\n" + "BookPublisher: " + bookPublisher + "\n" + "BookAuthor: "
				+ bookAuthor);
	}

	public static void main(String[] args) {
		Book book = new Book("The Secret", "Atria Books", "Rhonda Byrne");
		book.display();
	}
}
