/*Find count,sum & avg of prime number from 2-200.*/

package ankita.assignment.prime;

public class PrimeFromTwoToTwoHundred {
	int[] getPrimeFromTwoToTwoHundred() {
		int cnt = 0;
		int arr[] = new int[198];
		for (int i = 2; i <= 200; i++) {
			boolean flag = false;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				arr[cnt++] = i;
			}
		}
		System.out.println("Count of prime number from 2 to 200 : " + cnt);
		return arr;
	}

	int getSumOfPrimeFromTwoToTwoHundred(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of prime number from 2 to 200 :" + sum);
		return sum;
	}

	void getAvgOfPrimeFromTwoToTwoHundred(int[] arr) {
		int sum = 0, cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				sum += arr[i];
				cnt++;
			}
		}
		System.out.println("Avg of prime number from 2 to 200 :" + sum / cnt);
	}

	public static void main(String[] args) {
		PrimeFromTwoToTwoHundred twoToTwoHundred = new PrimeFromTwoToTwoHundred();
		int arr[] = twoToTwoHundred.getPrimeFromTwoToTwoHundred();
		int sum = twoToTwoHundred.getSumOfPrimeFromTwoToTwoHundred(arr);
		twoToTwoHundred.getAvgOfPrimeFromTwoToTwoHundred(arr);
	}
}
