package raghvendra.prime;
/*Assignment-22 : 18th Nov'2020 
Print all prime numbers between 2 to 100*/
public class PrintPrime {
	void printPrimeFromTwo() {
		System.out.println("Prime Numbers are");
		int count;
		for(int index=2;index<=200;index++) {
			count=0;
			for(int inner=2;inner<index;inner++) {
				if(index%inner==0) {
					count=1;
					break;
				}
			}
			if(count==0)
			System.out.print(index+" ");
		}
	}
	public static void main(String[] args) {
		PrintPrime printPrime=new PrintPrime();
		printPrime.printPrimeFromTwo();
	}

}
