package shrutiC;

public class Calculator {

	double sum(double num1, double num2, double num3) {
		double ans;
		return ans = num1 + num2 + num3;

	}

	double average(double num1, double num2, double num3) {
		double ans = sum(num1, num2, num3) / 3;
		return ans;

	}

	static boolean isAnswerAboveExpecation(double average) {
		if (average > 50)
			return true;
		else
			return false;
	}

	static boolean isEligible(double average) {
		if (average > 50 || average % 2 == 0)
			return true;
		else
			return false;
	}

	static String getYourGrade(double average) {
		if (average > 80)
			return "A";
		else
			return "B";
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		double average = calc.average(90, 80, 72);
		System.out.println("Average marks : " + average);
		System.out.println("Is average above expectation : " + isAnswerAboveExpecation(average));
		System.out.println("Is Candidate eligible : " + isEligible(average));
		System.out.println("Grade : " + getYourGrade(average));
}
}
