package raghvendra.NumberOperations;
/*Assignment - 38 : 11th Dec'2020 
Verify number is in Fibonacci series or not*/
public class VerifyFibonacci {
	int sum;
	void FindFibonacci(int number) {
		int number1=0;
		int number2=1;
		if(number==number1 || number==number2)
			System.out.println(number+" is a Fibonacci number");
		while(sum<number) {
			sum=number1+number2;
			number1=number2;
			number2=sum;
		}
		if(sum==number) {
			System.out.println(number+" is a Fibonacci number");
		}
		else
			System.out.println(number+" is not a Fibonacci number");
	}
	public static void main(String[] args) {
		VerifyFibonacci verifyFibonacci=new VerifyFibonacci();
		int number=9;
		verifyFibonacci.FindFibonacci(number);
		new VerifyFibonacci().FindFibonacci(10);
		new VerifyFibonacci().FindFibonacci(8);
	}
}
