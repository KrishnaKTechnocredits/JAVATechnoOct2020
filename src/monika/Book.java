package monika;
/* Assignment 39
Program - 3:
Create a class Book having Title, Book Publisher, 
Author with parameterized constructor using this keyword. 
Write a method to display the details of the Book and 
Test the class by creating objects.
*/


public class Book {
	String title, bookPubllisher, author;

	public Book(String title, String bookPubllisher, String author) {
		this.title = title;
		this.bookPubllisher = bookPubllisher;
		this.author = author;
	}

	void display() {
		
	    System.out.println("Book Title : " + title);
		System.out.println("Book Publisher : " + bookPubllisher);
		System.out.println("Book Author : " + author);
	}

	public static void main(String[] args) {
		Book book1 = new Book("javaedition ", "monikaco", "monika sethi");
		book1.display();
		Book book2 = new Book("sql", "monikaco", "allen");
		book2.display();
	}
}