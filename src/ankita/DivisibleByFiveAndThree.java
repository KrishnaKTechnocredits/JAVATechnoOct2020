package ankita;

public class DivisibleByFiveAndThree {

	void printDivisibleByFiveAndThree(int start, int end) {
		System.out.println("Number divisible by 5&3 in range "+ start + "&" + end);
		for(int i=start; i<=end; i++) {
			if( i%5==0 && i%3==0)
				System.out.println(i + " Divisible by 5&3");
		}
	}
	public static void main(String[] args) {
		new DivisibleByFiveAndThree().printDivisibleByFiveAndThree(5,18);
	}

}
