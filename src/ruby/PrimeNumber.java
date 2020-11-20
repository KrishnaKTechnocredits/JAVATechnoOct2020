package ruby;
/*Assignment-22 : 18th Nov'2020 
Print all prime numbers between 2 to 100*/

public class PrimeNumber {

	void findPrimeNum(int start,int end) {
		System.out.println("List of Prime Numbers from "+start+" to "+end);
		for (int index = start; index <= end; index++) {
			boolean flag = false;
			if (index != 0 && index > 1) {
				for (int i = 2; i <= Math.sqrt(index); i++) {
					if (index % i == 0) {
						flag = true;
						break;
					}
				}
				if (!flag)
					System.out.print(index + " ");
			}
		}
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.findPrimeNum(1,100);
	}
}
