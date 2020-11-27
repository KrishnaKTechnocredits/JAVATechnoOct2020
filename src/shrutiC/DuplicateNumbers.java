package shrutiC;

public class DuplicateNumbers {

	public static void main(String[] args) {

		int[] numArray = { 10, 12, 55, 32, 17, 12, 32 };

		for (int index = 0; index < numArray.length; index++) {
			for (int i = index + 1; i < numArray.length; i++) {
				if (numArray[i] == numArray[index])
					System.out.println("Duplicate number in array is : " + numArray[index]);
			}
		}

	}

}
