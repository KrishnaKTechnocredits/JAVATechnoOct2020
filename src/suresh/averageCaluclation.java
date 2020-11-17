package suresh;


public class averageCaluclation {

	double sum(double x, double y,double z) {
		return x+y+z;
	}
	double average(double x,double y,double z) {
		averageCaluclation averagecaluclation = new averageCaluclation();
		double ans = averagecaluclation.sum(x, y, z)/3;
		return ans;
	}
	
	static boolean isAnswerAboveExpecation(double average) {
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
		averageCaluclation averagecaluclation = new averageCaluclation();
		double average= averagecaluclation.average(60, 80,24);
		//isAnswerAboveExpecation();
		System.out.println("Average of Marks: "+ average);
		System.out.println("Is your average above expectation? : "+averagecaluclation.isAnswerAboveExpecation(average));
		System.out.println("Are you Eligible? : "+averagecaluclation.isEligible(average));
		System.out.println("Grade Details : "+averagecaluclation.getYourGrade(average));
		}
	}
