package deepak.assignment27;

public class Program_2 {

	void processData(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			String digit = "";
			int sum = 0;
			for (int j = 0; j < word.length(); j++) {
				char ch = word.charAt(j);
				if (Character.isDigit(ch)) {
					digit = digit + ch;
					sum = sum + Integer.parseInt(digit);
					digit = "";
				}
			}
			if (sum > 10) {
				System.out.println("Word havin sum of digits greater than 10 :" + word);
			}
		}
	}

	public static void main(String[] args) {
		Program_2 program_2 = new Program_2();
		String[] input = { "Ma1s3gj3Pw", "r4f3sjk", "te3ch2no9", "sfjk4p4plpk" };
		
		program_2.processData(input);
	}
}