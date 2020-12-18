package prasad.constructors;

/*Test Class of class Book*/

public class BookTestClass extends Book {
	
	BookTestClass(){
		super("Harry Potter", "Bloomsbury","JK Rowling");
	}

	public static void main(String[]arg) {
		BookTestClass booktestclass = new BookTestClass();
		BookTestClass booktestclass1 = new BookTestClass();
		
	}
}
