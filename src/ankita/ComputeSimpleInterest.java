package ankita;

public class ComputeSimpleInterest {
	void computeInterest(int principleAmt, int time, float rt){
		System.out.println("\nComputing simple interest.......");
		float interest = (principleAmt * time * rt ) / 100 ; 
		System.out.println("Simple interest is " + interest );
	}
	public static void main(String [] args){
		int principleAmount = 10000;
		int timeInYear = 2;
		float rate = 4.5f;

		ComputeSimpleInterest computeSimpleInterest = new ComputeSimpleInterest();
		System.out.println("======================================================");
		computeSimpleInterest.computeInterest(principleAmount,timeInYear,rate);
		System.out.println("\n======================================================");
	}
}
