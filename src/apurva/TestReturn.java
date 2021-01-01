package apurva;

public class TestReturn {
	double getSum(double a, double b, double c) {
		// System.out.println("in Get sum");
		return a + b + c; // 220
	}

	double getAvg(double a, double b, double c) {
		// System.out.println("Get avg");
		double avgAns = getSum(a, b, c) / 3; // 220/3 + 73.333
		// System.out.println(avgAns);
		return avgAns;
	}

	static boolean isAnswerAboveExpecation(double avgAns) {
		boolean flag;
		// System.out.println(avgAns);
		if (avgAns > 50)
			flag = true;
		else
			flag = false;
		return flag;
	}

	static String isEligible(double avgAns) {
		if (avgAns > 50 || avgAns % 2 == 0) // 45345.34545 > 50
			return "Student is Eligible";
		else
			return "Student is Not-Eligible";
	}

	static String getYourGrade(double avgAns) {
		if (avgAns > 80)
			return "A Grade";
		else
			return "B Grade";
	}

	public static void main(String[] args) {
		TestReturn testreturn = new TestReturn();
		double returnedValue = testreturn.getAvg(82, 76, 62); // 73.333
		isAnswerAboveExpecation(returnedValue); // 73.333 true
		System.out.println(isEligible(returnedValue)); // 73.333 > 50 --> return if
		System.out.println(getYourGrade(returnedValue)); // 73.333 > 80 --> return if
	}
}