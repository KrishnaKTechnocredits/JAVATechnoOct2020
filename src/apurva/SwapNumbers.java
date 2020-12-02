package apurva;

//swap 2 strings withS using 3rd variable
public class SwapNumbers {
	void swapNum(int x, int y) {
		System.out.println("Numbers Before Swapping x: " + x + ", Y: " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("Numbers After Swapping x: " + x + ", Y: " + y);
	}

	public static void main(String[] args) {
		SwapNumbers swapnumbers = new SwapNumbers();
		swapnumbers.swapNum(9, 12);
	}
}