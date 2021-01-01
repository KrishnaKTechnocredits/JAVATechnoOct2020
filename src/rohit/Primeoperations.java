package rohit;

/*1) Find count of prime numbers between 2-100.
2) find sum of all prime numbers between 2-100.
3) find average of all prime numbers between 2-100.*/
public class Primeoperations {
	void primenumber(int start, int end) {
		System.out.println("Prime numbers between " + start + " to " + end + " are :");
		int count = 0;
		double sum = 0;
		for (int i = start; i < end; i++) {
			boolean flag = true;
			for (int inner = 2; inner < Math.sqrt(i); inner++) {
				if (i % inner == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count += 1;
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println("");
		System.out.println("Total Count of Prime Numbers in the given range are : " + count);
		System.out.println("Sum of all prime numbers are : " + sum);
		System.out.println("Average of all prime numbers are : " + (sum / count));
	}

	public static void main(String[] args) {
		new Primeoperations().primenumber(2, 100);
	}
}