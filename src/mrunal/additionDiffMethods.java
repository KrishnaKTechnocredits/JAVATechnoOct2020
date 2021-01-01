package mrunal;
/*Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String*/

public class additionDiffMethods {

	void add(int num1,int num2) {
		int ans = num1 + num2;
		System.out.println(+ num1 + " + " + num2 + " = "+ ans);
	}

	void add(double num1,double num2) {
		double ans = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = "+ ans);
	}

	void add(String s1, String s2) {
		String ans = s1 + s2;
		System.out.println( ans);
	}

	public static void main (String[]arg) {
		additionDiffMethods AdditionDiffMethods = new additionDiffMethods();
		AdditionDiffMethods.add(100 , 200);
		AdditionDiffMethods.add(100.05, 200.50);
		AdditionDiffMethods.add("Narendra","Modi");
	}

}