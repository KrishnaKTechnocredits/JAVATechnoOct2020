package brijesh.assignment11;

public class CalculateAverage {
	
	double sum(double num1, double num2, double num3){
		return num1+num2+num3;
	}
	
	double average(double num1, double num2, double num3){
		return sum(num1,num2,num3)/3;
	}

	static boolean isAnswerAboveExpecation(double average){
		if(average>50)
			return true;
		return false;
	}
	
	static boolean isEligible(double average){
		if(average>50 || average%2==0)
			return true;
		return false;
	}
	
	static String getYourGrade(double average){
		if(average>80)
			return "A Grade";
		return "B Grade";
	}
	
	public static void main(String[] args) {
		double average= new CalculateAverage().average(60, 80, 24);
		System.out.println("Your average marks : "+String.format("%.2f", average));
		System.out.println("Is your average above expectation? : "+CalculateAverage.isAnswerAboveExpecation(average));
		System.out.println("Are you Eligible? : "+CalculateAverage.isEligible(average));
		System.out.println("Your Received : "+CalculateAverage.getYourGrade(average));
	}

}
