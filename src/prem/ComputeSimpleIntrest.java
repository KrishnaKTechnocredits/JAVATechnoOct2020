package prem;

//Write a Java program to compute simple interest   
//Simple Interest = (P x T x R)/100 
/*Where, 
	P is the principle amount 
	T is the time [year] and 
	R is the rate */

public class ComputeSimpleIntrest {

    void simpleInterest(int principleamount, float time , float rate){
    	
	        float interest = (principleamount * time * rate)/100;
	        
			System.out.println("Simple Interest is : " +interest);
			
		}

    public static void main(String[] args){
    	
    	ComputeSimpleIntrest computeSimpleIntrest = new ComputeSimpleIntrest();
         
    	computeSimpleIntrest.simpleInterest(100000, 7.8f, 5.2f);
			
		}
}		
         	

