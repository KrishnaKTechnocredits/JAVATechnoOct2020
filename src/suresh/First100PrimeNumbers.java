package suresh;
//Assignment - 22 - Print All Prime numbers between 2 and 100
public class First100PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int status = 1;
		int num = 3;

		System.out.println("Prime numbers Between 2 and 100 are:");

		for (int i = 2; i <= 100;) {
			for (int j = 2; j <= num / 2; j++) {
				if (num % j == 0) {
					status = 0;
					break;
				}
			}
			if (status != 0 && num <= 100) {
				System.out.println(num);
				i++;
			}
			status = 1;
			num++;
		}
	}
}

// }
