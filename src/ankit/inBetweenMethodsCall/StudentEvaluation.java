package ankit.inBetweenMethodsCall;

public class StudentEvaluation {

	double average(double maths, double physics, double chemistry) {
		double numbers = sum(maths, physics, chemistry) / 3;
		System.out.println(numbers);
		return numbers;
	}

	double sum(double maths, double physics, double chemistry) {
		double numbers = 0;
		numbers = maths + physics + chemistry;
		return numbers;
	}

	static boolean isAnswerAboveExpecation(double numbers) {
		if (numbers > 50)
			return true;
		return false;
	}

	static boolean isEligible(double numbers) {
		if (numbers > 50 | numbers % 2 == 0)
			return true;
		return false;
	}

	static char getYourGrade(double numbers) {
		if (numbers > 80)
			return 'A';
		return 'B';
	}

	public static void main(String[] args) {
		StudentEvaluation studentEvaluation = new StudentEvaluation();
		double numbers = studentEvaluation.average(10, 20, 271);
		isAnswerAboveExpecation(numbers);

		if (isEligible(numbers) == true)
			System.out.println("Student is Eligible");
		else
			System.out.println("Student is not eligible");

		if (getYourGrade(numbers) == 'A')
			System.out.println("Student got Grade - A");
		else
			System.out.println("Student got Grade - B");
	}

}
