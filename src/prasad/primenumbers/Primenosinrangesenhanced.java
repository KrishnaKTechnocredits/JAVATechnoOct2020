package prasad.primenumbers;

import java.util.Scanner;
/*This class prints all prime numbers in given range and then prints sum and avg of all prime numbers*/

public class Primenosinrangesenhanced {
	static int totalprimenumbers;
	
	int[] isPrime(int no1,int no2) {
		int [] primenos = new int[no2];
		int arrayindex=0;
		for(int index=no1;index<no2;index++) {
			int number = index;
			int count=0;
			for(int innerindex=1;innerindex<=number;innerindex++) {
				if(number%innerindex==0)
					count++;
			}
			if(count==2) {
				System.out.print(number + " ");
				totalprimenumbers++;
				while(arrayindex<=no2) {
					primenos[arrayindex]= number;
					arrayindex++;
					break;
				}
			}
		}
			
		return primenos;
	}
	
	float sumOfPrimenos(int[]array) {
		float sum=0;
		for(int index=0;index<array.length;index++) {
			sum=sum+array[index];
		}
		return sum;
	}
	float avgOfPrimenos (float sum) {
		float avg = (sum/Primenosinrangesenhanced.totalprimenumbers);
		return avg;
	}
	
	public static void main(String[]arg) {
		Primenosinrangesenhanced primenosinrangesenhanced = new Primenosinrangesenhanced();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter from number:-");
		int no1 = scanner.nextInt();
		System.out.println("Please enter to number:-");
		int no2 = scanner.nextInt();
		int [] primenumbers=primenosinrangesenhanced.isPrime(no1, no2);
		float sum=primenosinrangesenhanced.sumOfPrimenos(primenumbers);
		System.out.println(" ");
		System.out.println("Sum of all prime numbers in between "+ no1 + " & "+ no2 +" :- "+ sum);
		float avg = primenosinrangesenhanced.avgOfPrimenos(sum);
		System.out.println("Avg of all prime numbers in between "+ no1 + " & "+ no2 +" :- "+ avg);
	}
}
