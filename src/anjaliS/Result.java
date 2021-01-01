package anjaliS;

public class Result {     
    double sum(double one, double two, double three){
	       return one + two + three ;
     }
	      double avg(double one, double two, double three){
	       System.out.println("Sum is "+sum(one,two,three));
            return sum(one,two,three)/2;
    }

      static boolean isAnswerAboveExpectation(double res){
       if(res>50)
       return true; 
      else
       return false;
   }
 
     static boolean isEligible(double res){
      if(res>50 || res%2==0)
       return true;
      else
       return false;
   }

     static String getYourGrade(double res){
      if(res>80)
       return "A Grade";
      else
       return "B Grade";
  
   }
 
    public static void main (String args[]){
     Result result = new Result();
     double res = result.avg(3,4,5);
     System.out.println("Average is "+res);
     System.out.println("Actual answer is "+isAnswerAboveExpectation(res));
     System.out.println("Eligibility is  "+isEligible(res));
     System.out.println("Grade is "+getYourGrade(res));

  }

}
