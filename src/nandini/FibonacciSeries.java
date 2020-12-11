package nandini;

public class FibonacciSeries {
  
	void getFibonacci() {
		int n = 10, t1 = 0, t2 = 1;
		System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; i++)
        {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
	public static void main(String args[]) {
		new FibonacciSeries().getFibonacci();
	}
}
