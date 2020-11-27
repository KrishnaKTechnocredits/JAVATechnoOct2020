/*Assignment-22 : 18th Nov'2020 
Print all prime numbers between 2 to 100.*/
package suvela;

public class Assign22 {
	void primeNumber(int start, int end) {
		for (int i = start; i <= end; i++) {
			boolean flag = true;
			for (int j = 2; j <= (i / 2); j++) {
				if (i % j == 0)
					flag = false;
			}
			if (flag) {
				System.out.print(i + " ");
			}
		}
		
	}

	public static void main(String[] args) {
		Assign22 assign = new Assign22();
		assign.primeNumber(2, 100);
	}
}
