package ruby;

//Calculator: four method 2variable

class Calculator{
	int result;
	
	void addition(int num1, int num2){
		result = num1 + num2;
		System.out.println("Addition: " + result);
	}
	
	void subtraction(int num1, int num2){
		result = num1 - num2;
		System.out.println("Subtraction: " + result);
	}
	
	void multiplication(int num1, int num2){
		result = num1 * num2;
		System.out.println("Multiplication: " + result);
	}	
	
	void division(int num1, int num2){
		result = num1 / num2;
		System.out.println("Division: " + result);
	}
	
	public static void main(String[] a){
			Calculator calculator = new Calculator();
			calculator.addition(100,400);
			calculator.subtraction(400,100);
			calculator.multiplication(400,100);
			calculator.division(400,4);
	}

}
