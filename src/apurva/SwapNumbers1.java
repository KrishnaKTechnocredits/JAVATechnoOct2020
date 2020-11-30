package apurva;

//swap 2 numbers without using 3rd variable
public class SwapNumbers1 {
	void swapNum(int x, int y) {
		System.out.println("Numbers Before Swapping x: " + x + ", Y: " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Numbers After Swapping x: " + x + ", Y: " + y);
	}
	public static void main (String[] args) {
		SwapNumbers1 swapnumbers1 = new SwapNumbers1();
		swapnumbers1.swapNum(36, 9);
	}
}