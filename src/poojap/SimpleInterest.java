package poojap;

public class SimpleInterest {
	
	void simpleInterestt(int principal,int time,int rate) {
		
		float si=(principal*time*rate)/100;
		System.out.println("Simple Interest is " +si);
	}

	public static void main(String[] args) {
		
		SimpleInterest simpleInterest=new SimpleInterest();
		simpleInterest.simpleInterestt(25000, 2, 11);
	}
	
}
