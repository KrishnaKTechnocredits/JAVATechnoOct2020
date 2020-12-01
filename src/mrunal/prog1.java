package mrunal;
/*Assignment 27 -
 * Program 1: print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno */

public class prog1 {

		void sumofdigitgreaterthan10(String[] arr) {
			for (int index = 0; index < arr.length; index++) {
				String word = arr[index];
				int sum = 0;
				for (int index1 = 0; index1 < word.length(); index1++) {
					char ch = word.charAt(index1);
					if (Character.isDigit(ch)) {
						sum += Character.getNumericValue(ch);
					}
					if (sum > 10) {
						System.out.println("Digits in a word whose sum is greater than 10 is: " + word);
					}
				}
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String[] array = { "Ma1s3gj3Pw", "r4f3sjk", "te3ch2no9", "sfjk4p4plpk" };
			prog1 printWorddigitsum = new prog1();
			printWorddigitsum.sumofdigitgreaterthan10(array);
		}

	}
