package suvela;

public class Eligibility {
	double sum(double x, double y, double z) {
		double sum = x + y + z;
		return sum;
	}

	double average(double x, double y, double z) {
		double avg = sum( x,  y, z) / 3;
		return avg;
	}

	static boolean isAnswerAboveExpectation(double value) {
		if (value > 50)
			return true;
		else
			return false;
	}

	static boolean isEligible(double value) {
		if (value > 50 || value % 2 ==0)
			return true;
		return false;
	}

	static boolean getYourgrade(double value) {
		if (value > 80) 
			return true;
		 else 
			return false;
	}

	void setdata(String name) {
		System.out.println("-----Student " + name + " information-----");
	}

	public static void main(String[] args) {
		Eligibility eligibility = new Eligibility();
		eligibility.setdata("Vikas");
		double ans = eligibility.average(10, 20, 30);
		System.out.println("Average is: " + ans);
		
		boolean ans1 = isAnswerAboveExpectation(ans);
		if (ans1 == true)
			System.out.println("Above expectation");
		else
			System.out.println("Not upto the mark");
		
		boolean answer = isEligible(ans);
		if (answer == true)
			System.out.println("Is eligible");
		else
			System.out.println("Not eligible");
		
		boolean answer1 = getYourgrade(ans);
		if (answer1 == true)
			System.out.println("Received grade is :A grade");
		else
			System.out.println("Received grade is :B grade");

	}

}
