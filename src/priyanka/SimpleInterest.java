package priyanka;

public class SimpleInterest {

	void calSimpleInterest(int principle, float time, Float rateofinterest) {
		double interest = (principle * time * rateofinterest) / 100;
		System.out.println(" Simple Interest is: " + interest);
	}

	public static void main(String[] arg) {
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.calSimpleInterest(10000, 5f, 12.5f);
	}

}
