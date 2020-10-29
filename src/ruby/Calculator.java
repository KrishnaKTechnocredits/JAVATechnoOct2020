package ruby;

//Calculator: four method 2variable

class Calculator{
	int num1 = 10000;
	int num2 = 4000;
	int result;
	
	void addition(){
		result = num1 + num2;
		System.out.println("Addition: " + result);
	}
	
	void subtraction(){
		result = num1 - num2;
		System.out.println("Subtraction: " + result);
	}
	
	void multiplication(){
		result = num1 * num2;
		System.out.println("Multiplication: " + result);
	}	
	
	void division(){
		result = num1 / num2;
		System.out.println("Division: " + result);
	}
	
	public static void main(String[] a){
			Calculator calculator = new Calculator();
			calculator.addition();
			calculator.subtraction();
			calculator.multiplication();
			calculator.division();
	}

}
