package mrunal;
/* Assignment - 37 : 10th Dec'2020 
Print Fibonacci series for first 10 numbers.

output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/
public class fibonaaci {

	void getFibonacci(int n) {
		System.out.println("First " + n + " Fibonacci Numbers : ");
		int n1 = 0, n2 = 1, cnt = 0, n3 = 0;
		System.out.print(n1 + ",");
		System.out.print(n2 + ",");
		while (cnt < (n - 2)) {
			n3 = n1 + n2;
			System.out.print(n3 + ",");
			n1 = n2;
			n2 = n3;
			cnt++;
		}
	}

	public static void main(String[] args) {
		new fibonaaci().getFibonacci(10);
	}
} 