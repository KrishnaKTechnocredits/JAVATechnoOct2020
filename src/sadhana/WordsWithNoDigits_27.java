package sadhana;

public class WordsWithNoDigits_27 {

	void processData(String[] arr) {

		boolean flag = false;
		for (int index = 0; index < arr.length; index++) {

			for (int j = 0; j < arr[index].length(); j++) {

				char ch = arr[index].charAt(j);

				if (Character.isDigit(ch)) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(arr[index]);
			}
			flag = false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] input = { "Masgj3Pw", "r4fsjk", "techno", "tefg", "sfjk44lk" };
		WordsWithNoDigits_27 wordsWithNoDigits_27 = new WordsWithNoDigits_27();
		wordsWithNoDigits_27.processData(input);

	}
}

