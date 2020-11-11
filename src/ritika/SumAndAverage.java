package ritika;

public class SumAndAverage {

	double CalAverage(double num1, double num2, double num3) {
		SumAndAverage sumAndAverage2 = new SumAndAverage();
		double avg = sumAndAverage2.CalSum(10.10, 20.20, 30.30) / 3;
		System.out.println("Average is " + avg);
		return avg;
	}

	double CalSum(double num1, double num2, double num3) {
		double sum = num1 + num2 + num3;
		System.out.println("Sum is " + sum);
		return sum;
	}

	static boolean isAnswerAboveExpectation(double avg) {
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
			return "A grade";
		else
			return "B grade";
	}

	public static void main(String[] args) {
		SumAndAverage sumAndAverage1 = new SumAndAverage();
		
		double average = sumAndAverage1.CalAverage(10.10, 20.20, 30.30);
		
		if (isAnswerAboveExpectation(average) == true)
			System.out.println("Average is above expectation");
		else
			System.out.println("Average is below expectation");

		if (isEligible(average) == true)
			System.out.println("Eligible");
		else
			System.out.println("Not eligible");

		System.out.println(getYourGrade(average));

	}

}
