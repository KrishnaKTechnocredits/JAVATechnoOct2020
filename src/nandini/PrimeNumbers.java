package nandini;
// WAP to print Prime Numbers between 2 to 100
public class PrimeNumbers {
	
	void verifyPrimeNumbers()
	{
		int num1 = 2 , num2 =100;
		while(num1 < num2) {
			boolean flag = false;
			for(int i =2; i <= num1/2; i++) {
				if(num1 % i ==0) {
					flag = true;
					break;
				}
			}
			if(!flag && num1 !=0 && num1 !=1)
				System.out.print( num1 + " ");
			num1++;
		}
	}
	public static void main(String [] args) {
		PrimeNumbers primenumbers = new PrimeNumbers();
		primenumbers.verifyPrimeNumbers();
	}
}
