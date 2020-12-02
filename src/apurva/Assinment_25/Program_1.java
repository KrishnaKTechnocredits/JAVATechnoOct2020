package apurva.Assinment_25;

/*sum of all numbers from give string.  

String msg = I have 15 years and 2 months of experience.

hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well.*/
public class Program_1 {
	int sum = 0;

	void getSumOfNumFromStringMsg(String input) {
		String[] arr = input.split("");
		String str = "";
		String temp = "";
		for (int i = 0; i < arr.length; i++) {
			str = arr[i];
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (Character.isDigit(ch))
					temp = temp + ch;
				else if (temp != "") {
					sum = sum + Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		System.out.println("String Input Message: " + input);
		System.out.println("Sum of Numbers from String: " + sum);
	}

	public static void main(String[] args) {
		String temp = "I have 15 years and 2 months of experience.";
		new Program_1().getSumOfNumFromStringMsg(temp);
	}
}