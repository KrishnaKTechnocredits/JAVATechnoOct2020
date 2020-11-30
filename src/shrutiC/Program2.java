package shrutiC;

/*
	Program 2: print all the words where digit sum is > 10. 
	String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
	output : te3ch2no9
*/

public class Program2 {

	void displayWordsWithSum(String[] array) {

		String str = "";
		int sumOfDigits = 0;

		System.out.print("Input array : { ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " , ");
			sumOfDigits = getSum(array[i]);
			if (sumOfDigits > 10) {
				str += array[i];
			}
		}
		System.out.println(" }");
		System.out.println("Words with digit having sum>10 : " + str);
	}

	int getSum(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				sum += Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		return sum;
	}

	public static void main(String[] args) {

		Program2 object = new Program2();
		String[] inputArray = { "Ma1s3gj3Pw", "r4f3sjk", "te3ch2no9", "sfjk4p4plpk" };
		object.displayWordsWithSum(inputArray);
	}

}