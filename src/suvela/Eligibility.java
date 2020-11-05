package suvela;

public class Eligibility {
	double sum(double x, double y, double z) {
		double sum = x + y + z;
		return sum;
	}

	double average(double x, double y, double z) {
		Eligibility eligibility = new Eligibility();
		double avg = eligibility.sum(40, 10, 10) / 3;
		return avg;
	}

	static boolean isAnswerAboveExpectation() {
		Eligibility eligibility = new Eligibility();
		double value = eligibility.average(10, 20, 30);
		if (value > 50)
			return true;
		else
			return false;
	}

	static boolean isEligible() {
		Eligibility eligibility = new Eligibility();
		double value = eligibility.average(10, 20, 30);
		double ans = 0;
		if (value > 50 || ans == value / 2)
			return true;
		return false;
	}

	static boolean getYourgrade() {
		Eligibility eligibility = new Eligibility();
		double value = eligibility.average(10, 20, 30);
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
		
		boolean ans1 = isAnswerAboveExpectation();
		if (ans1 == true)
			System.out.println("Above expectation");
		else
			System.out.println("Not upto the mark");
		
		boolean answer = isEligible();
		if (answer == true)
			System.out.println("Is eligible");
		else
			System.out.println("Not eligible");
		
		boolean answer1 = getYourgrade();
		if (answer1 == true)
			System.out.println("Received grade is :A grade");
		else
			System.out.println("Received grade is :B grade");

	}

}
