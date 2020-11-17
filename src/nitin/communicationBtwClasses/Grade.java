package nitin.communicationBtwClasses;

public class Grade {
	
	double sum(double physics, double chemistry, double maths) { 
		double sum=physics+chemistry+maths;
		System.out.println("Total Marks of Student :: "+sum);
		return sum;
	}
	double average(double physics, double chemistry, double maths) {
		double average = sum(90,85,95)/3;
		System.out.println("Average Marks of Student :: "+average);
		return average;
	}
	static boolean isAnswerAboveExpecation(double average) {
			if(average>50) 
			return true;
		return false;
	}
	static boolean isEligible(double average) { 
		if(average>50 || average%2==0)
			return true;
		return false;
	}
	static char getYourGrade(double average) {
			if(average>80)
				return 'A';
			return 'B';
	}
	public static void main(String[] args) {
		Grade grade = new Grade();
		double average=grade.average(60,75,95);
		isAnswerAboveExpecation(average);
		if(isEligible(average)==true)
			System.out.println("Student is eligible");
		else
			System.out.println("Student is not eligible");
		if(getYourGrade(average)=='A')
			System.out.println("Student's Grade :: A");
		else
			System.out.println("Student's Grade :: B");
	}
}
