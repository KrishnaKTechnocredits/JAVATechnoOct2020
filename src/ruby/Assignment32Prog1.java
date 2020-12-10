package ruby;
/*Assignment 32: 3rd Dec'2020 */
public class Assignment32Prog1 {

/*Program 1:  return true if UpperCase characters count are more than lowercase else return false.
			input : TechnoCrediTS
			output : false*/
	boolean findCaseCount(String word) {
		int upperCount = 0, lowerCount = 0;
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperCount++;
			} else if (Character.isLowerCase(ch)) {
				lowerCount++;
			}
		}
		if (upperCount > lowerCount)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Assignment32Prog1 assign = new Assignment32Prog1();
		boolean flag = assign.findCaseCount("TechnoCrediTS");
		if (flag)
			System.out.println("UpperCase characters count are more than lowercase");
		else
			System.out.println("Lowercase characters count are more than UpperCase");	
		}
}
