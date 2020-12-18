package vaibhav.assignment39;

/*Program - 3: 
Create a class Book having Title, Book Publisher, Author with parameterized constructor using this keyword. Write a method to display the details of the Book and Test the class by creating objects. 

*/
public class Book {
	
	String title;
	String bookPublisher;
	String author;
	
	Book(String title,String bookPublisher,String author){
		this.title = title;
		this.bookPublisher = bookPublisher;
		this.author = author;	
	}
	
	void display() {
		System.out.println("Book title is "+title+"Book Publisher is "+bookPublisher+" and author is "+author);
	}

	public static void main(String[] args) {
		Book book = new Book("Java", "TechnoCredits", "Maulik");
		book.display();
	}
}
