/*Assignment-22 : 18th Nov'2020 
Print all prime numbers between 2 to 100.
*/
package ankita;

public class PrimeNumberFromTwoToHundred {
	int[] getPrimeNumberFromTwoToHundred(int num1, int num2) {
		System.out.println("Prime Numbers between : " + num1 +" & " +num2);
		int primeArray[] = new int[num2-num1]; 
		int count=1;
		for(int i=num1;i<=num2;i++) {
			if(i==0 || i==1)
				continue;
			boolean flag=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			if(flag) 
				primeArray[count++]=i;
		}
		return primeArray;
	}
	public static void main(String[] args) {
		int[] arr =  new PrimeNumberFromTwoToHundred().getPrimeNumberFromTwoToHundred(0,100);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0)
				System.out.print(arr[i]+ ", ");
		}
	}
}