package shrutiS;

public class StudentScore {

	String setStudentName(String studentName) {

		return studentName;
	}

	double sum(double physics, double chemistry, double maths) {

		return physics + chemistry + maths;
	}

	double average(double physics, double chemistry, double maths) {
		System.out.println("Physics marks : " + physics + ",  Chemistry marks : " + chemistry + ", Maths marks : " + maths);
		double average = sum(physics, chemistry, maths) / 3;

		return average;
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
			return "A Grade";
		else
			return "B grade";

	}

	public static void main(String[] a) {
		StudentScore student = new StudentScore();

		String studentName = student.setStudentName("Shikha");
		double average = student.average(10, 30, 50);
		System.out.println(studentName + "'s Average Score is " + average);
		System.out.println(studentName + " scored " + getYourGrade(average));

		if (isAnswerAboveExpecation(average))
			System.out.println(studentName + "'s answers are above expectation");
		else
			System.out.println(studentName + "'s answers are not upto mark");

		if (isEligible(average))
			System.out.println(studentName + " is Eligibile for the course");
		else
			System.out.println(studentName + " is not Eligibile for the course");
	}

}
