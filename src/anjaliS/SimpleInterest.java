package anjaliS;

public class SimpleInterest {
	   float interest;
    
       void calculateSI(int pricipleAmt , int time ,int rateOfInterest){
       interest = (pricipleAmt * time * rateOfInterest) / (100);
       System.out.println("Simple Interest Is : "+interest);
   }

       public static void main(String [] args){
         SimpleInterest simpleInterest = new SimpleInterest();
         simpleInterest.calculateSI(2300,2,15);
   }
}

