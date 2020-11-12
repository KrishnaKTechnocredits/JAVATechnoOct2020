package ankita;

public class CalculateGrade {

	double sum(double num1, double num2, double num3) {
		return num1+num2+num3;
	}
	double  average(double num1, double num2, double num3) {
		return sum(num1,num2,num3)/3;
	}
	static boolean isAnswerAboveExpectation(double number) {
		if(number>50)
			return true;
		else
			return false;
	}
	static boolean  isEligible(double number) {
		if(number>50 || number/2 ==0)
			return true;
		else
			return false;
	}
	static String getYourGrade(double number) {
		if(number>80)
			return "A grade";
		else
			return "B grade";
	}
	public static void main(String[] args) {
		
		CalculateGrade calculateGrade = new CalculateGrade();
		double average = calculateGrade.average(70,85,79);
		if(calculateGrade.isAnswerAboveExpectation(average))
			System.out.println("Answer is Above Expectation");
		else 
			System.out.println("Answer is not above expectation");
		
		
		if(isEligible(average))
			System.out.println("Eligible");
		else
			System.out.println("Not Eligible");
		
		System.out.println("Your grade is " + getYourGrade(average));
	}
}