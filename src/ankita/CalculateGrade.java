/*
 Design to test static, non static, return type concepts.

1) Method sum(), accept 3 parameters of type double & return answer
2) Method average(), accept 3 parameters of type double & return answer

3) Method isAnswerAboveExpecation(), take one parameter (answer which you received from average method) and return true if value is more then 50 else false.

4) Method isEligible(),take one parameter (answer which you received from average method) return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 

5) Method getYourGrade(),take one parameter (answer which you received from average method) return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.

Rules : a) From main method, you will call average() and average() method will call sum() method.
               Main method will not directly call sum method. 
	    b) average() & sum() should be non static method.
	    c) isAnswerAboveExpecation(), isEligible(), getYourGrade() method should be static method and      called from main method.
            d) Class should not have any instance variable.
 */
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
		return false;
	}
	static boolean  isEligible(double number) {
		if(number>50 || number%2 ==0)
			return true;
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