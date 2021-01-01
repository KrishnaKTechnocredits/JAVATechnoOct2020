package shrutiC.assignment39;

public class Addition {

	void add(int num1, int num2) {
		System.out.println("Addition of " + num1 + " and " + num2 + " : " + (num1 + num2));
	}

	void add(double num1, double num2) {
		System.out.println("Addition of " + num1 + " and " + num2 + " : " + (num1 + num2));
	}

	void add(String string1, String string2) {
		System.out.println("Addition of " + string1 + " and " + string2 + " : " + string1 + string2);
	}

	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.add(26, 5);
		obj.add(10.52, 20.64);
		obj.add("Shruti", "Chavan");
	}

}
