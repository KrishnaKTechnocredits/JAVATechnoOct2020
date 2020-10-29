package ankita;

public class DivisibleByFive {

	void printDivisibleByFive(int start, int end) {
		
		System.out.println("Numbers divisible by 5 in range "+start +"&"+end);
		for(int i=start; i<=end ; i++) {
			if(i%5==0)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		new DivisibleByFive().printDivisibleByFive(10,30);
	}
}
