package anurag;

public class SimpleInterest {
	

		// double SI;
			
		 void displaySimpleInterest(double p,float r,int t){
			 double si = (p*r*t)/100;
			 System.out.println("Simple Interst is :" +si);
		 }
			
		 public static void main(String[] args){
			  SimpleInterest simpleInterest1 = new SimpleInterest();
			  simpleInterest1.displaySimpleInterest(10000.20,7.5f,5);
		 }
	 }
			
		
		




