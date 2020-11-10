package vishakha;

public class ReturnTypeA {
	
	double average(double num1, double num2, double num3){
		double sum = sum(num1, num2, num3);
		double average = sum/3;	
		System.out.println("Average is "+average);
		return average;
	}
	
	double sum(double num1, double num2, double num3){
		double sum = num1+num2+num3;
		System.out.println("Sum is "+sum);
		return sum;
	}
	
	static boolean isAnswerAboveExpectation(double average){
		if(average > 50)
			return true;
		else
			return false;
	}
	
	static boolean isEligible(double average){
		if(average > 50 || average/2 == 0)
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
		double average = a.average(100,100,100);
		ReturnTypeA.isAnswerAboveExpectation(average);
		boolean isEligible = ReturnTypeA.isEligible(average);
		if(isEligible)
			System.out.println("Student is Eligible for admission.");
		else
			System.out.println("Student is not Eligible for admission.");
		String grade = ReturnTypeA.getYourGrade(average);
		System.out.println("Student got " +grade);
	}
}
