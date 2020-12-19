//Program - 3: Create a class Book having Title, Book Publisher, Author with parameterized constructor using this keyword. Write a method to display the details of the Book and Test the class by creating objects. 
package priya;

public class Book {

		String title;
		String publisherName;
		String author;

		Book(String title, String publisherName, String author) {
			this.title = title;
			this.publisherName = publisherName;
			this.author = author;
		}

		void display() {
			System.out.println(title);
			System.out.println(publisherName);
			System.out.println(author);

		}

		public static void main(String[] args) {
			Book book = new Book("Ranji the music maker", "Rupa Publications India Pvt Ltd", "Ruskin Bond");
			book.display();

		}

}
