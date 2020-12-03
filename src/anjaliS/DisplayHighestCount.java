package anjaliS;

public class DisplayHighestCount {
	boolean printTrueOrFalse(String s) {
		int count = 0;
		int count1 = 0;
		for (int index = 0; index < s.length(); index++) {
			char ch = s.charAt(index);
			if (Character.isUpperCase(ch))
				count++;
			else if (Character.isLowerCase(ch))
				count1++;

		}
		if (count > count1)
			return true;

		return false;
	}

	public static void main(String[] args) {
		DisplayHighestCount displayhighestcount = new DisplayHighestCount();
		String s = "TeCHNOCReDits";
		String s1 = "techNocredIts";
		System.out.println(displayhighestcount.printTrueOrFalse(s));
		System.out.println(displayhighestcount.printTrueOrFalse(s1));

	}

}
