package brijesh;
class Calculator{
	void add(int num1, int num2){
		int answer = num1+num2;
		System.out.println("Addition is :"+answer);
	}
	
	void sub(int num1, int num2){
		int answer = num1-num2;
		System.out.println("Subtraction is :"+answer);
	}
	
	void div(int num1, int num2){
		int answer = num1/num2;
		System.out.println("Division is :"+answer);
	}
	
	void mul(int num1, int num2){
		int answer = num1*num2;
		System.out.println("Multiplication is :"+answer);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add(10,20);
		calculator.sub(10,20);
		calculator.div(10,20);
		calculator.mul(10,20);
	}
}