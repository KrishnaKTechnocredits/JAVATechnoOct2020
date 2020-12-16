/*
 Program - 4: 
Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String
 */

package yogita;

public class Addition {

	void addition(int num1, int num2) {
		int add = num1 + num2;
		System.out.println("Addition of Integer is:" + add);

	}

	void addition(double num1, double num2) {
		double add = num1 + num2;
		System.out.println("Addition of Decimal is:" + add);
	}

	void addition(String str1, String str2) {
		String add = str1 + str2;
		System.out.println("Addition of String is:" + add);

	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.addition(2, 4);
		addition.addition(3.15, 4.10);
		addition.addition("Techno", "Credits");
	}

}
