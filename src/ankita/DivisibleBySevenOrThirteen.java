package ankita;

public class DivisibleBySevenOrThirteen {

	void printDivisibleBySevenOrThirteen(int start, int end) {
		for(int i=start; i<=end; i++) {
			if(i%7 == 0 )
				System.out.println(i + " Divisible by 7");
			if(i%13 == 0)
				System.out.println(i + " Divisible by 13");
		}
	}
	public static void main(String[] args) {
		new DivisibleBySevenOrThirteen().printDivisibleBySevenOrThirteen(5,40);
	}
}
