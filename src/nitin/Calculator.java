package nitin;
class Calculator{
	int a = 10;
	int b = 2;
	int ans;
	
	void add(){
		ans = a + b;
		System.out.println("Addition is " + ans);
	}
	
	void sub(){
		ans = a - b;
		System.out.println("Subtraction is " + ans);
	}
	
	void mul(){
		ans = a * b;
		System.out.println("Multiplication is " + ans);
	}
	
	void div(){
		ans = a / b;
		System.out.println("Division is " + ans);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}
}