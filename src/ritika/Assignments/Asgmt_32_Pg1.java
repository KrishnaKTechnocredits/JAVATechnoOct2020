package ritika.Assignments;

/*Assignment 32: 3rd Dec'2020

Program 1: return true if UpperCase characters count are more than lowercase else return false.
input : TechnoCrediTS
output : false
*/
public class Asgmt_32_Pg1 {

	boolean caseCount(String input) {
		int upCount = 0;
		int lowCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch))
				upCount++;
			else if (Character.isLowerCase(ch))
				lowCount++;
		}
		if (upCount > lowCount)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String input = "TechNoCrediTS";
		Asgmt_32_Pg1 program1 = new Asgmt_32_Pg1();
		System.out.println("Input is: " + input);
		System.out.println("Is uppercase count more than lowercase count? -> " + program1.caseCount(input));
	}
}
