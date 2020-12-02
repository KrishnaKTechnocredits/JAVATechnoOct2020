package priyanka;

public class StudentGrade {

	double sum(int x, int y, int z) {
		return x + y + z;
	}

	double average(int x, int y, int z) {
		StudentGrade studentGrade = new StudentGrade();
		return studentGrade.sum(x, y, z) / 3;
	}

	static boolean isAnswerAboveExpectation(double average) {
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
			return "Grade A";
		else
			return "Grade B";

	}

	public static void main(String[] arg) {

		StudentGrade studentGrade = new StudentGrade();
		double average = studentGrade.average(80, 90, 85);
		System.out.println("The Average Marks of student is: " +average);
		if (isAnswerAboveExpectation(average))
			System.out.println("Student's performance is as per expectation");
		else
			System.out.println("Student's performance is below expectation ");
		
		 if (isEligible(average))
				System.out.println("Student is eligible");
			else
				System.out.println("Student is not eligible");
		System.out.println("Overall grade is:  "+getYourGrade(average));

	}
}
