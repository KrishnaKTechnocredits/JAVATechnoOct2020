package prasad;
import java.util.Scanner;

/*Program 3: Accepts array of numbers and prints sum of all even nos in the given array*/

public class SumOfEvenNos {
	int count;
	int sum(int[]numbers) {
		int sum=0;
		for(int index=0; index<=numbers.length-1;index++) {
			if(numbers[index]%2==0) {
				sum=sum+numbers[index];
				count++;
			}else 
				continue;
		}
		return sum;
	}
	
	public static void main(String[]arg) {
		Scanner scanner = new Scanner(System.in);
		SumOfEvenNos sumofevennos = new SumOfEvenNos();
		System.out.println("How many numbers you want to process: ");
		int count = scanner.nextInt();
		int [] numbers=new int[count];
		for(int index=0;index<count;index++) {
			System.out.println("Please enter a number:");
			int number=scanner.nextInt();
			numbers[index]= number;
		}
		int sumans=sumofevennos.sum(numbers);
		if(sumofevennos.count!=0)
		System.out.println("Sum of all even numbers in the given array: " + sumans);
		else 
		System.out.println("No even numbers present in the array.");
	}
	

}
