package shrutiC;

public class FindSecondMaxNum {

	void getSecoundMaxNumInArray(int arrayNum[]) {
		int max = arrayNum[0];
		int secondMaxNum = 0;
		System.out.print("Input array : {" + max);
		for (int i = 1; i < arrayNum.length; i++) {
			System.out.print(" " + arrayNum[i]);
			if (arrayNum[i] > max) {
				secondMaxNum = max;
				max = arrayNum[i];
			}
		}
		System.out.println("}");

		System.out.println("Second max number from given array is : " + secondMaxNum);
	}

	public static void main(String[] args) {

		FindSecondMaxNum object = new FindSecondMaxNum();
		int[] array = { 20, 10, 56, 7, 15, 80 };
		object.getSecoundMaxNumInArray(array);

	}

}
