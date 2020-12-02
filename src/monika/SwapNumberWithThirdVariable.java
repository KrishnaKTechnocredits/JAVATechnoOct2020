package monika;
/*Assignment-20 :

Program : 1
swap 2 numbers with using 3rd variable
*/

public class SwapNumberWithThirdVariable {

	public static void swap(int x, int y) {
		int temp = 0;		
		temp = x;
		x = y;
		y = temp;
		System.out.println("Value of X: " +x+" Value of Y: "+y);		
	}

	public static void main(String[] args) {
		int x = 10;
		int y = 30;		
		SwapNumberWithThirdVariable.swap(x,y);

	}

}