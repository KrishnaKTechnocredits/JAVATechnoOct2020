package anurag;

public class Return {

	double sum(double num1, double num2,double num3) {

		double ans = num1 + num2+ num3;
		return ans;
	}

	double average(double num1, double num2, double num3) {

		double resultSum = sum(num1, num2, num3);
		double ans = resultSum / 3;
		return ans;
	}

	static boolean IsAnswerAboveExpectation(double avg) {

		if (avg > 50)
			return true;
		else
			return false;
	}

	static boolean IsEligible(double avg) {
		if (avg > 50 || avg % 2 == 0)
			return true;
		else
			return false;

	}

	static String GetYourGrade(double avg) {

		if (avg > 80)
			return "A Grade";
		else
			return "B Grade";
	}

	public static void main(String[] args) {

		Return ret = new Return();

		double result = ret.average(50, 50, 50);
		System.out.println("Average value is : " + result);
		boolean res = Return.IsAnswerAboveExpectation(result);
		System.out.println("(isAnswerAboveExpectation) method value is : " + res);
		boolean eligible = Return.IsEligible(result);
		System.out.println("(IsEligible) method value is : " + eligible);
		String grade = Return.GetYourGrade(result);
		System.out.println("(GetYourGrade) method value is : " + grade);
	}
}
