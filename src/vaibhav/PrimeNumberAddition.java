package vaibhav;

//This program will find prime array and sum and average of all elements

public class PrimeNumberAddition {
	
	static double finalCount=0;
	
	public static int[] primeNumber() {
		int i,j,k=0;
		int [] primeArray=new int[100];
		for (i = 2 ; i <=100 ;i++) {
			int count =0;
			for (j = 1 ; j<= i; j++) {
				if (i % j == 0) 
					count++;
			}
			if (count == 2) {
				primeArray[k] = i;
				k++;	
				finalCount++;
				
			}				
		}
		return primeArray;
	}
	
	public static int sumOfElement (int [] array) {
		int sum = 0;
		for (int index = 0 ; index < array.length;index++) {
			sum = sum + array[index];		
		}
		return sum;
	}
	

	public static void main(String[] args) {
		int [] arrayOfPrime=PrimeNumberAddition.primeNumber();
		double addition=PrimeNumberAddition.sumOfElement(arrayOfPrime);		
		System.out.println("Total prime numbers are "+finalCount);
		System.out.println("addition of total elements "+addition);
		System.out.println("Average of total numbers are "+(addition/finalCount));
	}
}
