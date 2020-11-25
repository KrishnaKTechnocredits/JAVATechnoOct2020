package ritika;
/*Assignment - 27: 23rd Nov'2020

Program 2: print all the words where digit sum is > 10.
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9
*/
public class Asgmt_27_Pg_2 {
	
	static void printWordsWithDigitSumGreaterThan10(String[] inputArray) {
		for (int index=0; index<inputArray.length; index++) {
			String word = inputArray[index];
			int sum = 0;
			for (int innerIndex=0; innerIndex<word.length(); innerIndex++) {
				char ch = word.charAt(innerIndex);
				if (Character.isDigit(ch)) {
					sum = sum + Character.getNumericValue(ch);
				}
			}
			if (sum>10)
				System.out.print(word+ " ");
		}
	}
	
	public static void main(String[] args) {
		String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk", "3sdh7sbc05"};
		System.out.println("Words with digits sum greater than 10 in given array are: ");
		Asgmt_27_Pg_2.printWordsWithDigitSumGreaterThan10(input);
	}
}
