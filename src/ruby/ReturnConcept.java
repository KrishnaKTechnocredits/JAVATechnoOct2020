package ruby;
/*Design to test static, non static, return type concepts.

1) Method sum(), accept 3 parameters of type double & return answer
2) Method average(), accept 3 parameters of type double & return answer
3) Method isAnswerAboveExpecation(), take one parameter (answer which you received from average method) and 
return true if value is more then 50 else false.
4) Method isEligible(),take one parameter (answer which you received from average method) 
return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 
5) Method getYourGrade(),take one parameter (answer which you received from average method) 
return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.

Rules : a) From main method, you will call average() and average() method will call sum() method.
               Main method will not directly call sum method. 
	    b) average() & sum() should be non static method.
	    c) isAnswerAboveExpecation(), isEligible(), getYourGrade() method should be static method and      called from main method.
            d) Class should not have any instance variable.*/

public class ReturnConcept {
	
	double average(double num1, double num2, double num3) {
		return sum(num1,num2,num3)/3;
	}
	
	double sum(double num1, double num2,double num3) {
		return num1+num2+num3;
	}
	
	static boolean isAnswerAboveExpecation(double num){
		if(num > 50)
			return true;
		return false;		
	}
	
	static boolean isEligible(double num) {
		if (num > 50 || num%2==0)
			return true;
		else
			return false;
	}
	
	static String getYourGrade(double num) {
		if(num > 80)
			return "A Grade";
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
		
		System.out.println("You got "+ReturnConcept.getYourGrade(ans));			
	}
}