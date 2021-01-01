package nagendra.assignment39;

/*
Program - 3: 
Create a class Book having Title, Book Publisher, Author with parameterized constructor using this keyword. 
Write a method to display the details of the Book and Test the class by creating objects
. 
*/

public class Book {

	String bookTitle;
	String bookPublisher;
	String bookAuthor;

	public Book(String title, String publisher, String author) {
		this.bookTitle = title;
		this.bookPublisher = publisher;
		this.bookAuthor = author;
	}

	void displayDetails() {
		System.out.println("Title of book :" + bookTitle);
		System.out.println("Publisher of book :" + bookPublisher);
		System.out.println("Author of book :" + bookAuthor);
	}

	public static void main(String[] args) {
		Book book=new Book("Java", "TECHNOCREDITS", "Nagendra");
		book.displayDetails();
	}
}
