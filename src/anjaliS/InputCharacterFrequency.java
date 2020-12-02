package anjaliS;

import java.util.Scanner;
    public class InputCharacterFrequency {

		void inputFrequency(String str) {
			for (int i = 0; i < str.length(); i++) {
				char char1 = str.charAt(i);
				int count = 0;
				for (int j = 0; j < str.length(); j++) {
					char char2 = str.charAt(j);
					if (char2 == char1)
						count++;
				}
				System.out.println("Count of " + char1 + "->" + count);
			}
		}

		public static void main(String[] arg) {
			InputCharacterFrequency inputcharacterfrequency = new InputCharacterFrequency();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the name");
			String str = scanner.next();
			inputcharacterfrequency.inputFrequency(str);
		}

	}

