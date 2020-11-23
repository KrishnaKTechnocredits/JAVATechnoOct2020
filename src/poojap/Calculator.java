package poojap;

public class Calculator {
	
	void add(int num1, int num2) {
		
		int ans =num1+num2;	
		System.out.println("Addition is : " +ans);
	}
	void sub(int num1, int num2) {
		
		int ans =num1-num2;	
		System.out.println("subtraction is : " +ans);
	}
	void mul(int num1,int num2) {
		
		int ans =num1*num2;
		System.out.println("Multiplication is : " +ans);
	}
	void div(int num1,int num2) {
		
		int ans =num1/num2;
		System.out.println("Division is : " +ans);
	}
	
	public static void main(String[] args) {
		
		Calculator calculator=new Calculator();
		calculator.add(10, 20);
		calculator.sub(20, 10);
		calculator.mul(20, 15);
		calculator.div(12, 3);
	}
}
