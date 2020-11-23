package nandini.Assignment_11;

public class Result {
	
	static boolean isAnswerAboveExpectations(double avgAns) {
		
		if(avgAns > 50)
			return true;
		else
			return false;
	}
	
	static boolean isEligible(double avgAns) {
		
		if(avgAns > 50 || avgAns%2==0)
			return true;
		else
			return false;
	}
	
	static char getYourGrade(double avgAns) {
		
		if(avgAns > 80)
			return 'A';
		else
			return 'B';
	}
	
	public static void main(String [] args) {
		
		Average avg = new Average();
		double ans = avg.average(10, 10, 30);
		System.out.println("Avergae is : " + ans);
	    boolean ansStatus= isAnswerAboveExpectations(ans);
	    System.out.println("Is Answer Above Expectation : " + ansStatus);
	    boolean eligibilityStatus = isEligible(ans);
	    System.out.println("Is Eligible : " + eligibilityStatus);
	    char printGrade = getYourGrade(ans);
	    System.out.println("Grade Recieved is : " + printGrade);
	}

}
