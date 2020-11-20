package anjaliS;

public class MaxRepeatWord {
	int max = 0;
	String maxWord = null;

	void maxRepeatedWord(String[] name) {

		for (int i = 0; i < name.length; i++) {
			int count = 1;
			String str = name[i];

			if (!str.equals("")) {
				for (int j = i + 1; j < name.length; j++) {
					if (name[i].equals(name[j]))
						count++;
				}
			}

			if (max < count) {
				max = count;
				maxWord = name[i];
			}
		}

		System.out.println("Max repeating Word is " + maxWord);
		System.out.println("Most repeated count is " + max);

	}

	public static void main(String[] args) {
		MaxRepeatWord maxrepeatword = new MaxRepeatWord();
		String[] array = { "Anjali", "Anjali", "Shivani", "Anjali", "Shivani" };
		maxrepeatword.maxRepeatedWord(array);
	}

}
