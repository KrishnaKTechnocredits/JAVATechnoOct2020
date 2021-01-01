package prasad.constructors;
/*Program - 3:
Create a class Book having Title, Book Publisher, Author with parameterized constructor using this keyword. 
Write a method to display the details of the Book and Test the class by creating objects.*/
public class Book {
	String bookTitle;
	String publisher;
	String authorName;
	
	Book(String bookTitle, String publisher, String authorName){
		this.bookTitle=bookTitle;
		this.publisher=publisher;
		this.authorName=authorName;
		 displayBookDetails();
	}
	
	void displayBookDetails() {
		System.out.println("Book Details");
		System.out.println("=======================");
		System.out.println("Book Title: "+ bookTitle);
		System.out.println("Publisher: "+ publisher);
		System.out.println("Author Name: "+ authorName);
	}
	
	public static void main(String[]arg) {
		Book book = new Book ("Harry Potter", "Bloomsbury","JK Rowling");
	}

}
