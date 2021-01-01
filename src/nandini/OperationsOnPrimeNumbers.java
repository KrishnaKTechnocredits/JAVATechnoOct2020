package nandini;

public class OperationsOnPrimeNumbers {
	
	void verifyPrimeNumbers()
	{
		int num1 = 2 , num2 =100;
		int count =0, sum =0, avg=0;
		while(num1 < num2) {
			boolean flag = false;
			for(int i =2; i <= num1/2; i++) {
				if(num1 % i ==0) {
					flag = true;
					break;
				}
			}
			if(!flag && num1 !=0 && num1 !=1){
				count++;
				sum = sum + num1;
				System.out.print( num1 + " "); 
			}
		  num1++;
		}
		System.out.println(); 
		System.out.println("Total count is: "+ count);
		System.out.println("Total sum of Prime Numbers between 2 to 100 is: "+ sum);
		avg = sum/count;
		System.out.print("Average of Prime Numbers between 2 to 100 is: " + avg);
	}
	public static void main(String [] args) {
		OperationsOnPrimeNumbers primenumbers = new OperationsOnPrimeNumbers();
		primenumbers.verifyPrimeNumbers();
	}
}
