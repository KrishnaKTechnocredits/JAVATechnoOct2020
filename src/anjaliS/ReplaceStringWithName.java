package anjaliS;

public class ReplaceStringWithName {
	void displayName(String str) {
		int index1 = str.lastIndexOf("Hi");
		String subString1 = str.substring(0, index1);
		int index2 = subString1.lastIndexOf("Hi");
		String subString2 = subString1.substring(index2);
		System.out.println(str.substring(0, index2) + subString2.replace("Hi", "Ashvi") + str.substring(index1));
	}

	public static void main(String[] args) {
		ReplaceStringWithName ReplaceStringWithName = new ReplaceStringWithName();
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		ReplaceStringWithName.displayName(input);
	}

}
