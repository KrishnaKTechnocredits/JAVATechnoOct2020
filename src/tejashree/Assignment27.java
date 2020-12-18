package tejashree;

public class Assignment27 {
	/*
	 * Program 1: print all the words which does't have any digit. String[] input =
	 * {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"}; output : techno
	 */

	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		String[] input = { "Masgj3Pw", "r4fsjk", "techno", "sfjk44lk" };
		assignment27.printStringwithoutDigits(input);
	}

	public void printStringwithoutDigits(String[] input) {
		System.out.println("Strings which does not contain digits from given array are:");
		for (int index = 0; index < input.length; index++) {
			String str = input[index];
			boolean isDigit = false;

			for (int innerindex = 0; innerindex < str.length(); innerindex++) {
				char ch = str.charAt(innerindex);
				if (Character.isDigit(ch)) {
					isDigit = true;
					break;
				}
			}
			if (!isDigit) {
				System.out.println(str);
			}
		}

	}

}
