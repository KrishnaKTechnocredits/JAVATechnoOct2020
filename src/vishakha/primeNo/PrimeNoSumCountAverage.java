package vishakha.primeNo;

public class PrimeNoSumCountAverage {
	int sum;
	int sumOfPrimeNo;
	
	void findPrimeNo(int startIndex, int endIndex){
		int count = 0;
		for(int i=startIndex; i<=endIndex; i++){
			boolean flag = true;
			for(int innerIndex=2; innerIndex<(Math.sqrt(i)); innerIndex++){
				if(i%innerIndex == 0)
					flag = false;
				break;
			}
			if(flag)
				System.out.print(" "+i);
				count++;
				sum += i;
				System.out.println("Sum is "+sum);
		}
		System.out.println("There are total "+count+ " prime nos");
	}

	public static void main(String[] args) {
		new PrimeNoSumCountAverage().findPrimeNo(2,100);
	}
}
