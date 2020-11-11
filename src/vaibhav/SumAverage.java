package vaibhav;

public class SumAverage {
	
	double sum(double num1,double num2,double num3){
		double ans=num1+num2+num3;		
		return ans;		
	}
	
	double average(double num1,double num2,double num3){
		double ans = sum(num1,num2,num3);
		double answer = ans / 3;			
		return answer;	
	}
	
	static boolean isAnswerAboveExpecation(double avg) {
		if (avg > 50)
			return true;
		else
			return false;		
	}
	
	static boolean isEligible(double avg) {
		if (avg > 50 || avg % 2 == 0)
			return true;
		else 
			return false;		
	}
	
	static char getYourGrade(double avg) {
		if ( avg > 80)
			return 'A';
		else
			return 'B';		
	}

	public static void main(String[] args) {
		
		SumAverage sumAverage = new SumAverage();
		double finalAverage=sumAverage.average(10, 10.40, 10.60);
		SumAverage.isAnswerAboveExpecation(finalAverage);
		if(SumAverage.isEligible(finalAverage))
			System.out.print("Student is eligible");
		else
			System.out.print("Student is not eligible");
		System.out.println(" With Grade "+SumAverage.getYourGrade(finalAverage));
	}

}
