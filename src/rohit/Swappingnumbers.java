package rohit;

//swap 2 numbers without using 3rd variable

public class Swappingnumbers {

	public void swap(int x, int y) {
		System.out.println("Provided numbers x- " + x + " y- " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("On swapping x- " + x + "  y- " + y);
	}

	public static void main(String[] args) {
		Swappingnumbers swappingnumbers = new Swappingnumbers();
		swappingnumbers.swap(55, 200);
	}
}