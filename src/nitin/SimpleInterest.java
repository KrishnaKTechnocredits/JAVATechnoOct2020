/*	Date - 21-Oct-2020, Day 5
	Java Assignment 3 - Program:3

3. Write a Java program to compute simple interest   
Simple Interest = (P x T x R)/100 
Where, 
	P is the principle amount 
	T is the time [year] and 
	R is the rate */
package nitin;	
class SimpleInterest{
	
	void calculateInterest(double principle,float time,float rate){
		double interest=(principle*time*rate)/100;
		System.out.println("Simple Interest : "+interest);
	}
	public static void main(String[] a){
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.calculateInterest(15000.5,7.5f,1.5f);
	}
}