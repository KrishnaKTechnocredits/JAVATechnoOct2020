//make the same calculator pgm without instance variable and make it parameterized
package nitin;
class CalculatorwithParameter{
	
	int result;
	
	void addition(int x,int y){
		result=x+y;
		System.out.println("Addition is "+result);
	}
	void substraction(int x,int y){
		result=x-y;
		System.out.println("Substraction is "+result);
	}
	void multiplication(int x,int y){
		result=x*y;
		System.out.println("Multiplication is "+result);
	}
	void division(int x,int y){
		result=x/y;
		System.out.println("Division is "+result);
	}
	public static void main(String[] a){
		CalculatorwithParameter calculatorwithParameter = new CalculatorwithParameter();
		
		calculatorwithParameter.addition(10,20); //30
		calculatorwithParameter.substraction(20,2); //18
		calculatorwithParameter.multiplication(10,20); //200
		calculatorwithParameter.division(20,2); //10
	}
}