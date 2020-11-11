package ruby;

public class ReturnConcept {
	
	double average(double num1, double num2, double num3) {
		double ans = sum(num1,num2,num3)/3;
		return ans;
	}
	
	double sum(double num1, double num2,double num3) {
		double ans= num1+num2+num3;
		return ans;
	}
	
	static boolean isAnswerAboveExpecation(double num){
		if(num < 50)
			return true;
		else
			return false;		
	}
	
	static boolean isEligible(double num) {
		if (num > 50 && num%2==0)
			return true;
		else
			return false;
	}
	
	static String getYourGrade(double num) {
		if(num > 80)
			return "A Grade";
		else
			return "B Grade";				
	}
	
	public static void main(String[] a) {
		ReturnConcept returnConcept = new ReturnConcept();
		double ans = returnConcept.average(300, 300, 300);
		System.out.println("Average of numbers: "+ans);
		
		ReturnConcept.isAnswerAboveExpecation(ans);
		
		boolean eligible = ReturnConcept.isEligible(ans);
		if(eligible)
			System.out.println("You are eligible");
		else
			System.out.println("You are NOT eligible");
		
		String grade = ReturnConcept.getYourGrade(ans);
		if(grade.equalsIgnoreCase("A Grade"))
			System.out.println("You got Grade A");
		else 
			System.out.println("You got grade B");		
	}
}