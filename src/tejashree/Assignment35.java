package tejashree;
/*
return sum of all Armstrong number from given array.
input : [153, 111, 124, 371]
output : 524
 */

public class Assignment35 {

	static void findSumOfArmstrong(int[] numArr) {
		int sum = 0;
		for (int index = 0; index < numArr.length; index++)
			System.out.print(numArr[index] + " ");
		System.out.println();
		System.out.println("armstong numbers are:");
		for (int index = 0; index < numArr.length; index++) {
			sum += isNumberArmstrong(numArr[index]);
			if (isNumberArmstrong(numArr[index]) != 0)
				System.out.println(numArr[index] + " ");
		}
		System.out.println("Sum of armstrong numbers is: " + sum);
	}

	static int isNumberArmstrong(int num) {
		int tnum = num;
		int mod = 0, sum = 0;
		while (tnum > 0) {
			mod = tnum % 10;
			sum += (mod * mod * mod);
			tnum = tnum / 10;
		}
		if (sum == num)
			return num;
		else
			return 0;
	}

	public static void main(String[] args) {
		int[] numArr = { 153, 234, 68, 71, 902, 370, 9, 4 };
		findSumOfArmstrong(numArr);
	}
}