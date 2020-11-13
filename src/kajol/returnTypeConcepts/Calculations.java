package kajol.returnTypeConcepts;

public class Calculations {
	
	static boolean isAnswerAboveExpecation(double average) {
		if(average>50) {
			return true;
		}
		else
			return false;		
	}
	
	static boolean isEligible(double average) {
		if(average>50 || average%2==0) {
			return true;
		}
		return false;	
	}
	
	static char getYourGrade(double average) {
		if(average>80) {
			return 'A';
		}
		else
			return 'B';	
	}
	
	public static void main(String[] args) {
		Average average=new Average();
		double averageofnumbers=average.calculateAverage(10, 40, 50);
		System.out.println("Average of numbers is: "+averageofnumbers);
		
		if(averageofnumbers>50){
		 System.out.println("Average is more than 80,so your grade is: "+getYourGrade(averageofnumbers));
		}
		else System.out.println("Average is below 80,so your grade is: "+getYourGrade(averageofnumbers));
			
		
		if(isAnswerAboveExpecation(averageofnumbers)) {
			System.out.println("Average is above Expectation Condition.");
		}
		else
			System.out.println("Average is below Expectation Condition.");
		
		if(isEligible(averageofnumbers)) {
			System.out.println("Average belongs to Eligible Condition.");
		}
		else
			System.out.println("Average belongs to Non-Eligible Condition.");
		
		//System.out.println("Average of numbers is: "+average.calculateAverage(10, 40, 50));
		//isAnswerAboveExpecation(average.calculateAverage(10, 40, 50));
		//isEligible(average.calculateAverage(10, 30, 50));
		//getYourGrade(average.calculateAverage(10, 40, 50));
	}

}
