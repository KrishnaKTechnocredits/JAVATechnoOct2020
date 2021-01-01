package anjaliS;

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
		Book book = new Book("2 States", "Rupa Publications Pvt. Ltd", "chetan bhagat");
		book.display();

	}

}
