package prasad;
import java.util.Scanner;

public class IsNumberFibonacci {
	
	boolean isFibonacci(int num) {
		boolean flag = false;
		int temp1=0;
		int temp2=1;
		int ans=0;
		
		System.out.println("Printing numbers in febonacci series and checking if given number falls in the series:-");
		while(ans<=num) {
			if(ans==0) {
				System.out.print(temp1 + " "+ temp2);
				ans = temp1+temp2;
				if(num==0 || num==1) { //This condition handles scenario where in user enters 0 or 1 to check if it falls in fibonacci.
					flag=true;
					break;
				}
			}
			else {
				System.out.print(" " + ans);
				temp1=temp2;
				temp2=ans;
				ans=temp1+temp2;
				if(ans==num) {
					System.out.println(" "+ ans);
					flag=true;
					break;
				}
			}
		}
		if(ans!=num&&num!=0)
		System.out.print(" "+ ans);
		
		return flag;
	}
	
	public static void main(String[]arg) {
		IsNumberFibonacci isnumberfibonacci = new IsNumberFibonacci();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter any number to check if it falls in febonacci series:-");
		int num = scanner.nextInt();
		boolean flag = isnumberfibonacci.isFibonacci(num);
		if(flag) {
			System.out.println("");
			System.out.println("Given number "+ num + " is part of febonacci series");
		}
		else {
			System.out.println("");
			System.out.println("Given number " + num + " is NOT part of febonacci series");
		}
		
	}

}
