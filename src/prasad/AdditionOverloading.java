package prasad;
/*Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String*/

public class AdditionOverloading {
	
	void add(int number1,int number2) {
		int ans = number1+number2;
		System.out.println(+ number1 + "+" + number2 + " = "+ ans);
	}
	
	void add(double number1,double number2) {
		double ans = number1+number2;
		System.out.println(number1 + "+" + number2 + " = "+ ans);
	}
	
	void add(String s1, String s2) {
		String ans = s1+s2;
		System.out.println(s1 + "+" + s2 +" = "+ ans);
	}
	
	public static void main (String[]arg) {
		AdditionOverloading additionoverriding = new AdditionOverloading();
		additionoverriding.add(9,9);
		additionoverriding.add(1.90, 2.90);
		additionoverriding.add("Prasad","Chitale");
	}

}
