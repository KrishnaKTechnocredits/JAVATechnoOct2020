package surbhi;

/*Design to test static, non static, return type concepts.

1) Method sum(), accept 3 parameters of type double & return answer
2) Method average(), accept 3 parameters of type double & return answer
3) Method isAnswerAboveExpecation(), take one parameter (answer which you received from average method) and return true if value is more then 50 else false.
4) Method isEligible(),take one parameter (answer which you received from average method) return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 
5) Method getYourGrade(),take one parameter (answer which you received from average method) return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.

Rules : a) From main method, you will call average() and average() method will call sum() method.
               Main method will not directly call sum method. 
	    b) average() & sum() should be non static method.
	    c) isAnswerAboveExpecation(), isEligible(), getYourGrade() method should be static method and      called from main method.
            d) Class should not have any instance variable.*/

public class StaticNonStatic {

	double Sum(double a, double b, double c) {

		double sum1 = a + b + c;

		return sum1;

	}

	double Average(double a, double b, double c) {

		double avg = Sum(a, b, c) / 3;

		System.out.println(avg);

		return avg;

	}

	static boolean isAnswerAboveExpecation(double avg1) {

		boolean flag;
		if (avg1 > 50)
			flag = true;
		else
			flag = false;

		// return flag;

		return flag;
	}

	static boolean isEligible(double avg2) {

		boolean flag;
		if (avg2 > 50 || avg2 / 2 == 0)
			flag = true;
		else
			flag = false;
		// return flag;

		return flag;
	}

	static char getYourGrade(double avg1) {

		if (avg1 > 80) {

			return 'A';
		} else {
			return 'B';
		}

	}

	public static void main(String[] args) {

		StaticNonStatic staticNonStatic = new StaticNonStatic();
		double avg = staticNonStatic.Average(12, 12, 16);
		System.out.println(isAnswerAboveExpecation(avg));
		System.out.println(isEligible(avg));
		System.out.println(getYourGrade(avg));

	}

}
