package priya;

public class SimpleInterest {

	void simpleInterest(int principle, int time, float rate){
		float interestAmount = (principle*time*rate)/100;
		System.out.println("Value of SimpleInterest is :" +interestAmount);
	}
	public static void main(String[] args){
		SimpleInterest si = new SimpleInterest();
		si.simpleInterest(2000,5,4.5f);
	}
}
