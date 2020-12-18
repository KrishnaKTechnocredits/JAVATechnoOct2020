package Assignment39;

public class Book {
	
		String title, bookPublisher, author;

		Book(String title, String bookPublisher, String author) {
			this.title = title;
			this.bookPublisher = bookPublisher;
			this.author = author;

		}

		void display() {
			System.out.println("Book Title is :" + title + "\nBook Publisher:" + bookPublisher + "\n from Author : " + author);
		}

		public static void main(String[] args) {
			Book book = new Book("let us c", "K publisher", "Kanetkar");
			book.display();
		}

	}


