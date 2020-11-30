package rohan;

public class SwapNumbersStrings {

	void swapNumbersWithThirdVariable(int a,int b) {
		System.out.println("Original: a="+a+" b="+b);
		int temp = b;
		b = a;
		a = temp;
		System.out.println("Swapped: a="+a+" b="+b);
	}
	
	void swapNumbersWithoutThirdVariable(int a, int b) {
		System.out.println("Original: a="+a+" b="+b);
		a = (a+b)-a;
		b = (a+b)-b;
		System.out.println("swapped: a="+a+" b="+b);
	}
	
	public static void main(String[] args) {
		SwapNumbersStrings swp = new SwapNumbersStrings();
		System.out.println("Swap numbers without using third variable");
		swp.swapNumbersWithoutThirdVariable(10,20);
		System.out.println("Swap numbers using third variable");
		swp.swapNumbersWithThirdVariable(10,20);
	}
}
