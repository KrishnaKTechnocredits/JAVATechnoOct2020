package nagendra;

/*Program 2: WAP to find two String are identical or not
input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";
output 1: both string are not identical
input 2:
String s1 = "pune";
String s2 = "pune";
output 2: both string are identical
*/

public class CodingExam4A {
	
	void getIdenticalString(String userInput, String input2) {
		boolean flag = false;

		if (userInput.equalsIgnoreCase(input2)) {
			flag = true;
		}

		if (flag)
			System.out.println("Both String are Identical");
		else {
			System.out.println("Both String are Not identical");
		}
	}
	public static void main(String[] args) {
		CodingExam4A object = new CodingExam4A();
		String s1 = "pgne";
		String s2 = "pune";
		object.getIdenticalString(s1, s2);
		
	}

}
