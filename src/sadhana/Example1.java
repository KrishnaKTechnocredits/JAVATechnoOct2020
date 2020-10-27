package sadhana;

public class Example1 {

	void processData(int marks) {
		if (marks >= 90)
			System.out.println("Excellent");
		else if (marks >= 80)
			System.out.println("Good job");
		else if (marks >= 70)
			System.out.println("---Average---");
		else
			System.out.println("Fail");
	}

	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.processData(78);
	}
}
