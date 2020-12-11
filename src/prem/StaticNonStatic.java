package prem;

/*Design to test static, non static, return type concepts.

1) Method sum(), accept 3 parameters of type double & return answer 
2) Method average(), accept 3 parameters of type double & return answer 
3) Method isAnswerAboveExpecation(), take one parameter (answer which you received from average method) 
and return true if value is more then 50 else false
4) Method isEligible(),take one parameter (answer which you received from average method) 
return true if value is more then 50 or divisible 
5) Method getYourGrade(),take one parameter (answer which you received from average method)
 return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.

Rules : a) From main method, you will call average() and average() method will call sum() method.
               Main method will not directly call sum method. 
	    b) average() & sum() should be non static method.
	    c) isAnswerAboveExpecation(), isEligib */


public class StaticNonStatic {
	
	static double average;
	
	double sum(double num1, double num2, double num3){
		 double ans = num1 + num2 + num3;
		 return ans;
	}
	double avrage() {
		average = sum(10, 20, 30)/3;
		return average;
	}
	boolean isAnswerAboveExpecation(double average){
		if(average > 50) {	
			return true;
		}
		return false;
	}
	boolean isElligible(double average){
		if(average > 50 || average%2 == 0) {	
			return true;
		}
		return false;
	}
		
	String getYourGrade(double average){
		if(average > 80) {
			return "A Grade";
		}
		else
			return "B Grade";
	}

	public static void main(String[] args) {

		StaticNonStatic referanceVar = new StaticNonStatic();
		System.out.println("Average is : "+ referanceVar.avrage());
		System.out.println("Is Elligible: "+ referanceVar.isElligible(average));
		System.out.println("Grade is :"+ referanceVar.getYourGrade(average));
	}
}
