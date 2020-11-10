package apurva;

public class TestSum {
	double getSum(double a, double b, double c) {
		double z = a + b + c;
		return z;
	}

	public static void main(String[] args) {
		TestSum testsum = new TestSum();
		System.out.println("Sum = " + testsum.getSum(10, 12, 18));
	}
}








