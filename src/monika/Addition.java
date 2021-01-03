package monika;
/*Program - 4:
Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String
*/


public class Addition {
	public void add(int num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}

	public void add(float num1, float num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}

	public void add(String num1, String num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.add(5, 6);
		addition.add(3.5f, 5.0f);
		addition.add("techno", "Credit");
	}
}