package nagendra;

public class ReturnType {

	double sum(double firstNumber, double secondNumber, double thirdNumber) {

		double totalSum = firstNumber + secondNumber + thirdNumber;
		return totalSum;

	}

	double average(double first, double second, double third) {

		double average = sum(first, second, third) / 3;
		System.out.println(" Average  ----> " + average);
		return average;
	}

	static boolean isAnswerAboveExpecation(double average) {
		boolean flag;
		if (average > 50)
			flag = true;
		else
			flag = false;
		System.out.println(" isAnswerAboveExpecation --->" + flag);
		return flag;
	}

	static boolean isEligible(double average) {
		boolean flag;
		if (average > 50 || average % 2 == 0)
			flag = true;
		else
			flag = false;
		System.out.println(" isEligible -->" + flag);
		return flag;

	}

	static String getYourGrade(double average) {
		String Grade;
		if (average > 80)
			Grade = "A Grade";
		else
			Grade = "B Grade";
		System.out.println(" Grade is --->" + Grade);
		return Grade;

	}

	public static void main(String[] args) {
		ReturnType returntype = new ReturnType();
		double avgage = returntype.average(90, 95, 60);
		ReturnType.isAnswerAboveExpecation(avgage);
		ReturnType.isEligible(avgage);
		ReturnType.getYourGrade(avgage);

	}
}
