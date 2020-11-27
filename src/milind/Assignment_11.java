package milind;

public class Assignment_11 {
	
	double sum(double number1, double number2, double number3) {
		double answer = number1 + number2 + number3;
		return answer;
	}
	
	double avgerage(double number1, double number2, double number3) {
		Assignment_11 assignment_11 = new Assignment_11();
		double averageOfNumber = assignment_11.sum(number1, number2, number3)/3;
		return averageOfNumber;
	}
	
	static boolean isAnswerAboveExpecation(double averageOfNumbers) {
		if(averageOfNumbers > 50) {
			return true;
		}else {
			return false;
		}
	}
	
	static boolean isEligible(double averageOfNumbers) {
		if(averageOfNumbers > 50 || averageOfNumbers % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	static String getYourGrade(double averageOfNumber) {
		if(averageOfNumber > 80) {
			return "A grade";
		}else {
			return "B grade";
		}
	}
	
	public static void main(String[] args) {
		
		Assignment_11 assignment_11 = new Assignment_11();
		double avg = assignment_11.avgerage(60, 70, 80);
		
		if(Assignment_11.isAnswerAboveExpecation(avg)) {
			System.out.println("You are good and getting marks above expectation");
		} else {
			System.out.println("Need to work Hard, Your marks are below expectation");
		}
		
		if(Assignment_11.isEligible(avg)) {
			System.out.println("You are eligible");
		} else {
			System.out.println("You are not eligible");
		}
		
		System.out.println(Assignment_11.getYourGrade(avg));
	}
}
