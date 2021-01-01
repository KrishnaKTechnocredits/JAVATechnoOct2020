
/*Create a class Book having Title, Book Publisher, Author with parameterized constructor using this keyword. 
 * Write a method to display the details of the Book and Test the class by creating objects. */
package suvela.assignment39.prog3;

public class Book {
	
	Book(String title,String book_publisher, String author){
		System.out.println("Book title:"+title);
		System.out.println("Book publisher:"+book_publisher);
		System.out.println("Book author:"+author);
 }
	Book display() {
		return this;
	}
	public static void main(String[] args) {
		new Book("Becoming","Crown","Michelle Obama").display();
		System.out.println("------------");
		new Book("Harry potter","Bloomsbury","J.K.Rowling").display();
		System.out.println("------------");
		new Book("Game of thrones","Bantam Books","George R. R. Martin").display();

	}

}
