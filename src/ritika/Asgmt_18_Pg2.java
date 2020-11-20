package ritika;
/*Assignment-18 : 14th Nov'2020
Program : 2
String input = "hmPZ23i9Ws"
output = "239PZWhmis";
 */
public class Asgmt_18_Pg2 {
	
	void displayOutput(String input) {
		String lowerCase = "";
		String upperCase = "";
		String digits = "";
		for (int i=0; i<input.length();i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)==true)
				digits = digits+ch;
			else if	(Character.isUpperCase(input.charAt(i))==true)
				upperCase = upperCase+ch;
			else if (Character.isLowerCase(input.charAt(i))==true)
				lowerCase = lowerCase+ch;
		}
		System.out.println("Output is " + digits + upperCase + lowerCase);
	}
	public static void main(String[] args) {
		String input = "hmPZ23i9Ws";
		Asgmt_18_Pg2 program2 = new Asgmt_18_Pg2();
		program2.displayOutput(input);
	}
}
