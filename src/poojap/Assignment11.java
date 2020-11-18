package poojap;

public class Assignment11 {
	
	double sum(double num1, double num2, double num3) {
		
		return num1+num2+num3;
	}
	double avg(double num1, double num2, double num3) {
		
		Assignment11 assignment11 =new Assignment11();
		System.out.println("Sum of number is: "+sum(num1,num2,num3) );
		return assignment11.sum(num1,num2,num3)/3;
	
	}
	static boolean isAnswerAboveExpecation(double avg) {
		
		if(avg > 50)
			return true;
		else 
			return false;
	
	}
	static boolean isEligible(double avg) {
		
		if(avg >50 || avg%2==0)
			return true;
		else
			return false;
	}
	static String getYourGrade(double avg) {
		if(avg> 80)
			return "A Grade";
		else
			return "B Grade";
	}
	public static void main(String[] args) {
		
		Assignment11 assignment11 =new Assignment11();
		double ans=assignment11.avg(50, 70, 90);
		System.out.println("average is: " + ans);
		if(isAnswerAboveExpecation(ans))
			System.out.println("Performance is as per expection");
		else
			System.out.println("Performance is low");
		if(isEligible(ans))
			System.out.println("You are eligible");
		else 
			System.out.println("You are not eligible");
		System.out.println("Grade is: " +getYourGrade(ans));

	}
}
