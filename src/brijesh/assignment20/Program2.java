package brijesh.assignment20;

//swap 2 numbers without using 3rd variable

public class Program2 {
	
	public void swapNumbers(int x, int y) {
		System.out.println("Before swapping x: "+x+", y: "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping x: "+x+", y: "+y);
	}

	public static void main(String[] args) {
		new Program2().swapNumbers(10, 20);
	}
}
