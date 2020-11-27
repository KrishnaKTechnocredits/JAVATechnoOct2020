package shrutiC;

public class Program2 {

	void findFreqOfNumInArray(int[] array, int number) {
		int numCounter = 0;
		for (int index = 0; index < array.length; index++) {
			if (number == array[index])
				numCounter++;
		}
		if (numCounter == 0)
			System.out.println("Given number " + number + " is not present in predefined array");
		else
			System.out.println("Given number " + number + " is present in predefined array with frequency "
								+ numCounter);
	}

	public static void main(String[] args) {

		Program2 program = new Program2();
		int[] inputArray = { 10, 3, 9, -99, 81, 3, -11 };
		program.findFreqOfNumInArray(inputArray,33);
		program.findFreqOfNumInArray(inputArray, 3);

	}

}
