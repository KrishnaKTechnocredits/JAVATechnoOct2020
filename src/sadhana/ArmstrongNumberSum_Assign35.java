package sadhana;

/* Assignment_35
return sum of all Armstrong number from given array.
input : [153, 111, 124, 371]
output : 524
 */

public class ArmstrongNumberSum_Assign35 {

	static void processData(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++)
			System.out.print(arr[index] + " ");
		System.out.println("armstong numbers are:");
		for (int index = 0; index < arr.length; index++) {
			sum += isNumberArmstrong(arr[index]);
			if (isNumberArmstrong(arr[index]) != 0)
				System.out.println(arr[index] + " ");
		}
		System.out.println("Sum of armstrong numbers is: " + sum);
	}

	static int isNumberArmstrong(int num1) {
		int num = 0, sum = 0;
		int temp = num1;
		while (temp > 0) {
			num = temp % 10;
			sum += (num * num * num);
			temp = temp / 10;
		}
		if (sum == num1)
			return num1;
		else
			return 0;
	}

	public static void main(String[] args) {
		int[] arr = { 153, 111, 124, 371};
		processData(arr);
	}
} 
