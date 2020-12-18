package apurva;

/*sum of all numbers in a give string 
input: te123ch9kj8 
output : 123 + 9 + 8 = 140*/
public class Program_2 {
	void sumOfNumFromString(String input) {
		int sum = 0;
		String str = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				str = str + ch;
			else if (str != "") {
				sum = sum + Integer.parseInt(str);
				str = "";
			}
		}
		if(str != "") {
			sum = sum + Integer.parseInt(str);
		}
		System.out.println("String Input: " + input);
		System.out.println("Sum of numbers in string: " + sum);
	}

	public static void main(String[] args) {
		new Program_2().sumOfNumFromString("te123ch9kj8");
	}
} 