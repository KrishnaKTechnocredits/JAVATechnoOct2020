package monika;
public class ReturnType{

       double sum(double a ,double b ,double c)
    {
             return a+b+c;

     }

      double avearge(double a ,double b ,double c)
      {    
           ReturnType returntype= new ReturnType();
	    double ans=returntype.sum(a, b, c)/3;
	    return ans; 
    
      }

      static boolean isAnswerAboveExpectation(double ans)
   {
	   if(ans>50 )
		   return true;
	   else 
		   return false;
   }
  

       static boolean isEligible(double ans)
   {
	   if(ans>50 || ans%2==0)
		   return true;
	   else 
		   return false;
   }


    static String getYourGrade(double ans)
   {
		if(ans>80)
			return " A grade";
		else
			return "B Grade";
   }
                  

   
public static void main(String[] args) {

	   ReturnType returntype= new ReturnType();
	   double avearge=returntype.avearge(40,60,80);
	 
           if (isAnswerAboveExpectation(avearge))
			System.out.println("Your avearage is above expectation");
		else
			System.out.println("Require more practice");

		if (isEligible(avearge)) {
			System.out.println("You are eligible");
		} else
			System.out.println("You are not eligible");

		String grade = getYourGrade(avearge);
		System.out.println("you received grade " + grade);
	}

}













