
/*Assignment - 25 : 22nd Nov'2020 

Program 1: sum of all numbers from give string.  

String msg = I have 15 years and 2 months of experience.

hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well. 
*/
package suvela;

public class Assignment25 {
	void getSum(String input) {
		int sum = 0;
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			String s = arr[index];
			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);
				if (Character.isDigit(ch)) {
					sum = sum+ Integer.parseInt(s);
					break;
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		String input = "I have 15 years and 2 months of experience";
		new Assignment25().getSum(input);
	}

}
