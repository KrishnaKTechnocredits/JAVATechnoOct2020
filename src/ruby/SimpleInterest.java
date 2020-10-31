package ruby;

/*Simple Interest = (P x T x R)/100 
Where, 	P is the principle amount 
		T is the time [year] and 
		R is the rate */	

class SimpleInterest{
	void simpleInterest(double principleAmount, int time, double rate){	
		System.out.println(" SimpleInterest: "+ ((principleAmount * time * rate)/100));
	}

	public static void main(String[] a){
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.simpleInterest(23490, 12, 3.5);
	}
}
