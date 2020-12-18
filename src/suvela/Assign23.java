/*Find count of prime numbers between 2-100.
2) find sum of all prime numbers between 2-100.
3) find average of all prime numbers between 2-100.*/
package suvela;

public class Assign23 {

	int primeNumberCount(int start, int end) {
		int count=0;
		for (int i = start; i <= end; i++) {
			boolean flag = true;
			for (int j = 2; j <= (i / 2); j++) {
				if (i % j == 0)
					flag = false;
			}
			if (flag) {
				System.out.print(i + " ");
				count++;
			}
		}
		return count;
	}

	int primeNumberSum(int start, int end) {
		int sum=0;
		for (int i = start; i <= end; i++) {
			boolean flag = true;
			for (int j = 2; j <= (i / 2); j++) {
				if (i % j == 0)
					flag = false;
			}
			if (flag) 
				sum=sum+i;
			
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Assign23 assign = new Assign23();
		int count=assign.primeNumberCount(2, 100);
		System.out.println("------------------------");
		System.out.println("Total count is :" + count);
		int sum=assign.primeNumberSum(2, 100);
		System.out.println("Total sum is :" + sum);
		int avg= sum/count;
		System.out.println("Average is :" + avg);
		
		
	}

}
