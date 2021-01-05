/*Assignment - 39
Program - 4: 
Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String*/

package shrutiS.assignment39;

public class Addition {

	public void add(int num1, int num2) {
		System.out.println("Addition of  " + num1 + " &  " + num2 + " is " + (num1 + num2));
	}

	public void add(double num1, double num2) {
		System.out.println("Addition of  " + num1 + " & " + num2 + " is " + (num1 + num2));
	}

	public void add(String str1, String str2) {
		System.out.println("Addition of  " + str1 + " &  " + str2 + " is " + str1 + str2);
	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.add(10, 20);
		addition.add(10.10, 20.20);
		addition.add("Techno", "Credits");
	}
}
