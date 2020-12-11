package shrutiC;

import java.util.Arrays;

public class AdditionOfArmstrongNum {

	boolean isArmstrongNum(int number) {
		int num = 0;
		int sumOfCubes = 0;

		String string = Integer.toString(number);
		for (int i = 0; i < string.length(); i++) {
			num = Integer.parseInt(Character.toString(string.charAt(i)));
			sumOfCubes += (num * num * num);
		}
		if (sumOfCubes == number)
			return true;
		else
			return false;

	}

	void addArmstrongNum(int[] array) {
		int sum = 0, num = 0;
		System.out.println("Input array : "+Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			num = array[i];
			if (isArmstrongNum(num))
				sum += num;
		}
		System.out.println("Addition : " + sum);
	}

	public static void main(String[] args) {

		AdditionOfArmstrongNum object = new AdditionOfArmstrongNum();
		int[] array = {153, 111, 124, 371};
		object.addArmstrongNum(array);
	}

}
