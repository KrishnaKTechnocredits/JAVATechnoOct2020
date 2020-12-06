package mrunal;
/*Assignment 20-----Program : 1 
swap 2 numbers with using 3rd variable*/

import java.util.Scanner;
public class swap_with_3_var
{
		void getSwapNumber(int num1, int num2) 
		{
			int temp = 0;
			System.out.println("Input is--- " +  + num1 +" " + num2);
			temp = num1;
			num1 = num2;
			num2 = temp;
			System.out.println("After Swapping--- " +  + num1 + " "  + num2);
		}

public static void main(String[] args)
{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Number1 : ");
			int num1 = sc.nextInt();
			
			System.out.println("Enter Number2 : ");
			int num2 = sc.nextInt();

			new swap_with_3_var().getSwapNumber(num1, num2);
		}
	} 
