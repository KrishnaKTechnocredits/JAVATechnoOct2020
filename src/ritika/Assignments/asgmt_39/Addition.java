package ritika.Assignments.asgmt_39;

/*Program - 4:
Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String
*/
public class Addition {

	int add(int num1, int num2) {
		return (num1 + num2);
	}

	double add(double num1, double num2) {
		return (num1 + num2);
	}

	String add(String s1, String s2) {
		return (s1 + s2);
	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		System.out.println("Sum of given decimal numbers is: " + addition.add(3.54, 1.16));
		System.out.println("Sum of given whole numbers is: " + addition.add(15, 78));
		System.out.println("Sum of given Strings is: " + addition.add("Techno", "Credits"));
	}
}
