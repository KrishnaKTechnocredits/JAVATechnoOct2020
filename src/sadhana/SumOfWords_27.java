package sadhana;

/*Assihnment_27
Program 2: print all the words where digit sum is > 10. 
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9*/

public class SumOfWords_27 {

	void processData(String[] arr) {
	
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				char ch = arr[i].charAt(j);

				if (Character.isDigit(ch)) {
					sum = sum + Character.getNumericValue(ch);
				}
			}
			if (sum > 10) {
				System.out.println(arr[i]);

			}
			sum = 0;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "Ma1s3gj3Pw", "r4f3sjk", "te3ch2no9", "sfjk4p4plpk" };
		SumOfWords_27 sumOfWords = new SumOfWords_27();
		sumOfWords.processData(input);

	}

}

