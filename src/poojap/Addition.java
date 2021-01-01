/*Program - 4: 
Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String*/
package poojap;

public class Addition {
	void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Addition Is : " + sum);
	}

	void add(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println("Addition Is : " + sum);
	}

	void add(String string1, String string2) {
		String string = string1 + string2;
		System.out.println("Addition Is : " + string);
	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.add(15, 20);
		addition.add(5.7, 10.9);
		addition.add("Techno", "Credit");
	}
}
