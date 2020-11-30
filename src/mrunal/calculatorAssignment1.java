package mrunal;

public class calculatorAssignment1 {

	void Calculator (int x , int y)
	{
		int total= x + y ;
		System.out.println("Addition of the two number is : " + total );
		
		int total1=x-y;
		System.out.println("Subtraction of the two number is : " + total1 );
		
		int total2= x * y ;
		System.out.println("Multiplication of the two number is : " + total2 );
		
		int total3= x / y ;
		System.out.println("Division of the two number is : " + total3 );

		
	}
public static void main (String[]args ) {
	calculatorAssignment1 a = new calculatorAssignment1();
	a.Calculator(5,5);
}
}
