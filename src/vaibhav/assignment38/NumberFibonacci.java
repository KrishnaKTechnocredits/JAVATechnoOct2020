package vaibhav.assignment38;

/*Assignment - 38 : 11th Dec'2020 
Verify number is in Fibonacci series or not.*/


import java.util.Scanner;

public class NumberFibonacci {

	public static void main(String[] args) {
		System.out.println("Please Enter the number");
		Scanner scanner = new Scanner (System.in);
		int num = scanner.nextInt();
		boolean flag=NumberFibonacci.isFibonacci(num);
		System.out.println();
		if (flag)
			System.out.println("Number "+num+ " is in the fibonacci");
		else
			System.out.println("Number "+num+" is not in the fibonacci");
	}

	private static boolean isFibonacci(int num) {
		int temp1 = 0;
		int temp2 = 1;
		int copyNum = num;
		boolean flag = false;
		System.out.print(","+temp1+","+temp2);//added this for just checking purpose
		while (num >= 0) {
			int temp3 = temp1 + temp2;
			if (temp3 == copyNum)
				flag = true;
			System.out.print(","+temp3);//added this for just checking purpose
			temp1 = temp2;
			temp2 = temp3;
			num--;			
		}
		return flag;		
	}

}
