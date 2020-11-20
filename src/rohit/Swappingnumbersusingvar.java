package rohit;

public class Swappingnumbersusingvar {

	public void swap(int x, int y) {
		System.out.println("Provided numbers x- " + x + " y- " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("On swapping x- " + x + "  y- " + y);
	}

	public static void main(String[] args) {
		Swappingnumbersusingvar swappingnumbersusingvar = new Swappingnumbersusingvar();
		swappingnumbersusingvar.swap(50, 100);
	}
}
