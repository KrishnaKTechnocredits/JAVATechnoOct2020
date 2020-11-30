package mrunal;
/*Program 1: sum of all numbers from give string.  

String msg = I have 15 years and 2 months of experience.

hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well. */

public class Sum_Of_All_Num_givenString{
	void messageNumSum(String msg) {
		System.out.println("Message: " + msg);
		int sum = 0;
		String dig = "";
		for (int index = 0; index < msg.length(); index++) {
			char ch = msg.charAt(index);
			if (Character.isDigit(ch)) {
				dig = dig + ch;
			} else if (dig.length() > 0) {
				sum += Integer.parseInt(dig);
				System.out.println("Number is : " + dig);
				dig = "";
			}
		}
		if (dig.length() > 0) {
			sum += Integer.parseInt(dig);
		}
		System.out.println("Sum of numbers is " + sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_Of_All_Num_givenString msgnumbersum = 
				new Sum_Of_All_Num_givenString();
		msgnumbersum.messageNumSum("I have 15 years and 2 months of experience");

	}

}
