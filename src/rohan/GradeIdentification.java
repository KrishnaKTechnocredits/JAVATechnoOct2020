package rohan;

public class GradeIdentification {

	double sum(double x, double y, double z) {
		double ansSum = x+y+z;
		return ansSum;
	}
	
	double average(double x, double y, double z) {
		double ansAvg = sum(x,y,z)/3;
		return ansAvg;
	}
	
	static boolean isAnswerAboveExpectation(double ans) {
		if(ans > 50)
			return true;
		else
			return false;
	}
	
	static boolean isEligible(double ans) {
		if(ans > 50 || ans%2 == 0)
			return true;
		else
			return false;
	}
	
	static String getYourGrade(double ans) {
		if(ans > 80)
			return "A Grade";
		else
			return "B Grade";
	}
	
	public static void main(String[] args) {
		GradeIdentification gradeIdentification = new GradeIdentification();
		double ansAvg = gradeIdentification.average(90,90,90);
		boolean flagIsAnsAboveExpectation = isAnswerAboveExpectation(ansAvg);
		if(flagIsAnsAboveExpectation)
			System.out.println("Answer is above expectation");
		else
			System.out.println("Answer is below expecation");
		boolean flagIsEligible = isEligible(ansAvg);
		if(flagIsEligible)
			System.out.println("Answer is eligible");
		else
			System.out.println("Answer is not eligible");
		String myGrade = getYourGrade(ansAvg);
		if(myGrade.equals("A Grade"))
			System.out.println("My grade is: A");
		else
			System.out.println("My grade is: B");
		
	}

}
