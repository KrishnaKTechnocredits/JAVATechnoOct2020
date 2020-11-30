package tejashree;

/*Program 2: print all the words where digit sum is > 10. 
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9
*/
public class Assignment27_Program2 {

	public static void main(String[] args) {
		Assignment27_Program2 assignment27_program2 = new Assignment27_Program2();
		String[] input ={"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
		assignment27_program2.print(input);
	}

	void print(String[] input) {
		System.out.println("String having sum of digits greater than 10 are: ");
		for (int index = 0; index < input.length; index++) {
			String str = input[index];
			boolean isDigit = false;
			int sumOfdigits = 0;
			for (int innerindex = 0; innerindex < str.length(); innerindex++) {
				char ch = str.charAt(innerindex);
				if (Character.isDigit(ch)) {
					isDigit = true;
					sumOfdigits += Character.getNumericValue(ch);
				}
			}
			if (sumOfdigits > 10) {
				System.out.println("String " +"'"+str+"'" + " and sum is:" + sumOfdigits);
			}

		}

	}
}
