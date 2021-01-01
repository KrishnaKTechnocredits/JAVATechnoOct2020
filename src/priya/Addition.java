//Program - 4: Create a class Addition and write add method for:
//a) add two integers
//b) add two decimal
//c) add two String

package priya;

public class Addition {

	int add(int x, int y) {
		return (x + y);
	}

	double add(double x, double y) {
		return (x + y);
	}

	String add(String s1, String s2) {
		return (s1 + s2);
	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		System.out.println("Addition of two decimal numbers is: " + addition.add(7.55, 3.15));
		System.out.println("Addition of two whole numbers is: " + addition.add(30, 98));
		System.out.println("Addition of two Strings is: " + addition.add("Techno", "credits"));
	}
}
