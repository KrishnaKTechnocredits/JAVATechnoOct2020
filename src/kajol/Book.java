/*Program - 3: 
Create a class Book having Title, Book Publisher, Author with parameterized constructor using this keyword. 
Write a method to display the details of the Book and Test the class by creating objects. 
*/

package kajol;

public class Book {
	
	String title,publisher,author;
	
	Book(String  title,String publisher,String author){
		this.title=title;
		this.publisher=publisher;
		this.author=author;
	}
	
	void displayBookDetails() {
		System.out.println("-----------------------Book Details-------------------");
		System.out.println("Book Title : "+title);
		System.out.println("Book Publisher : "+publisher);
		System.out.println("Book Author : "+author);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Book book=new Book("XYZ","PQR","MNO");
		Book book1=new Book("xyz","pqr","mno");
		book.displayBookDetails();
		book1.displayBookDetails();
	}
}
