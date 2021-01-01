package ruby;
/*Program - 4: 
Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String**/

public class A39Addition {
	
	void addInteger(int num1, int num2) {
		System.out.println("Addition of Integer: "+(num1+num2));
	}
	
	void addDecimal(double num1, double num2) {
		System.out.println("Addition of Decimal: "+(num1+num2));
	}
	
	void addString(String str1, String str2) {
		System.out.println("Addition of Strings: "+(str1+str2));
	}

	public static void main(String[] args) {
		A39Addition addition = new A39Addition();
		addition.addInteger(15, 20);
		addition.addDecimal(10.20, 10.45);
		addition.addString("Techno", "Credits");
	}
}
