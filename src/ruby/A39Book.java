package ruby;
/*Program - 3: 
Create a class Book having Title, Book Publisher, Author with parameterized constructor using this keyword. 
Write a method to display the details of the Book and Test the class by creating objects. */

public class A39Book {
	String title, bookPublisher, author;

	A39Book(String title, String bookPublisher, String author) {
		this.title = title;
		this.bookPublisher = bookPublisher;
		this.author = author;
	}
	
	void displayBookDetails() {
		System.out.println("Title: "+title+ "\n BooK Publisher: "+bookPublisher+"\n Author "+author);
	}

	public static void main(String[] args) {
		A39Book book = new A39Book("Harry Potter", "Bloomsbury", "J K Rowling");
		book.displayBookDetails();
	}

}
