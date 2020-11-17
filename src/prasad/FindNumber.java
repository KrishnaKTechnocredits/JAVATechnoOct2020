package prasad;

import java.util.Scanner;

/*Program 4 : Accepts array of numbers and finds +ve,-ve and 0 from the array*/
public class FindNumber {
	int posNo= 0;
	int negNo= 0;
	int zeros= 0;
	void search(int[]nos) {
		for(int index=0;index<=nos.length-1;index++) {
				if(nos[index]>0)
					posNo++;
				else if(nos[index]<0)
					negNo++;
				else if(nos[index]==0)
					zeros++;
		}
		System.out.println("+ve numbers: "+ posNo+ " ; -ve numbers: "+ negNo + " ; Number of zeros: "+ zeros);
	}
	
	public static void main(String[]arg) {
		Scanner scanner = new Scanner(System.in);
		FindNumber findnumber = new FindNumber();
		System.out.println("Please enter how many numbers do you want to process:");
		int count = scanner.nextInt();
		int [] numbers = new int[count];
		for(int index=0;index<=count-1;index++) {
			System.out.println("Please enter a number: ");
			int number = scanner.nextInt();
			numbers[index]=number;
		}
		findnumber.search(numbers);
	}

}
