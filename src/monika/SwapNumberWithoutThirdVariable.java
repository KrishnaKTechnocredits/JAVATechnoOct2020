package monika;
/*Assignment-20 :
Program : 2
swap 2 numbers without using 3rd variable

*/

public class SwapNumberWithoutThirdVariable {

	public static void swap(int x, int y) {
		x = x + y -x;
		y = y + x -y;
		System.out.println("Value of X: " +x+" Value of Y: "+y);		
	}

	public static void main(String[] args) {		
		int x = 20;
		int y = 50;		
		SwapNumberWithThirdVariable.swap(x,y);
	}

}