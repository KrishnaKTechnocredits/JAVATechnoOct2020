//Print all prime numbers between 2 to 100

package anurag;

public class Assignment22 {

	void display() {
		for (int i = 2; i < 100; i++) {
			{
				int flag = 0;
				for (int j = 2; j <= i - 1; j++) {
					if (i % j == 0)
						flag = 1;
				}
				if (flag == 0)
					System.out.print(i + " ");
			}

		}

	}

	public static void main(String[] args) {
		System.out.println("Prime Numbers are displayed below:");
		Assignment22 assignment22 = new Assignment22();
		assignment22.display();
	}

}
