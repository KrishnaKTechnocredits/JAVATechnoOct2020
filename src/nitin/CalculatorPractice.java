package nitin;
class CalculatorPractice{
	int a=100;
	int b=5;
	int result;
	
	void addition(){
		result =a+b;
		System.out.println("Addition is "+result);
	}
	void substraction(){
		result =a-b;
		System.out.println("Substraction is "+result);
	}
	void multiplication(){
		result =a*b;
		System.out.println("Multiplication is "+result);
	}
	void division(){
		result =a/b;
		System.out.println("Division is "+result);
	}
	
	public static void main(String[] args){
		CalculatorPractice calculatorpractice = new CalculatorPractice();
		calculatorpractice.addition();
		calculatorpractice.substraction();
		calculatorpractice.multiplication();
		calculatorpractice.division();
	}
	
}