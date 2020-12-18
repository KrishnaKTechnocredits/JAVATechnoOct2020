package nandini.constructorProgs;

public class Book {
   
	String bookTitle;
	String bookAuthor;
	String bookPublisher;
	
	public Book(String bookTitle,String bookAuthor,String bookPublisher) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
	}
	void displayBookDetails() {
		System.out.println("Book Title is: " +bookTitle+ " Book Author is: "+bookAuthor+ " Book Publisher is: "+bookPublisher);
	}
	public static void main(String args[]) {
		Book book = new Book("The Kite Runner","Khaled Hosseini","RiverHead Books");
		book.displayBookDetails();
	}
	
}
