package anjaliP;
import java.util.Scanner;
/*
 Program 3 :  [ Optional ]
    You need to store user input in array and do sum of even numbers only from created 
     array. [ideal Expected Time : 10 mins, Max Time : 15 mins]
     Example :
     Input : {10,5,7,3,1,5,9,30}
     Output: 40 */
public class Program3 {
	int sumOfEvenNumbers(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0)
				sum += input[index];
		}
		return sum;
	}
	public static void main(String[] args) {
		//Program3 program3 = new Program3();
		System.out.println("Please enter number of elements you want to store: ");
		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();
		int[] numbers = new int[total];	
		for (int index = 0; index < total; index++) 
		{
			System.out.println("Enter number" + (index + 1) + ": ");
			numbers[index] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("sum of even numbers: " + new Program3().sumOfEvenNumbers(numbers));
	}
}
