package anjaliP;

public class Calculator {
	void sum(int value1,int value2){
		int cal=value1+value2;
		System.out.println("Addition value is : "+cal);
	}
	void sub(int value1 , int value2) {
		 int cal = value1 - value2;
		 System.out.println("Substration value is : "+cal);
	}
	void div(int value1 , int value2) {
		int cal = value1/value2;
		System.out.println("Division value is : "+cal);
	}
	void mul(int value1 , int value2) {
		int cal=value1*value2;
		System.out.println("Multiplication value is : "+cal);
		}
	public static void main(String[]a) {
		Calculator calculator = new Calculator();
		calculator.sum(10,5);
		calculator.sub(10,5);
		calculator.div(10,5);
		calculator.mul(10,5);
	}
}
