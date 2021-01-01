package mrunal;
/*Program - 3:
Create a class Book having Title, Book Publisher, Author with 
parameterized constructor using this keyword. 
Write a method to display the details of the Book and Test the class
by creating objects.*/

public class Book {
	String bookTitle;
	String bookPublisher;
	String bookAuthorName;

	Book(String bookTitle, String bookPublisher, String bookAuthorName){
		this.bookTitle=bookTitle;
		this.bookPublisher=bookPublisher;
		this.bookAuthorName=bookAuthorName;
		 displayBookDetails();
	}

	void displayBookDetails() {
		System.out.println("Details of books are :");
		System.out.println("Book Title: "+ bookTitle);
		System.out.println("Book Publisher: "+ bookPublisher);
		System.out.println("Book Author Name: "+ bookAuthorName);
	}

	public static void main(String[]arg) {
		Book book = new Book ("Mathematics2","Nirali Publications", "Manoj Chaudhari");
	}

}