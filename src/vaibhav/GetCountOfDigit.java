package vaibhav;

public class GetCountOfDigit {
	/*Program 2: print all the words where digit sum is > 10. 
		String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
		output : te3ch2no9
	*/
	public static void getSum(String [] input) {
		for(int index = 0 ; index < input.length; index++) {
			String str = input[index];
			int sum = 0;
			for(int innerIndex = 0 ; innerIndex < str.length(); innerIndex++) {
				char ch = str.charAt(innerIndex);
				if (Character.isDigit(ch)) {
					sum += Character.getNumericValue(ch);
				}
			}
			if (sum > 10)
				System.out.println("String is :: "+str);
		}
		
	}
	
	public static void main(String[] args) {
		String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
		GetCountOfDigit.getSum(input);
	}

}
