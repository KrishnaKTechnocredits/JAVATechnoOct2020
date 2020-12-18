package rohan.Assignment39;

/*
Program - 3: 
Create a class Book having Title, Book Publisher, Author with parameterized constructor using this keyword. 
Write a method to display the details of the Book and Test the class by creating objects. 
 */

public class Book {
	
	String title,publisher,author;
	
	Book(String title, String publisher, String author){
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	void display() {
		System.out.println("Book Title: "+title);
		System.out.println("Book Publisher: "+publisher);
		System.out.println("Book Author: "+author);
	}
	
	public static void main(String[] args) {
		Book book1 = new Book("1000 miles","RK publications","Khaled Houseni");
		book1.display();
		System.out.println("----------------------------");
		Book book2 = new Book("The 3 Mistakes","Nirali publications","Chetan Bhagat");
		book2.display();
		System.out.println("----------------------------");
		Book book3 = new Book("Two States","Oxford publications","Rohan Mahadik");
		book2.display();
	}
		
}
