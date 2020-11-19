//optional Program from sunday lecture - Find mid of prime numbers
package ankita;

public class MidPrimeNumber {

	void getMidprimeNumber(int num1, int num2) {
		int arr[] = new int[num2 - num1];
		int cnt = 0;
		for (int i = num1; i <= num2; i++) {
			boolean flag = true;
			if (i != 0 && i != 1) {
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					arr[cnt++] = i;
					System.out.print(i + ",");
				}
			}
		}
		System.out.println("\nMid prime number: " + arr[(cnt / 2)]);
	}

	public static void main(String[] args) {
		new MidPrimeNumber().getMidprimeNumber(0, 12);
	}
}