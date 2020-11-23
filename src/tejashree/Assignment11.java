package tejashree;

public class Assignment11 {
	double sum(double x, double y, double z) {
		return x + y + z;
	}
	double avg(double x, double y, double z) {
		Assignment11 as11 = new Assignment11();
		return as11.sum(x, y, z) / 3;

	}
	static boolean isAnsAboveExpectation(double avg) {
		if (avg > 50)
			return true;
		else
			return false;
	}
	static boolean isEligible(double avg) {
		if (avg > 50 || avg % 2 == 0)
			return true;
		else
			return false;
	}
	static String getYourGrade(double avg) {
		if (avg > 80)
			return "Grade A";
		else
			return "Grade B";
	}

	public static void main(String[] args) {
		Assignment11 as11 = new Assignment11();
		double avg = as11.avg(95, 95, 95);

		if (isAnsAboveExpectation(avg))
			System.out.println("Your avg is above expectation");
		else
			System.out.println("you need more practice");

		if (isEligible(avg)) {
			System.out.println("You are eligible");
		} else
			System.out.println("You are not eligible");

		String grade = getYourGrade(avg);
		System.out.println("you received grade " + grade);
	}

}