package vishakha;

public class ReturnTypeA {
	
	double average(double num1, double num2, double num3){
		CalculateSum calculateSum = new CalculateSum();
		double average = calculateSum.sum(num1, num2, num3)/2;	
		return average;
	}
	
	static boolean isAnswerAboveExpectation(double average){
		if(average > 50)
			return true;
		else
			return false;
	}
	
	static boolean isEligible(double average){
		if(average > 50 || average % 5 == 0)
			return true;
		else 
			return false;
	}
	
	static String getYourGrade(double average){
		if(average > 80)
			return "Grade A";
		else
			return "Grade B";
	}

	public static void main(String[] args) {
		ReturnTypeA a = new ReturnTypeA();
		ReturnTypeA.isAnswerAboveExpectation(a.average(5,5,3));
		boolean isEligible = ReturnTypeA.isEligible(a.average(5,5,3));
		if(isEligible)
			System.out.println("Student is Eligible for admission.");
		else
			System.out.println("Student is not Eligible for admission.");
		String grade = ReturnTypeA.getYourGrade(a.average(5,5,3));
		System.out.println("Student got " +grade);
	}
}
