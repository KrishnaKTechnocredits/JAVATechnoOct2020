package anjaliP;

public class SwapNum_Asgn20_Prog2 {
	void swapNumbers(int x, int y) {
		System.out.println("Before swapping x: "+x+", y: "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping x: "+x+", y: "+y);
	}
	public static void main(String[] args) {
		SwapNum_Asgn20_Prog2 swapNum = new SwapNum_Asgn20_Prog2();
		swapNum.swapNumbers(30, 60);
	}
}
