package brijesh.assignment22;

public class PrimeNumbers {
	
	void printPrimeNumbers(int start, int end) {
		System.out.println("Prime numbers between "+start+" and "+end);
		for (int index=start; index <= end; index++) {
			boolean flag=true;
			for(int innerIndex=2; innerIndex<=Math.ceil(Math.sqrt(index));innerIndex++) {
				if(index%innerIndex==0) {
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.print(index+" ");
		}
	}

	public static void main(String[] args) {
		new PrimeNumbers().printPrimeNumbers(2,100);
	}

}
