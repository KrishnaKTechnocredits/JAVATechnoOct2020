package poojap;

public class Assignment27 {

	void FindWord(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			boolean flag = true;
			for (int j = 0; j < word.length(); j++) {
				char ch = word.charAt(j);
				if (Character.isDigit(ch)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(word);
			}
		}
	}

	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		String[] input = { "Masgj3Pw", "r4fsjk", "techno", "sfjk44lk" };
		assignment27.FindWord(input);
	}
}
