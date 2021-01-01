/*
 * Program - 3: 
Create a class Book having Title, Book Publisher, Author with parameterized constructor using this keyword. 
Write a method to display the details of the Book and Test the class by creating objects. 
 * 
 */

package deepak.assignment39;

public class Book {

	String title, bookPublisher, author;
	
	Book(String title, String bookPublisher, String author){
		
		this.title = title;
		this.bookPublisher = bookPublisher;
		this.author = author;
	}
	
	void displayDetails() {
		
		System.out.println("Book Name :"+ " "+ title);
		System.out.println("Book Publisher :"+ " "+ bookPublisher);
		System.out.println("Book Author:"+ " "+ author);
		
	}
	
	public static void main(String[] args) {
		
		Book refVar = new Book("Half Girlfriend", "Amazon", "Chetan Bhagat");
		refVar.displayDetails();
		
	}

}
