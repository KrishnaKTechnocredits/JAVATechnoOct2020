package nitin.Assignment_39;
/* Program - 4: Create a class Addition and write add method for:
a) add two integers , b) add two decimal , c) add two String */
public class Addition {
	void intAdd(int num1, int num2) {
		int add=num1+num2;
		System.out.println("Addition of two integer numbers are "+add);
	}
	void decimalAdd(float num1,float num2) {
		float add=num1+num2;
		System.out.println("Addition of two decimal numbers are "+add);
	}
	void StringAdd(String str, String str2) {
		String add=str+str2;
		System.out.println("Addition of two Strings are "+add);
	}
	public static void main(String[] args) {
		new Addition().intAdd(10, 90);
		new Addition().decimalAdd(5.45f, 4.55f);
		new Addition().StringAdd("Nitin", " Jain");
	}
}
