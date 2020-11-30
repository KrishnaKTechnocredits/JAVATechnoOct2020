package mrunal;

public class Return {
  
   
   double sum(double x , double y, double z )
    {
	   return x+y+z;
	}
   
   double average(double x ,double y, double z)
   {
	   Return return1= new Return();
	    double ans=return1.sum(x, y, z)/3;
	    return ans;
   }
   
   static boolean IsAnswerAboveExpectation(double ans)
   {
	   if(ans>50 )
		   return true;
	   else 
		   return false;
   }
	
   static String IsEligible(double ans)
   {
	   if(ans>50 || ans%2==0)
		   return "student is eligible ";
	   else 
		   return "student is not eligible ";
   }
   
   static String getYourGrade(double ans)
   {
		if(ans>80)
			return "Student got A grade";
		else
			return "Student got B Grade";
   }

public static void main(String[] args) {
	
	   Return return1= new Return();
	   double average=return1.average(30.00, 30.00, 30.00);
	   boolean b =IsAnswerAboveExpectation(average);
	   System.out.println(IsEligible(average));
	   System.out.println(getYourGrade(average));

	}

}
