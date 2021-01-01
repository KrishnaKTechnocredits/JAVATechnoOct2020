package sadhana;

//Assignment_20 Swap 2 numbers with using 3rd variable

public class Swap2Numbers {
		public void printSwapedNumbers(int num1, int num2) {
		System.out.println("Before swapping num1: "+num1+", num2: "+num2);
		int temp=num1;
		num1=num2;
		num2=temp;	
		System.out.println("After swapping num1 & num2 :"+num1+","+num2);
	}

	public static void main(String[] args) {
		Swap2Numbers swap2Numbers=new Swap2Numbers();
		swap2Numbers.printSwapedNumbers(50, 20);
		
	}
}