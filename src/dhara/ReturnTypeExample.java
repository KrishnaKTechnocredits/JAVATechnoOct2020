package dhara;

public class ReturnTypeExample {

	double sum(double maths, double physics, double Chamistry) {
		return maths+physics+Chamistry;
	}
	
	double average(double maths, double physics, double Chamistry) {
		return sum(maths,physics,Chamistry)/3;
	}
	
	static boolean isAnswerAboveExpectation(double average) {
		if(average>50)
			return true;
		else
			return false;
	}
	
	static boolean isEligible(double average) {
		if(average>50 || average%2==0)
			return true;
		else
			return false;
		
	}
	
	static char getYourGrade(double average) {
		if(average>80)
			return 'A';
		else {
			return 'B';
		}
	}
	
	public static void main(String[] args) {
		
		ReturnTypeExample returnTypeExample=new ReturnTypeExample();
		double average = returnTypeExample.average(90,90,90);
		System.out.println("Student's average result is : "+average);
		
		if(isAnswerAboveExpectation(average)==true)
			System.out.println("Student is above average");
		else 
			System.out.println("Student is below average");
		
		if(isEligible(average)==true)
			System.out.println("Student is eligible");
		else
			System.out.println("student is not eligible");
		
		System.out.println("Student's grade is : "+getYourGrade(average));
		
	}
	
	
	
}
