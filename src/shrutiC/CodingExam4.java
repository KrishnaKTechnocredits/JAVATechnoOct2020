package shrutiC;

public class CodingExam4 {

	void findSimilarNumInArray(int[] array1, int[] array2) {

		String similarNum = "";

		for (int i = 0; i < array1.length; i++) {

			if (array1[i] == array2[i])
				similarNum = similarNum + " " + Integer.toString(array1[i]);
		}
		System.out.println("Similar digits in array are : " + similarNum);
	}

	void checkIfStringAreIdentical(String inputStr1, String inputStr2) {
		int counter = 0;
		for (int i = 0; i < inputStr1.length(); i++) {
			if (inputStr1.charAt(i) != inputStr2.charAt(i))
				counter++;
		}
		if (counter > 0)
			System.out.println("Given input Strings " + inputStr1 + " and " + inputStr2 + " are not identical");
		else
			System.out.println("Given input Strings " + inputStr1 + " and " + inputStr2 + " are identical");

	}

	public static void main(String[] args) {
		CodingExam4 exam4 = new CodingExam4();

		// Program 1
		int[] arrayNum1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int[] arrayNum2 = { 1, 0, 6, 15, 6, 4, 7, 0 };
		exam4.findSimilarNumInArray(arrayNum1, arrayNum2);
		
		//Program 2
		System.out.println("======================================================================================");
		exam4.checkIfStringAreIdentical("pune", "pune");
		exam4.checkIfStringAreIdentical("technocredits", "teChnoCreditS");
	}

}
