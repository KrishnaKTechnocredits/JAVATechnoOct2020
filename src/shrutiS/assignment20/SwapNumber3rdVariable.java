/*Program : 1 
swap 2 numbers with using 3rd variable*/

package shrutiS.assignment20;

public class SwapNumber3rdVariable {
	int temp;
	void printSwapNumber(int x, int y) {
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After swap");
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}

	public static void main(String[] args) {
		SwapNumber3rdVariable swapNumber = new SwapNumber3rdVariable();
		swapNumber.printSwapNumber(10,20);
	}
}
