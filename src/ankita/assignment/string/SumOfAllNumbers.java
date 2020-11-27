/*program 2 : sum of all numbers in a give string 
input: te123ch9kj8 
output : 123 + 9 + 8 = 140
*/
package ankita.assignment.string;

public class SumOfAllNumbers {
	void getSumOfAllNumbers(String str) {
		int sum = 0;
		String str1 = "";

		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				str1 += Character.toString(str.charAt(i));
			}
			else if(str1!= "") {
				sum = sum + Integer.parseInt(str1);
				str1 = "";
			}
		}
		if(str1!="")
			sum = sum + Integer.parseInt(str1);		
		System.out.println("Input : " + str);
		System.out.println("Sum of All numbers : " + sum);
	}

	public static void main(String[] args) {
		String str = "te123ch9kj8";
		SumOfAllNumbers allNumbers = new SumOfAllNumbers();
		allNumbers.getSumOfAllNumbers(str);
	}
}