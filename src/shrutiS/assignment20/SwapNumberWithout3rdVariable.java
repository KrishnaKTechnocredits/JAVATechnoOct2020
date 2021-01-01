/*Program : 2 
swap 2 numbers without using 3rd variable*/

package shrutiS.assignment20;

public class SwapNumberWithout3rdVariable {
	
	void printSwapNumber(int x, int y) {
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After swap");
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}

	public static void main(String[] args) {
		SwapNumber3rdVariable swapNumber = new SwapNumber3rdVariable();
		swapNumber.printSwapNumber(10,50);
	}
}
