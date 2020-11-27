package nitin;
/* Assignment-20 : Program : 1 - Swap 2 numbers with using 3rd variable */
public class Swap1 {
	public void swapUsingVariable(int number1, int number2) {
		System.out.println("Before Swap --> A : "+number1+" and B : "+number2);
		int temp = number1;
		number1=number2;
		number2=temp;
		System.out.println("After Swap --> A : "+number1+" and B : "+number2);
	}
	public static void main(String[] args) {
		new Swap1().swapUsingVariable(10, 99);
	}
}
