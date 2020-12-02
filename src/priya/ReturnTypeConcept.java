package priya;

public class ReturnTypeConcept {

	double sum(double x, double y, double z) {
		return x + y + z;
	}

	double avg(double x, double y, double z) {
		System.out.println("Sum is : " + sum(x, y, z));
		return sum(x, y, z) / 3;
	}

	static boolean IsAnswerAboveExpectation(double ans) {
		if (ans > 50)
			return true;
		else
			return false;
	}

	static boolean IsEligible(double ans) {
		if (ans > 50 || ans % 2 == 0)
			return true;
		else
			return false;
	}

	static boolean GetYourGrade(double ans) {
		if (ans > 80) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		ReturnTypeConcept returnType = new ReturnTypeConcept();
		double ans = returnType.avg(20.00, 40.00, 80.00);
		System.out.println("Average is:" + ans);
		//System.out.println("Expected Answer is:" + IsAnswerAboveExpectation(ans));
		if (IsAnswerAboveExpectation(ans)) {
			System.out.println("Student is above expectation");
		} else {
			System.out.println("Marks are below expectation");
		}
		if (IsEligible(ans)) {
			System.out.println("Student is Eligible");
		} else {
			System.out.println("Student is not Eligible");
		}
		if (GetYourGrade(ans)) {
			System.out.println("Student got A Grade");
		} else {
			System.out.println("Student got B Grade");
		}

	}
}
