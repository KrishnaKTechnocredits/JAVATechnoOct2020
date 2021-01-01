package anjaliS;

public class SumOfAmstrong {
	boolean isNumberAmstrongOrNot(int n) {
		int sum = 0, rem = 0;
		int number = n;
		while (n > 0) {
			rem = n % 10;
			sum = sum + (rem * rem * rem);
			n = n / 10;
		}
		if (sum == number)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		SumOfAmstrong sumofamstrong = new SumOfAmstrong();
		int[] array = { 153, 111, 124, 371 };
		int sum1 = 0;
		for (int index = 0; index < array.length; index++) {
			boolean isamstrong = sumofamstrong.isNumberAmstrongOrNot(array[index]);
			if (isamstrong)
				sum1 += array[index];
		}
		System.out.println("Sum of amstrong number is: " + sum1);
	}
}
