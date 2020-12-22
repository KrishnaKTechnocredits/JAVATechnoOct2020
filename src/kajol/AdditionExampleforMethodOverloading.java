/*Program - 4: 
Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String*/

package kajol;

public class AdditionExampleforMethodOverloading {
	
	void add(int num1, int num2) {
		System.out.println("Addition of integers "+num1+" and "+num2+"  equals to : "+(num1+num2));
		System.out.println();
	}
	
	void add(double num1, double num2) {
		System.out.println("Addition of  decimal numbers "+num1+" and "+num2+"  equals to : "+(num1+num2));
		System.out.println();
	}
	
	void add(String s1, String s2) {
		System.out.println("Concatenation of  Strings "+s1+" and "+s2+"  equals to : "+s1+s2);
		System.out.println();
	}

	public static void main(String[] args) {
		AdditionExampleforMethodOverloading example1= new AdditionExampleforMethodOverloading();
		example1.add(4, 5);
		example1.add(4.5, 5.5);
		example1.add("Techno", "Credits");
	}
}
