/*Program - 3:
Create a class Book having Title, Book Publisher, 
Author with parameterized constructor using this keyword. 
Write a method to display the details of the Book and 
Test the class by creating objects.
*/
package ankita.assignment.constructor;

public class Book {
	String title, bookPubllisher, author;

	public Book(String title, String bookPubllisher, String author) {
		this.title = title;
		this.bookPubllisher = bookPubllisher;
		this.author = author;
	}

	void display() {
		System.out.println("=============");
		System.out.println("Book Title : " + title);
		System.out.println("Book Publisher : " + bookPubllisher);
		System.out.println("Book Author : " + author);
	}

	public static void main(String[] args) {
		Book book1 = new Book("Kosala", "Deshmukh and Company", "Bhalchandra Nemade");
		book1.display();
		Book book2 = new Book("The 5am Club", "HarperCollins", "Robin Sharama");
		book2.display();
	}
}
