package suresh;
/*Program - 3: 
Create a class Book having Title, Book Publisher, Author with parameterized constructor 
using this keyword. Write a method to display the details of the Book and Test the class by 
creating objects.*/ 
public class Book {
	//String Title = "The Alchemist", BookPublisher= "HarperCollins", Author = "Paulo coelho ";
	String Title,BookPublisher,Author;
	
	void BookDetails(String Title,String BookPublisher,String Author) {
		this.Title = Title;
		this.BookPublisher = BookPublisher;
		this.Author = Author;
		System.out.println("<==================>Book Details<==================>");
		System.out.println("Book Tile is : " +Title);
		System.out.println("Book Publisher is : " +BookPublisher);
		System.out.println("Author of the Book is : " +Author);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.BookDetails("The Alchemist","HarperCollins","Paulo coelho ");
	}

}
