package milind;

public class PrimeNumberFrom2To100 {
	
	void primeNumber(int rangeStart, int rangeEnd) {
		System.out.println("Prime Number : " );
		for(int index = rangeStart; index <= rangeEnd; index++) {
			int count = 0;
			for(int innerIndex = rangeStart; innerIndex <= index/2; innerIndex++) {
				if(index % innerIndex == 0) {
					count++;
				}
			}
			if(count <= 1) {
				System.out.println(index);
			}
		}
		
	}
	
	public static void main(String[] args) {
		int start = 2;
		int end = 100;
		PrimeNumberFrom2To100 primeNumberFrom2To100 = new PrimeNumberFrom2To100();
		primeNumberFrom2To100.primeNumber(start, end);
	}

}
