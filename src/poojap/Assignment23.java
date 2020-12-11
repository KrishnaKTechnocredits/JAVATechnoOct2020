package poojap;

public class Assignment23 {
	int count = 0, sum = 0;
	float avg = 0;

	void primeSumandavg() {
		System.out.println("Prime No are: ");
		for (int i = 2; i <= 100; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count++;
				System.out.print(" " + i);
				sum = sum + i;
				avg = sum / count;
			}
		}
		System.out.println("\nTotal Prime Number: " + count);
		System.out.println("Total Prime Number Sum: " + sum);
		System.out.println("Total Prime Number Average: " + avg);
	}

	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		assignment23.primeSumandavg();
	}
}
