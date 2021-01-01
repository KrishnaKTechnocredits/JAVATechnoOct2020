package nitin.Assignment_39;
/* Program - 3: Create a class Book having Title, Book Publisher, Author with parameterized constructor using this keyword. 
Write a method to display the details of the Book and Test the class by creating objects. */
public class Book {
	String Title;
	String BookPublisher;
	String Author;
	Book(String Title, String BookPublisher, String Author){
		this.Title=Title;
		this.BookPublisher=BookPublisher;
		this.Author=Author;
	}
	void display() {
		System.out.println("Book :: "+Title+", Author :: "+Author+", BookPublisher :: "+BookPublisher);
	}
	public static void main(String[] args) {
		Book book = new Book("Sapiens","Dvir","Harari");
		Book book1= new Book("Malgudi Days","Indian","R.K. Narayan");
		book.display();
		book1.display();
	}
}
