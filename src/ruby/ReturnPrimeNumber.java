package ruby;
/*Assignment_23 : 20th Nov'2020

1) Find count of prime numbers between 2-100.
2) find sum of all prime numbers between 2-100.
3) find average of all prime numbers between 2-100.*/

public class ReturnPrimeNumber {

	boolean getPrimeNumber(int input) {
		boolean flag = false;
		if (input != 0 && input > 1) {
			for (int i = 2; i <= Math.sqrt(input); i++) {
				if (input % i == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				// System.out.println(input);
				return true;
			}
		}
		return false;
	}

	int getPrimeNumberCount(int start, int end) {
		int cnt = 0;
		for (int index = start; index <= end; index++) {
			boolean flag = getPrimeNumber(index);
			if (flag) {
				cnt++;
			}
		}
		System.out.println("Total number of Prime numbers are: "+cnt);
		return cnt;
	}

	int sumOfNum(int num1, int num2) {
		int sum = 0;
		for (int index = num1; index <= num2; index++) {
			boolean flag = getPrimeNumber(index);
			if (flag) {
				sum += index;
			}
		}
		System.out.println("Sum of all prime Numbers upto " + num2 + " is " + sum);
		return sum;
	}

	void average(int sum, int count) {
		sum = sum / count;
		System.out.println("Average of all Prime: " + sum);
	}

	public static void main(String[] args) {
		ReturnPrimeNumber primeNumber = new ReturnPrimeNumber();
		int start=0, end=100;
		int count=primeNumber.getPrimeNumberCount(start, end);
		int sum=primeNumber.sumOfNum(start,end);
		primeNumber.average(sum, count);

	}

}
