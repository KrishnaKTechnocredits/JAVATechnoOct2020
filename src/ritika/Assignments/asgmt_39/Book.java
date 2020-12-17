package ritika.Assignments.asgmt_39;

/*Program - 3:
Create a class Book having Title, Book Publisher, Author with parameterized constructor using this keyword. Write a method to display the details of the Book and Test the class by creating objects.
*/
public class Book {

	String title, bookPublisher, author;

	Book(String title, String bookPublisher, String author) {
		this.title = title;
		this.bookPublisher = bookPublisher;
		this.author = author;
	}

	void displayBookDetails() {
		System.out.println("Book title is: " + title);
		System.out.println("Publisher of the book is: " + bookPublisher);
		System.out.println("Author of the book is: " + author);
	}

	public static void main(String[] args) {
		new Book("The Immortals of Meluha", "Westland Press", "Amish Tripathi").displayBookDetails();
		System.out.println("==============================================================================");
		new Book("Five Point Someone", "Rupa & Co.", "Chetan Bhagat").displayBookDetails();
	}
}
