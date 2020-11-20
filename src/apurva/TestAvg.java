package apurva;

public class TestAvg {
	double getAvg(double a, double b, double c) {
		double avg = (a + b + c) / 3;
			return avg;
	}
	public static void main (String[] args) {
		TestAvg average = new TestAvg();
		System.out.println("Avarge = " + average.getAvg(10, 12, 18));
		
	}
}
