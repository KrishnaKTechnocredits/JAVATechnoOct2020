/*Assignment - 37 : 10th Dec'2020 
Print Fibonacci series for first 10 numbers.

output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34*/
package suvela.assignment37;

public class Fibonacci {
	void getFibonacciSeries() {
		System.out.println("Fibonacci series of first 10 numbers:");
		int n1 =0, n2 = 1, temp,i, count = 10;
		System.out.print(n1 + "," + n2);
		for (i = 2; i < count; i++) {
			temp = n1 + n2;
			System.out.print("," + temp);
			n1 = n2;
			n2 = temp;
		}
	}
	void findFibonacci(int n) {
		int i=0,j=1,count=0,temp;
		System.out.println("Fibonacci of first "+n+" numbers:");
		System.out.print(i+","+j);
		while(count<(n-2)) {
			temp=i+j;
			System.out.print(","+temp);
			i=j;
			j=temp;
			count++;
		}
	}
	public static void main(String[] args) {
		Fibonacci fb= new Fibonacci();
		fb.getFibonacciSeries();
		fb.findFibonacci(15);
	}

}
