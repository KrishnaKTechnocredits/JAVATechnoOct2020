package ruby;
/*Assignment - 25 : 22nd Nov'2020 

Program 1: sum of all numbers from give string.  

String msg = I have 15 years and 2 months of experience.

hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well. 

 Raise PR before tuesday EOD*/

public class SumOfNumInStatement {

	void sumOfNum(String input) {
		String[] arr = input.split(" ");
		String temp = "";
		int num = 0;
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (Character.isDigit(ch))
					temp += ch;
				else if (!temp.equals("")) {
					num += Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		if (!temp.equals("")) {
			num += Integer.parseInt(temp);
			temp = "";
			System.out.println("Sum of all numbers in Statement is " + num);
		}
	}

	public static void main(String[] args) {
		SumOfNumInStatement sum = new SumOfNumInStatement();
		sum.sumOfNum("I have 15 years and 2 months of experience 3");

	}

}