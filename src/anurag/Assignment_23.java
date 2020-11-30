package anurag;

//Find Count of prime numbers between 2-100

public class Assignment_23 {
	int c = 0, sum = 0;

	void display() {
		for (int i = 2; i < 100; i++) {
			{
				int flag = 0;
				for (int j = 2; j <= i - 1; j++) {
					if (i % j == 0)
						flag = 1;
				}
				if (flag == 0) {
					c++;
					sum = sum + i;
					System.out.print(i + " ");
				}
			}

		}
		System.out.println();
		System.out.println("Count of Prime Numbers between 2 to 100 is :");
		System.out.println(c);
		System.out.println("Sum of Prime numbers between 2 and 100 = " + sum);
		System.out.println("Avg of Prime numbers= " + sum / c);
	}

	public static void main(String[] args) {
		System.out.println("Prime Numbers are displayed below:");
		Assignment_23 assignment_23 = new Assignment_23();
		assignment_23.display();

	}

}
