//Print all prime numbers between 2 to 100

package deepak;

import java.util.Scanner;

public class Assignment_22 {
	
	void primeNumbers(int start, int end) {
		for(int index=start; index<=end; index++) {
			int number=index;
			int count=0;
			for(int innearindex=1; innearindex<=end; innearindex++) {	
				if(number%innearindex==0) {
					count++;
				}
			}	
			if(count==2)
				System.out.print(" "+number);
		}
	}

	public static void main(String[] args) {
		
		Assignment_22 refVar = new Assignment_22();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number of range");
		int num1 = sc.nextInt();
		System.out.println("Please enter second number of range");
		int num2 = sc.nextInt();
		refVar.primeNumbers(num1, num2);
	}

}
