package suvela;

public class Assignment17 {
	void findfrequency(String word) {
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			int counter = 0;
			int i = word.indexOf(ch);
			if (i == index) {
				for (int j = 0; j < word.length(); j++) {
					if (word.charAt(j) == ch)
						counter++;
				}
				System.out.println("character " + ch + " is present " + counter + " times");
			}

		}
	}

	public static void main(String[] args) {
		Assignment17 assign = new Assignment17();
		assign.findfrequency("aakasnha");
	}

}
