package brijesh.assignment39;

public class Addition {

	public void add(int first, int second) {
		System.out.println("Addition of number1:"+first+" & number2:"+second+" is "+(first+second));
	}

	public void add(double first, double second) {
		System.out.println("Addition of number1:"+first+" & number2:"+second+" is "+(first+second));
	}

	public void add(String first, String second) {
		System.out.println("Addition of string1:"+first+" & string2:"+second+" is "+first+second);
	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.add(10, 20);
		addition.add(10.10, 20.20);
		addition.add("Techno", "Credits");
	}
}
