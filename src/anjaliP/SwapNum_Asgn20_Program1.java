package anjaliP;

public class SwapNum_Asgn20_Program1 {
	static void swapNumbers(int i, int j) 
	{
		System.out.println("Before swapping I = "+i+", J = "+j);
		int temp =i;
		i=j;
		j=temp;
		System.out.println("After swapping I= "+i+",J = "+j);
	}
	public static void main(String[] args) {
		new SwapNum_Asgn20_Program1();
		SwapNum_Asgn20_Program1.swapNumbers(20, 30);
	}	
}
