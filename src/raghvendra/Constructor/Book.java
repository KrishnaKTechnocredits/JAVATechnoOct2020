package raghvendra.Constructor;
/*Program - 3: 
Create a class Book having Title, Book Publisher, Author with parameterized constructor using this keyword. 
Write a method to display the details of the Book and Test the class by creating objects*/
public class Book {
	String title;
	String bookPublisher;
	String authorName;
	
	Book(String title,String bookPublisher,String authorName){
		this.title=title;
		this.bookPublisher=bookPublisher;
		this.authorName=authorName;
	}
	void displayBookDetails() {
		System.out.println("Book Name: "+title);
		System.out.println("Book Publisher Name: "+bookPublisher);
		System.out.println("Book Author Name: "+authorName);
	}
	public static void main(String[] args) {
		Book book=new Book("A Day In Life", "Systems", "Sam Pitroda");
		book.displayBookDetails();
	}
}
