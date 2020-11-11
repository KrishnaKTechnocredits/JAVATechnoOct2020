package yogita;

public class ReturnType{
    double sum(double a,double b,double c){
		return a+b+c;
    }
    
	double average(double a,double b,double c){
		System.out.println("Sum is:"+sum(a,b,c));
	    return sum(a,b,c)/2;
	   
	}
	 
	static boolean isAnswerAboveExpecation(double ans){
	    if(ans > 50)
		   return true;
		else
		   return false;
	}
	
    static boolean isEligible(double ans){
	    if(ans>50 || ans%2 ==0)
		   return true;
		else
		   return false;
	}
	  
	static String getYourGrade(double ans){
	    if(ans > 80)	
		   return "A Grade";
		else
		   return "B Garde";
	}
	  
 public static void main(String [] args){
	    ReturnType retrunType = new ReturnType();
		double ans = retrunType.average(20,40,60);
		System.out.println("Average is:"+ans);
	    System.out.println("Expeted Answer is:"+isAnswerAboveExpecation(ans));
	    System.out.println("Eligibility is:"+isEligible(ans));
		System.out.println("Grade is:"+getYourGrade(ans));
	 }
  }