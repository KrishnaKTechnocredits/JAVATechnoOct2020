package suresh;
/*sum of all Armstrong number from given array.
input : [153, 111, 124, 371]
*/
public class SumOfAmstrongNumbers {
	void armStrong(int[] n) {

		int sum = 0;
		int remainder = 0;
		int temp = 0;
		for (int i = 0; i < n.length; i++) {
			int a = 0;
			int num = n[i];

			while (num != 0) {
				remainder = num % 10;
				a = a + (remainder * remainder * remainder);
				num = num / 10;
				// int sum = 0;
				if (n[i] == a) {
					sum = sum + n[i];
				}
			}

		}
		System.out.println("Sum of Palindrome Numbers in a string is-->" + sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = { 153, 111, 124, 371 };
		SumOfAmstrongNumbers sumofnumbers = new SumOfAmstrongNumbers();
		sumofnumbers.armStrong(n);
	}

}
