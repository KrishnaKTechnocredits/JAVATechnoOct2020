package prem;

//Java Assignment 1  Date : 19th Oct 2020 - Completed on 22nd Oct 2020
//Requirement : Write a Calculator program to perform addition, substraction, division  & multiplication of number
//Note - Apply parametrized methods only 

class Calculator{

		int result;                                     //result is a variable of type int to hold calculated values  
		
		void addition(int num1, int num2){
			result = num1 + num2;
			System.out.println("addition of value = " + result);
		}
		
		void substraction(int num1, int num2){
			result = num1 - num2;
			System.out.println("subtraction of value = " + result);
		}
		
		void division(int num1, int num2){
			result = num1 / num2;
			System.out.println("division of value = " + result);
		}
		
		void multiplication(int num1, int num2){
			result = num1 * num2;
			System.out.println("multiplication of value = " + result);
		}
		
		public static void main(String[] a){
			Calculator calculator = new Calculator();     //Object creation of class Calculator
			calculator.addition(2,3);                     //Call method addition
			calculator.substraction(2,3);                 //Call method substraction
			calculator.division(2,3);                     //Call method division
			calculator.multiplication(2,3);               //Call method multiplication
		}	
}

