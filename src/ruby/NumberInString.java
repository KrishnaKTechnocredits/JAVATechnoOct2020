package ruby;
/*
------------------------------------------
Assignment - 27: 23rd Nov'2020  

Program 1: print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno */

public class NumberInString {

	void findNumberInString(String[] input) {
		System.out.println("Program 1: Output");
		for (int index = 0; index < input.length; index++) {
			String str = input[index];
			boolean flag = false;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (Character.isDigit(ch)) {
					flag = true;
				}
			}
			if (!flag) {
				System.out.println(input[index]);
			}
		}
	}

	/*
	 * Program 2: print all the words where digit sum is > 10. String[] input =
	 * {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"}; output : te3ch2no9
	 */

	void findSumOfNum(String[] input) {
		System.out.println("Program 2: Output");
		for (int index = 0; index < input.length; index++) {
			String str = input[index];
			String temp = "";
			int sum = 0;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (Character.isDigit(ch)) {
					temp += ch;
				}
				if (!temp.equals("")) {
					sum += Integer.parseInt(temp);
					temp = "";
				}
			}
			if (!temp.equals("")) {
				sum += Integer.parseInt(temp);
				temp = "";
			}
			if (sum > 10) {
				System.out.println(input[index]);
			}
		}
	}

	public static void main(String[] args) {
		NumberInString numInString = new NumberInString();
		String[] input = { "Masgj3Pw", "r4fsjk", "techno", "sfjk44lk" };
		numInString.findNumberInString(input);
		String[] input1 = { "Ma1s3gj3Pw", "r4f3sjk", "te3ch2no9", "sfjk4p4plpk","3Test67U8"};
		numInString.findSumOfNum(input1);
	}
}
