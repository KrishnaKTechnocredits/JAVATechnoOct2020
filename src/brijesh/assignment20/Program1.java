package brijesh.assignment20;

//swap 2 numbers with using 3rd variable

public class Program1 {
	
	public void swapNumbers(int x, int y) {
		System.out.println("Before swapping x: "+x+", y: "+y);
		int temp =x;
		x=y;
		y=temp;
		System.out.println("After swapping x: "+x+", y: "+y);
	}

	public static void main(String[] args) {
		new Program1().swapNumbers(10, 20);
	}
}
