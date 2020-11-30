package rohit;

public class Returnconcept {
	double sum(double num1, double num2, double num3) {
		double answer1=(num1 + num2 + num3);
		return answer1;
	}

	double average(double num1, double num2, double num3) {
		double answer2=sum(num1, num2, num3) / 3;
		return answer2;
	}

	static boolean isAnswerAboveExpectation(double answer2) {
		if (answer2 > 50)
			return true;
		else
			return false;
	}

	static boolean isEligible(double answer2) {
		if (answer2 > 50 || answer2 % 2 == 0)
			return true;
		else
			return false;
	}

	static String getYourGrade(double answer2) {
		if (answer2 > 80)
			return "A Grade";
		else
			return "B Grade";
	}

	public static void main(String[] args) {
		Returnconcept returnconcept = new Returnconcept();
		double average = returnconcept.average(85, 76, 80);
		System.out.println("Average Is: " + average);
		System.out.println("Is your average above expectation? " + isAnswerAboveExpectation(average));
		System.out.println("Are you eligible? " + isEligible(average));
		System.out.println("Grade Is : " + getYourGrade(average));
	}

}