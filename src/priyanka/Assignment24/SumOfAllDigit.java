package priyanka.Assignment24;

/*program 1: sum of all digits from a given string  
input: te1ch9kj8 
output:= 18
*/
public class SumOfAllDigit {

	void isDigit(String str) {
		boolean flag = false;
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			flag = Character.isDigit(ch);
			if (flag)
				sum = sum + Character.getNumericValue(ch);
		}
		System.out.println(" Sum of all digits from a given string : " + sum);
	}

	public static void main(String[] args) {
		SumOfAllDigit sumOfAllDigit = new SumOfAllDigit();
		String str = "te1ch9kj8";
		sumOfAllDigit.isDigit(str);
	}
}
