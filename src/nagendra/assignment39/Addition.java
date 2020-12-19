package nagendra.assignment39;

/*
Program - 4: 
Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String
*/

public class Addition {

	void add(int a, int b) {
		System.out.println("Addition of two integers: " + (a + b));
	}

	void add(double a, double b) {
		System.out.println("Addition of two doubles: " + (a + b));
	}

	void add(String a, String b) {
		System.out.println("Concatation of strings : " + (a + b));
	}

	public static void main(String[] args) {
		Addition add = new Addition();
		add.add(10, 20);
		add.add(0.5, 0.8);
		add.add("Test", "ing");
	}
}
